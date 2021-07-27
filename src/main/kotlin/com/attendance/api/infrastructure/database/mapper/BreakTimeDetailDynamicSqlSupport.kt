/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.attendance.api.infrastructure.database.mapper

import java.sql.JDBCType
import java.time.LocalDate
import java.time.LocalTime
import org.mybatis.dynamic.sql.SqlTable

object BreakTimeDetailDynamicSqlSupport {
    object BreakTimeDetail : SqlTable("break_time_detail") {
        val breakTimeId = column<Int>("break_time_id", JDBCType.INTEGER)

        val attendanceId = column<Int>("attendance_id", JDBCType.INTEGER)

        val date = column<LocalDate>("date", JDBCType.DATE)

        val breakType = column<String>("break_type", JDBCType.VARCHAR)

        val breakTime = column<LocalTime>("break_time", JDBCType.TIME)
    }
}