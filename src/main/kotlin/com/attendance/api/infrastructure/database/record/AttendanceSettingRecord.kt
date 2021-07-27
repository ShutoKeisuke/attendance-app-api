/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.attendance.api.infrastructure.database.record

import java.time.LocalTime

data class AttendanceSettingRecord(
    var settingId: Int? = null,
    var attendaceId: Int? = null,
    var scheduledWorkingDays: Byte? = null,
    var actualWorkingDays: Byte? = null,
    var remainingPaidDays: Byte? = null,
    var paidVacationDigestionDays: Long? = null,
    var specialVacationDays: Long? = null,
    var absenceDays: Long? = null,
    var standardStartTime: LocalTime? = null,
    var standardEndTime: LocalTime? = null
)