package com.attendance.api.domain.repository

import com.attendance.api.domain.model.AttendanceBasicInfo

interface AttendanceRepository {
    fun getAttendanceBasicInfoByUserId(userId: String, year: Int, month: Int): AttendanceBasicInfo
}