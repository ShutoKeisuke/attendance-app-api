package com.attendance.api.application.service

import com.attendance.api.domain.model.AttendanceBasicInfo
import com.attendance.api.domain.repository.AttendanceRepository
import org.springframework.stereotype.Service

@Service
class AttendanceService(
        private val attendanceRepository: AttendanceRepository
) {
    fun getAttendanceBasicInfoByUserId(userId: String, year: Int, month: Int): AttendanceBasicInfo {
        return attendanceRepository.getAttendanceBasicInfoByUserId(userId, year, month)
    }
}