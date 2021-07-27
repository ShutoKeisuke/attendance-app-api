/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.attendance.api.infrastructure.database.record

import java.time.LocalDate
import java.time.LocalTime

data class BreakTimeDetailRecord(
    var breakTimeId: Int? = null,
    var attendanceId: Int? = null,
    var date: LocalDate? = null,
    var breakType: String? = null,
    var breakTime: LocalTime? = null
)