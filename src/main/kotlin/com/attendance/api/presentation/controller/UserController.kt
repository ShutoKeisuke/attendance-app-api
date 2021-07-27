package com.attendance.api.presentation.controller

import com.attendance.api.application.service.UserService
import com.attendance.api.domain.model.UserBasicInfo
import com.attendance.api.domain.model.UserBasicInfoExpectPassword
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("user")
class UserController(
        private val userService: UserService
) {

    @GetMapping("basicInfo")
    fun getUserBasicInfoByEmail(@RequestParam("email") email: String): UserBasicInfoExpectPassword? {
        val  record = userService.getUserBasicInfoExceptPasswordByEmail(email)
        return userService.getUserBasicInfoExceptPasswordByEmail(email)
    }
}