/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.attendance.api.infrastructure.database.mapper

import java.sql.JDBCType
import org.mybatis.dynamic.sql.SqlTable

object EmploymentListDynamicSqlSupport {
    object EmploymentList : SqlTable("employment_list") {
        val employment = column<String>("employment", JDBCType.VARCHAR)
    }
}