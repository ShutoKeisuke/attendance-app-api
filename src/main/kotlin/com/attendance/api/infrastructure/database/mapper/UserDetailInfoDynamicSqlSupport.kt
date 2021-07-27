/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.attendance.api.infrastructure.database.mapper

import java.sql.JDBCType
import java.time.LocalDate
import org.mybatis.dynamic.sql.SqlTable

object UserDetailInfoDynamicSqlSupport {
    object UserDetailInfo : SqlTable("user_detail_info") {
        val userDetailId = column<Int>("user_detail_id", JDBCType.INTEGER)

        val userId = column<String>("user_id", JDBCType.VARCHAR)

        val employmentStatus = column<String>("employment_status", JDBCType.VARCHAR)

        val department = column<String>("department", JDBCType.VARCHAR)

        val hireDate = column<LocalDate>("hire_date", JDBCType.DATE)

        val retirementDate = column<LocalDate>("retirement_date", JDBCType.DATE)

        val retirementFlg = column<Byte>("retirement_flg", JDBCType.TINYINT)

        val registrationDate = column<LocalDate>("registration_date", JDBCType.DATE)

        val updateDate = column<LocalDate>("update_date", JDBCType.DATE)
    }
}