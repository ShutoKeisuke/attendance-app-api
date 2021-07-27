package com.attendance.api.presentation.handler

import org.springframework.security.core.AuthenticationException
import org.springframework.security.web.authentication.AuthenticationFailureHandler
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

class AttendanceAuthenticationFailureHandler : AuthenticationFailureHandler {
    override fun onAuthenticationFailure(request: HttpServletRequest, response: HttpServletResponse, exception: AuthenticationException) {
        response.status = HttpServletResponse.SC_UNAUTHORIZED
    }
}