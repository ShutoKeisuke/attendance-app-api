package com.attendance.api.presentation.handler

import org.springframework.security.core.AuthenticationException
import org.springframework.security.web.AuthenticationEntryPoint
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

class AttendanceAuthenticationEntryPoint : AuthenticationEntryPoint {
    override fun commence(request: HttpServletRequest, response: HttpServletResponse, authException: AuthenticationException) {
        response.status = HttpServletResponse.SC_UNAUTHORIZED
    }
}