/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.attendance.api.infrastructure.database.mapper

import java.sql.JDBCType
import java.time.LocalTime
import org.mybatis.dynamic.sql.SqlTable

object AttendanceSettingDynamicSqlSupport {
    object AttendanceSetting : SqlTable("attendance_setting") {
        val settingId = column<Int>("setting_id", JDBCType.INTEGER)

        val attendaceId = column<Int>("attendace_id", JDBCType.INTEGER)

        val scheduledWorkingDays = column<Byte>("scheduled_working_days", JDBCType.TINYINT)

        val actualWorkingDays = column<Byte>("actual_working_days", JDBCType.TINYINT)

        val remainingPaidDays = column<Byte>("remaining_paid_days", JDBCType.TINYINT)

        val paidVacationDigestionDays = column<Long>("paid_vacation_digestion_days", JDBCType.DECIMAL)

        val specialVacationDays = column<Long>("special_vacation_days", JDBCType.DECIMAL)

        val absenceDays = column<Long>("absence_days", JDBCType.DECIMAL)

        val standardStartTime = column<LocalTime>("standard_start_time", JDBCType.TIME)

        val standardEndTime = column<LocalTime>("standard_end_time", JDBCType.TIME)
    }
}