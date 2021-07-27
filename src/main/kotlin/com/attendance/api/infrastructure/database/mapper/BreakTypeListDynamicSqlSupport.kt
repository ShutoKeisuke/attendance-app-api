/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.attendance.api.infrastructure.database.mapper

import java.sql.JDBCType
import org.mybatis.dynamic.sql.SqlTable

object BreakTypeListDynamicSqlSupport {
    object BreakTypeList : SqlTable("break_type_list") {
        val breakType = column<String>("break_type", JDBCType.VARCHAR)
    }
}