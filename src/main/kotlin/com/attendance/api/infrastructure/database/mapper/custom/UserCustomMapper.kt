package com.attendance.api.infrastructure.database.mapper.custom

import com.attendance.api.infrastructure.database.record.custom.UserBasicInfoExceptPasswordRecord
import org.apache.ibatis.annotations.*
import org.apache.ibatis.type.JdbcType
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider
import org.mybatis.dynamic.sql.util.SqlProviderAdapter

@Mapper
interface UserCustomMapper {
    @SelectProvider(type= SqlProviderAdapter::class, method="select")
    @Results(id="UserBasicInfoExpectPasswordRecordResult", value = [
        Result(column="user_id", property="userId", jdbcType= JdbcType.VARCHAR, id=true),
        Result(column="user_last_name", property="userLastName", jdbcType= JdbcType.VARCHAR),
        Result(column="user_last_name_reading", property="userLastNameReading", jdbcType= JdbcType.VARCHAR),
        Result(column="user_first_name", property="userFirstName", jdbcType= JdbcType.VARCHAR),
        Result(column="user_first_name_reading", property="userFirstNameReading", jdbcType= JdbcType.VARCHAR),
        Result(column="birthday", property="birthday", jdbcType= JdbcType.DATE),
        Result(column="age", property="age", jdbcType= JdbcType.TINYINT),
        Result(column="postal_code", property="postalCode", jdbcType= JdbcType.INTEGER),
        Result(column="address", property="address", jdbcType= JdbcType.VARCHAR),
        Result(column="email", property="email", jdbcType= JdbcType.VARCHAR),
        Result(column="role_type", property="roleType", jdbcType= JdbcType.VARCHAR)
    ])

    fun selectUserBasicInfoExceptPasswordMany(selectStatement: SelectStatementProvider): List<UserBasicInfoExceptPasswordRecord>

    @SelectProvider(type= SqlProviderAdapter::class, method="select")
    @ResultMap("UserBasicInfoExpectPasswordRecordResult")
    fun selectUserBasicInfoExceptPasswordOne(selectStatement: SelectStatementProvider): UserBasicInfoExceptPasswordRecord
}