package com.attendance.api.infrastructure.database.mapper.custom

import com.attendance.api.infrastructure.database.mapper.UserBasicInfoDynamicSqlSupport
import com.attendance.api.infrastructure.database.mapper.UserBasicInfoDynamicSqlSupport.UserBasicInfo.address
import com.attendance.api.infrastructure.database.mapper.UserBasicInfoDynamicSqlSupport.UserBasicInfo.age
import com.attendance.api.infrastructure.database.mapper.UserBasicInfoDynamicSqlSupport.UserBasicInfo.birthday
import com.attendance.api.infrastructure.database.mapper.UserBasicInfoDynamicSqlSupport.UserBasicInfo.email
import com.attendance.api.infrastructure.database.mapper.UserBasicInfoDynamicSqlSupport.UserBasicInfo.postalCode
import com.attendance.api.infrastructure.database.mapper.UserBasicInfoDynamicSqlSupport.UserBasicInfo.roleType
import com.attendance.api.infrastructure.database.mapper.UserBasicInfoDynamicSqlSupport.UserBasicInfo.userFirstName
import com.attendance.api.infrastructure.database.mapper.UserBasicInfoDynamicSqlSupport.UserBasicInfo.userFirstNameReading
import com.attendance.api.infrastructure.database.mapper.UserBasicInfoDynamicSqlSupport.UserBasicInfo.userId
import com.attendance.api.infrastructure.database.mapper.UserBasicInfoDynamicSqlSupport.UserBasicInfo.userLastName
import com.attendance.api.infrastructure.database.mapper.UserBasicInfoDynamicSqlSupport.UserBasicInfo.userLastNameReading
import com.attendance.api.infrastructure.database.record.custom.UserBasicInfoExceptPasswordRecord
import org.mybatis.dynamic.sql.SqlBuilder.*
import org.mybatis.dynamic.sql.render.RenderingStrategy

private val userBasicInfoExceptPasswordColumnList = listOf(
    userId,
    userLastName,
    userLastNameReading,
    userFirstName,
    userFirstNameReading,
    birthday,
    age,
    postalCode,
    address,
    email,
    roleType
)

fun UserCustomMapper.select(): List<UserBasicInfoExceptPasswordRecord> {
    val selectStatement = select(userBasicInfoExceptPasswordColumnList)
            .from(UserBasicInfoDynamicSqlSupport.UserBasicInfo)
            .build().render(RenderingStrategy.MYBATIS3)
    return selectUserBasicInfoExceptPasswordMany(selectStatement)
}

fun UserCustomMapper.select(email: String): UserBasicInfoExceptPasswordRecord? {
    val selectStatement = select(userBasicInfoExceptPasswordColumnList)
            .from(UserBasicInfoDynamicSqlSupport.UserBasicInfo)
            .where(UserBasicInfoDynamicSqlSupport.UserBasicInfo.email, isEqualTo(email))
            .build().render(RenderingStrategy.MYBATIS3)
    return selectUserBasicInfoExceptPasswordOne(selectStatement)
}