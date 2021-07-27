package com.attendance.api.infrastructure.repository

import com.attendance.api.domain.model.UserBasicInfo
import com.attendance.api.domain.model.UserBasicInfoExpectPassword
import com.attendance.api.domain.repository.UserRepository
import com.attendance.api.infrastructure.database.mapper.UserBasicInfoDynamicSqlSupport
import com.attendance.api.infrastructure.database.mapper.UserBasicInfoMapper
import com.attendance.api.infrastructure.database.mapper.custom.UserCustomMapper
import com.attendance.api.infrastructure.database.mapper.custom.select
import com.attendance.api.infrastructure.database.mapper.selectOne
import com.attendance.api.infrastructure.database.record.UserBasicInfoRecord
import com.attendance.api.infrastructure.database.record.custom.UserBasicInfoExceptPasswordRecord
import org.mybatis.dynamic.sql.SqlBuilder.isEqualTo
import org.mybatis.dynamic.sql.util.kotlin.mybatis3.select
import org.springframework.stereotype.Repository

@Repository
@Suppress("SpringJavaInjectionPointsAutowiringInspection")
class UserRepositoryImpl(
    private val userBasicInfoMapper: UserBasicInfoMapper,
    private val userCustomMapper: UserCustomMapper
) : UserRepository {
    override fun getUserBasicInfoByEmail(email: String): UserBasicInfo? {

        val record = userBasicInfoMapper.selectOne {
            where(UserBasicInfoDynamicSqlSupport.UserBasicInfo.email, isEqualTo(email))
        }

        return record?. let { toModelUserBasicInfo(it) }
    }

    override fun getUserBasicInfoExpectPasswordByEmail(email: String): UserBasicInfoExpectPassword? {
        return userCustomMapper.select(email)?.let { toModelUserBasicInfoExceptPassword(it) }
    }

    private fun toModelUserBasicInfo(record: UserBasicInfoRecord): UserBasicInfo {
        return UserBasicInfo(
            record.userId!!,
            record.userLastName!!,
            record.userLastNameReading!!,
            record.userFirstName!!,
            record.userFirstNameReading!!,
            record.birthday!!,
            record.age!!,
            record.postalCode!!,
            record.address!!,
            record.email,
            record.password!!,
            record.roleType!!
        )
    }

    private fun toModelUserBasicInfoExceptPassword(record: UserBasicInfoExceptPasswordRecord): UserBasicInfoExpectPassword {
        return UserBasicInfoExpectPassword(
            record.userId!!,
            record.userLastName!!,
            record.userLastNameReading!!,
            record.userFirstName!!,
            record.userFirstNameReading!!,
            record.birthday!!,
            record.age!!,
            record.postalCode!!,
            record.address!!,
            record.email,
            record.roleType!!
        )

    }
}