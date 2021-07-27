package com.attendance.api.presentation.handler

import org.springframework.security.access.AccessDeniedException
import org.springframework.security.web.access.AccessDeniedHandler
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

class AttendanceAccessDeniedHandler : AccessDeniedHandler {
    override fun handle(request: HttpServletRequest, response: HttpServletResponse, accessDeniedException: AccessDeniedException) {
        response.status = HttpServletResponse.SC_FORBIDDEN
    }
}