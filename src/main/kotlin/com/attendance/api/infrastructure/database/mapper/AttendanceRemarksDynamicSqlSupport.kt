/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.attendance.api.infrastructure.database.mapper

import java.sql.JDBCType
import java.time.LocalDate
import org.mybatis.dynamic.sql.SqlTable

object AttendanceRemarksDynamicSqlSupport {
    object AttendanceRemarks : SqlTable("attendance_remarks") {
        val remarksId = column<Int>("remarks_id", JDBCType.INTEGER)

        val attendanceId = column<Int>("attendance_id", JDBCType.INTEGER)

        val date = column<LocalDate>("date", JDBCType.DATE)

        val remarks = column<String>("remarks", JDBCType.VARCHAR)
    }
}