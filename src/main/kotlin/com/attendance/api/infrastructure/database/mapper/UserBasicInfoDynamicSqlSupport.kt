/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.attendance.api.infrastructure.database.mapper

import java.sql.JDBCType
import java.time.LocalDate
import org.mybatis.dynamic.sql.SqlTable

object UserBasicInfoDynamicSqlSupport {
    object UserBasicInfo : SqlTable("user_basic_info") {
        val userId = column<String>("user_id", JDBCType.VARCHAR)

        val userLastName = column<String>("user_last_name", JDBCType.VARCHAR)

        val userLastNameReading = column<String>("user_last_name_reading", JDBCType.VARCHAR)

        val userFirstName = column<String>("user_first_name", JDBCType.VARCHAR)

        val userFirstNameReading = column<String>("user_first_name_reading", JDBCType.VARCHAR)

        val birthday = column<LocalDate>("birthday", JDBCType.DATE)

        val age = column<Byte>("age", JDBCType.TINYINT)

        val postalCode = column<Int>("postal_code", JDBCType.INTEGER)

        val address = column<String>("address", JDBCType.VARCHAR)

        val email = column<String>("email", JDBCType.VARCHAR)

        val password = column<String>("password", JDBCType.VARCHAR)

        val roleType = column<String>("role_type", JDBCType.VARCHAR)
    }
}