/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.attendance.api.infrastructure.database.mapper

import java.sql.JDBCType
import java.time.LocalDate
import java.time.LocalTime
import org.mybatis.dynamic.sql.SqlTable

object PaidVacationDynamicSqlSupport {
    object PaidVacation : SqlTable("paid_vacation") {
        val paidVacationId = column<Int>("paid_vacation_id", JDBCType.INTEGER)

        val attendanceId = column<Int>("attendance_id", JDBCType.INTEGER)

        val date = column<LocalDate>("date", JDBCType.DATE)

        val paidVacationTime = column<LocalTime>("paid_vacation_time", JDBCType.TIME)
    }
}