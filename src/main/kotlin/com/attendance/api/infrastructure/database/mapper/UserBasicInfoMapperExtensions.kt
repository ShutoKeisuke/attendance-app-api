/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.attendance.api.infrastructure.database.mapper

import com.attendance.api.infrastructure.database.mapper.UserBasicInfoDynamicSqlSupport.UserBasicInfo
import com.attendance.api.infrastructure.database.mapper.UserBasicInfoDynamicSqlSupport.UserBasicInfo.address
import com.attendance.api.infrastructure.database.mapper.UserBasicInfoDynamicSqlSupport.UserBasicInfo.age
import com.attendance.api.infrastructure.database.mapper.UserBasicInfoDynamicSqlSupport.UserBasicInfo.birthday
import com.attendance.api.infrastructure.database.mapper.UserBasicInfoDynamicSqlSupport.UserBasicInfo.email
import com.attendance.api.infrastructure.database.mapper.UserBasicInfoDynamicSqlSupport.UserBasicInfo.password
import com.attendance.api.infrastructure.database.mapper.UserBasicInfoDynamicSqlSupport.UserBasicInfo.postalCode
import com.attendance.api.infrastructure.database.mapper.UserBasicInfoDynamicSqlSupport.UserBasicInfo.roleType
import com.attendance.api.infrastructure.database.mapper.UserBasicInfoDynamicSqlSupport.UserBasicInfo.userFirstName
import com.attendance.api.infrastructure.database.mapper.UserBasicInfoDynamicSqlSupport.UserBasicInfo.userFirstNameReading
import com.attendance.api.infrastructure.database.mapper.UserBasicInfoDynamicSqlSupport.UserBasicInfo.userId
import com.attendance.api.infrastructure.database.mapper.UserBasicInfoDynamicSqlSupport.UserBasicInfo.userLastName
import com.attendance.api.infrastructure.database.mapper.UserBasicInfoDynamicSqlSupport.UserBasicInfo.userLastNameReading
import com.attendance.api.infrastructure.database.record.UserBasicInfoRecord
import org.mybatis.dynamic.sql.SqlBuilder.isEqualTo
import org.mybatis.dynamic.sql.util.kotlin.*
import org.mybatis.dynamic.sql.util.kotlin.mybatis3.*

fun UserBasicInfoMapper.count(completer: CountCompleter) =
    countFrom(this::count, UserBasicInfo, completer)

fun UserBasicInfoMapper.delete(completer: DeleteCompleter) =
    deleteFrom(this::delete, UserBasicInfo, completer)

fun UserBasicInfoMapper.deleteByPrimaryKey(userId_: String) =
    delete {
        where(userId, isEqualTo(userId_))
    }

fun UserBasicInfoMapper.insert(record: UserBasicInfoRecord) =
    insert(this::insert, record, UserBasicInfo) {
        map(userId).toProperty("userId")
        map(userLastName).toProperty("userLastName")
        map(userLastNameReading).toProperty("userLastNameReading")
        map(userFirstName).toProperty("userFirstName")
        map(userFirstNameReading).toProperty("userFirstNameReading")
        map(birthday).toProperty("birthday")
        map(age).toProperty("age")
        map(postalCode).toProperty("postalCode")
        map(address).toProperty("address")
        map(email).toProperty("email")
        map(password).toProperty("password")
        map(roleType).toProperty("roleType")
    }

fun UserBasicInfoMapper.insertMultiple(records: Collection<UserBasicInfoRecord>) =
    insertMultiple(this::insertMultiple, records, UserBasicInfo) {
        map(userId).toProperty("userId")
        map(userLastName).toProperty("userLastName")
        map(userLastNameReading).toProperty("userLastNameReading")
        map(userFirstName).toProperty("userFirstName")
        map(userFirstNameReading).toProperty("userFirstNameReading")
        map(birthday).toProperty("birthday")
        map(age).toProperty("age")
        map(postalCode).toProperty("postalCode")
        map(address).toProperty("address")
        map(email).toProperty("email")
        map(password).toProperty("password")
        map(roleType).toProperty("roleType")
    }

fun UserBasicInfoMapper.insertMultiple(vararg records: UserBasicInfoRecord) =
    insertMultiple(records.toList())

fun UserBasicInfoMapper.insertSelective(record: UserBasicInfoRecord) =
    insert(this::insert, record, UserBasicInfo) {
        map(userId).toPropertyWhenPresent("userId", record::userId)
        map(userLastName).toPropertyWhenPresent("userLastName", record::userLastName)
        map(userLastNameReading).toPropertyWhenPresent("userLastNameReading", record::userLastNameReading)
        map(userFirstName).toPropertyWhenPresent("userFirstName", record::userFirstName)
        map(userFirstNameReading).toPropertyWhenPresent("userFirstNameReading", record::userFirstNameReading)
        map(birthday).toPropertyWhenPresent("birthday", record::birthday)
        map(age).toPropertyWhenPresent("age", record::age)
        map(postalCode).toPropertyWhenPresent("postalCode", record::postalCode)
        map(address).toPropertyWhenPresent("address", record::address)
        map(email).toPropertyWhenPresent("email", record::email)
        map(password).toPropertyWhenPresent("password", record::password)
        map(roleType).toPropertyWhenPresent("roleType", record::roleType)
    }

private val columnList = listOf(userId, userLastName, userLastNameReading, userFirstName, userFirstNameReading, birthday, age, postalCode, address, email, password, roleType)

fun UserBasicInfoMapper.selectOne(completer: SelectCompleter) =
    selectOne(this::selectOne, columnList, UserBasicInfo, completer)

fun UserBasicInfoMapper.select(completer: SelectCompleter) =
    selectList(this::selectMany, columnList, UserBasicInfo, completer)

fun UserBasicInfoMapper.selectDistinct(completer: SelectCompleter) =
    selectDistinct(this::selectMany, columnList, UserBasicInfo, completer)

fun UserBasicInfoMapper.selectByPrimaryKey(userId_: String) =
    selectOne {
        where(userId, isEqualTo(userId_))
    }

fun UserBasicInfoMapper.update(completer: UpdateCompleter) =
    update(this::update, UserBasicInfo, completer)

fun KotlinUpdateBuilder.updateAllColumns(record: UserBasicInfoRecord) =
    apply {
        set(userId).equalTo(record::userId)
        set(userLastName).equalTo(record::userLastName)
        set(userLastNameReading).equalTo(record::userLastNameReading)
        set(userFirstName).equalTo(record::userFirstName)
        set(userFirstNameReading).equalTo(record::userFirstNameReading)
        set(birthday).equalTo(record::birthday)
        set(age).equalTo(record::age)
        set(postalCode).equalTo(record::postalCode)
        set(address).equalTo(record::address)
        set(email).equalTo(record::email)
        set(password).equalTo(record::password)
        set(roleType).equalTo(record::roleType)
    }

fun KotlinUpdateBuilder.updateSelectiveColumns(record: UserBasicInfoRecord) =
    apply {
        set(userId).equalToWhenPresent(record::userId)
        set(userLastName).equalToWhenPresent(record::userLastName)
        set(userLastNameReading).equalToWhenPresent(record::userLastNameReading)
        set(userFirstName).equalToWhenPresent(record::userFirstName)
        set(userFirstNameReading).equalToWhenPresent(record::userFirstNameReading)
        set(birthday).equalToWhenPresent(record::birthday)
        set(age).equalToWhenPresent(record::age)
        set(postalCode).equalToWhenPresent(record::postalCode)
        set(address).equalToWhenPresent(record::address)
        set(email).equalToWhenPresent(record::email)
        set(password).equalToWhenPresent(record::password)
        set(roleType).equalToWhenPresent(record::roleType)
    }

fun UserBasicInfoMapper.updateByPrimaryKey(record: UserBasicInfoRecord) =
    update {
        set(userLastName).equalTo(record::userLastName)
        set(userLastNameReading).equalTo(record::userLastNameReading)
        set(userFirstName).equalTo(record::userFirstName)
        set(userFirstNameReading).equalTo(record::userFirstNameReading)
        set(birthday).equalTo(record::birthday)
        set(age).equalTo(record::age)
        set(postalCode).equalTo(record::postalCode)
        set(address).equalTo(record::address)
        set(email).equalTo(record::email)
        set(password).equalTo(record::password)
        set(roleType).equalTo(record::roleType)
        where(userId, isEqualTo(record::userId))
    }

fun UserBasicInfoMapper.updateByPrimaryKeySelective(record: UserBasicInfoRecord) =
    update {
        set(userLastName).equalToWhenPresent(record::userLastName)
        set(userLastNameReading).equalToWhenPresent(record::userLastNameReading)
        set(userFirstName).equalToWhenPresent(record::userFirstName)
        set(userFirstNameReading).equalToWhenPresent(record::userFirstNameReading)
        set(birthday).equalToWhenPresent(record::birthday)
        set(age).equalToWhenPresent(record::age)
        set(postalCode).equalToWhenPresent(record::postalCode)
        set(address).equalToWhenPresent(record::address)
        set(email).equalToWhenPresent(record::email)
        set(password).equalToWhenPresent(record::password)
        set(roleType).equalToWhenPresent(record::roleType)
        where(userId, isEqualTo(record::userId))
    }