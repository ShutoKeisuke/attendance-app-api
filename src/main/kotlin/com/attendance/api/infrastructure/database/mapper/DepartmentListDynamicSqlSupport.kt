/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.attendance.api.infrastructure.database.mapper

import java.sql.JDBCType
import org.mybatis.dynamic.sql.SqlTable

object DepartmentListDynamicSqlSupport {
    object DepartmentList : SqlTable("department_list") {
        val department = column<String>("department", JDBCType.VARCHAR)
    }
}