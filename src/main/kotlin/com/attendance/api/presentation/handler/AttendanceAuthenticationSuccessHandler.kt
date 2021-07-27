package com.attendance.api.presentation.handler

import org.springframework.security.core.Authentication
import org.springframework.security.web.authentication.AuthenticationSuccessHandler
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

class AttendanceAuthenticationSuccessHandler : AuthenticationSuccessHandler {
    override fun onAuthenticationSuccess(request: HttpServletRequest, response: HttpServletResponse, authentication: Authentication) {
        response.status = HttpServletResponse.SC_OK
    }
}