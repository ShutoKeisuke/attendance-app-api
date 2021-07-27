/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.attendance.api.infrastructure.database.mapper

import java.sql.JDBCType
import org.mybatis.dynamic.sql.SqlTable

object WorkStyleListDynamicSqlSupport {
    object WorkStyleList : SqlTable("work_style_list") {
        val workStyle = column<String>("work_style", JDBCType.VARCHAR)
    }
}