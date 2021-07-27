package com.attendance.api.presentation.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("test")
class TestController {

    @GetMapping("")
    fun testAuthenticated(): String {
        return "server data"
    }
}