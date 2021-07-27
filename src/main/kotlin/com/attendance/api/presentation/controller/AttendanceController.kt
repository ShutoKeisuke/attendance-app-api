package com.attendance.api.presentation.controller

import com.attendance.api.application.service.AttendanceService
import com.attendance.api.domain.model.AttendanceBasicInfo
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("attendance")
class AttendanceController(
        private val attendanceService: AttendanceService
) {

    @GetMapping("")
    fun getAttendanceBasicInfoByUserId(@RequestParam("userId") userId: String,
                                        @RequestParam("year") year: Int,
                                        @RequestParam("month") month: Int): AttendanceBasicInfo {
        println("Controller : getAttendanceBasicInfoByUserIdC")
        println(userId)
        println(year)
        println(month)
        return attendanceService.getAttendanceBasicInfoByUserId(userId, year, month)
    }
}