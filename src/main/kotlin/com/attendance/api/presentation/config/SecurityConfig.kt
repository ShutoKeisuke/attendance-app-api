package com.attendance.api.presentation.config

import com.attendance.api.application.service.UserService
import com.attendance.api.application.service.security.AttendanceUserDetailsService
import com.attendance.api.presentation.handler.AttendanceAccessDeniedHandler
import com.attendance.api.presentation.handler.AttendanceAuthenticationEntryPoint
import com.attendance.api.presentation.handler.AttendanceAuthenticationFailureHandler
import com.attendance.api.presentation.handler.AttendanceAuthenticationSuccessHandler
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.web.cors.CorsConfiguration
import org.springframework.web.cors.CorsConfigurationSource
import org.springframework.web.cors.UrlBasedCorsConfigurationSource

@EnableWebSecurity
class SecurityConfig(private val userService: UserService) : WebSecurityConfigurerAdapter() {
    override fun configure(http: HttpSecurity) {
        http.authorizeRequests()
//                .mvcMatchers("/login", "/error/**", "/test/**").permitAll()
                .mvcMatchers("/login", "/error/**").permitAll()
                .mvcMatchers("/admin/**").hasAuthority("ADMIN")
//                .mvcMatchers("/attendance/**").hasAuthority("USER")
//                .mvcMatchers("/test/**").hasAuthority("ADMIN")
                .anyRequest().authenticated()
                .and()
                .csrf().disable()
                .formLogin()
                .loginProcessingUrl("/login")
                .usernameParameter("email")
                .passwordParameter("pass")
                .successHandler(AttendanceAuthenticationSuccessHandler())
                .failureHandler(AttendanceAuthenticationFailureHandler())
                .and()
                .exceptionHandling()
                .authenticationEntryPoint(AttendanceAuthenticationEntryPoint())
                .accessDeniedHandler(AttendanceAccessDeniedHandler())
                .and()
                .logout()
                .logoutUrl("/logout")
                .and()
                .cors()
                .configurationSource(corsConfigurationSource())
    }

    override fun configure(auth: AuthenticationManagerBuilder) {
        auth.userDetailsService(AttendanceUserDetailsService(userService)).passwordEncoder(BCryptPasswordEncoder())
    }

    private fun corsConfigurationSource(): CorsConfigurationSource {
        val corsConfiguration = CorsConfiguration()
        corsConfiguration.addAllowedMethod(CorsConfiguration.ALL)
        corsConfiguration.addAllowedHeader(CorsConfiguration.ALL)
        corsConfiguration.addAllowedOrigin("http://localhost:3000")
        corsConfiguration.allowCredentials = true

        val corsConfigurationSource = UrlBasedCorsConfigurationSource()
        corsConfigurationSource.registerCorsConfiguration("/**", corsConfiguration)

        return corsConfigurationSource
    }
}