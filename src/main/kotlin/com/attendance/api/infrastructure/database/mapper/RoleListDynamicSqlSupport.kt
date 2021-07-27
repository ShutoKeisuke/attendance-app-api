/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.attendance.api.infrastructure.database.mapper

import java.sql.JDBCType
import org.mybatis.dynamic.sql.SqlTable

object RoleListDynamicSqlSupport {
    object RoleList : SqlTable("role_list") {
        val role = column<String>("role", JDBCType.VARCHAR)
    }
}