/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.attendance.api.infrastructure.database.mapper

import com.attendance.api.infrastructure.database.mapper.UserDetailInfoDynamicSqlSupport.UserDetailInfo
import com.attendance.api.infrastructure.database.mapper.UserDetailInfoDynamicSqlSupport.UserDetailInfo.department
import com.attendance.api.infrastructure.database.mapper.UserDetailInfoDynamicSqlSupport.UserDetailInfo.employmentStatus
import com.attendance.api.infrastructure.database.mapper.UserDetailInfoDynamicSqlSupport.UserDetailInfo.hireDate
import com.attendance.api.infrastructure.database.mapper.UserDetailInfoDynamicSqlSupport.UserDetailInfo.registrationDate
import com.attendance.api.infrastructure.database.mapper.UserDetailInfoDynamicSqlSupport.UserDetailInfo.retirementDate
import com.attendance.api.infrastructure.database.mapper.UserDetailInfoDynamicSqlSupport.UserDetailInfo.retirementFlg
import com.attendance.api.infrastructure.database.mapper.UserDetailInfoDynamicSqlSupport.UserDetailInfo.updateDate
import com.attendance.api.infrastructure.database.mapper.UserDetailInfoDynamicSqlSupport.UserDetailInfo.userDetailId
import com.attendance.api.infrastructure.database.mapper.UserDetailInfoDynamicSqlSupport.UserDetailInfo.userId
import com.attendance.api.infrastructure.database.record.UserDetailInfoRecord
import org.mybatis.dynamic.sql.SqlBuilder.isEqualTo
import org.mybatis.dynamic.sql.util.kotlin.*
import org.mybatis.dynamic.sql.util.kotlin.mybatis3.*

fun UserDetailInfoMapper.count(completer: CountCompleter) =
    countFrom(this::count, UserDetailInfo, completer)

fun UserDetailInfoMapper.delete(completer: DeleteCompleter) =
    deleteFrom(this::delete, UserDetailInfo, completer)

fun UserDetailInfoMapper.deleteByPrimaryKey(userDetailId_: Int) =
    delete {
        where(userDetailId, isEqualTo(userDetailId_))
    }

fun UserDetailInfoMapper.insert(record: UserDetailInfoRecord) =
    insert(this::insert, record, UserDetailInfo) {
        map(userDetailId).toProperty("userDetailId")
        map(userId).toProperty("userId")
        map(employmentStatus).toProperty("employmentStatus")
        map(department).toProperty("department")
        map(hireDate).toProperty("hireDate")
        map(retirementDate).toProperty("retirementDate")
        map(retirementFlg).toProperty("retirementFlg")
        map(registrationDate).toProperty("registrationDate")
        map(updateDate).toProperty("updateDate")
    }

fun UserDetailInfoMapper.insertMultiple(records: Collection<UserDetailInfoRecord>) =
    insertMultiple(this::insertMultiple, records, UserDetailInfo) {
        map(userDetailId).toProperty("userDetailId")
        map(userId).toProperty("userId")
        map(employmentStatus).toProperty("employmentStatus")
        map(department).toProperty("department")
        map(hireDate).toProperty("hireDate")
        map(retirementDate).toProperty("retirementDate")
        map(retirementFlg).toProperty("retirementFlg")
        map(registrationDate).toProperty("registrationDate")
        map(updateDate).toProperty("updateDate")
    }

fun UserDetailInfoMapper.insertMultiple(vararg records: UserDetailInfoRecord) =
    insertMultiple(records.toList())

fun UserDetailInfoMapper.insertSelective(record: UserDetailInfoRecord) =
    insert(this::insert, record, UserDetailInfo) {
        map(userDetailId).toPropertyWhenPresent("userDetailId", record::userDetailId)
        map(userId).toPropertyWhenPresent("userId", record::userId)
        map(employmentStatus).toPropertyWhenPresent("employmentStatus", record::employmentStatus)
        map(department).toPropertyWhenPresent("department", record::department)
        map(hireDate).toPropertyWhenPresent("hireDate", record::hireDate)
        map(retirementDate).toPropertyWhenPresent("retirementDate", record::retirementDate)
        map(retirementFlg).toPropertyWhenPresent("retirementFlg", record::retirementFlg)
        map(registrationDate).toPropertyWhenPresent("registrationDate", record::registrationDate)
        map(updateDate).toPropertyWhenPresent("updateDate", record::updateDate)
    }

private val columnList = listOf(userDetailId, userId, employmentStatus, department, hireDate, retirementDate, retirementFlg, registrationDate, updateDate)

fun UserDetailInfoMapper.selectOne(completer: SelectCompleter) =
    selectOne(this::selectOne, columnList, UserDetailInfo, completer)

fun UserDetailInfoMapper.select(completer: SelectCompleter) =
    selectList(this::selectMany, columnList, UserDetailInfo, completer)

fun UserDetailInfoMapper.selectDistinct(completer: SelectCompleter) =
    selectDistinct(this::selectMany, columnList, UserDetailInfo, completer)

fun UserDetailInfoMapper.selectByPrimaryKey(userDetailId_: Int) =
    selectOne {
        where(userDetailId, isEqualTo(userDetailId_))
    }

fun UserDetailInfoMapper.update(completer: UpdateCompleter) =
    update(this::update, UserDetailInfo, completer)

fun KotlinUpdateBuilder.updateAllColumns(record: UserDetailInfoRecord) =
    apply {
        set(userDetailId).equalTo(record::userDetailId)
        set(userId).equalTo(record::userId)
        set(employmentStatus).equalTo(record::employmentStatus)
        set(department).equalTo(record::department)
        set(hireDate).equalTo(record::hireDate)
        set(retirementDate).equalTo(record::retirementDate)
        set(retirementFlg).equalTo(record::retirementFlg)
        set(registrationDate).equalTo(record::registrationDate)
        set(updateDate).equalTo(record::updateDate)
    }

fun KotlinUpdateBuilder.updateSelectiveColumns(record: UserDetailInfoRecord) =
    apply {
        set(userDetailId).equalToWhenPresent(record::userDetailId)
        set(userId).equalToWhenPresent(record::userId)
        set(employmentStatus).equalToWhenPresent(record::employmentStatus)
        set(department).equalToWhenPresent(record::department)
        set(hireDate).equalToWhenPresent(record::hireDate)
        set(retirementDate).equalToWhenPresent(record::retirementDate)
        set(retirementFlg).equalToWhenPresent(record::retirementFlg)
        set(registrationDate).equalToWhenPresent(record::registrationDate)
        set(updateDate).equalToWhenPresent(record::updateDate)
    }

fun UserDetailInfoMapper.updateByPrimaryKey(record: UserDetailInfoRecord) =
    update {
        set(userId).equalTo(record::userId)
        set(employmentStatus).equalTo(record::employmentStatus)
        set(department).equalTo(record::department)
        set(hireDate).equalTo(record::hireDate)
        set(retirementDate).equalTo(record::retirementDate)
        set(retirementFlg).equalTo(record::retirementFlg)
        set(registrationDate).equalTo(record::registrationDate)
        set(updateDate).equalTo(record::updateDate)
        where(userDetailId, isEqualTo(record::userDetailId))
    }

fun UserDetailInfoMapper.updateByPrimaryKeySelective(record: UserDetailInfoRecord) =
    update {
        set(userId).equalToWhenPresent(record::userId)
        set(employmentStatus).equalToWhenPresent(record::employmentStatus)
        set(department).equalToWhenPresent(record::department)
        set(hireDate).equalToWhenPresent(record::hireDate)
        set(retirementDate).equalToWhenPresent(record::retirementDate)
        set(retirementFlg).equalToWhenPresent(record::retirementFlg)
        set(registrationDate).equalToWhenPresent(record::registrationDate)
        set(updateDate).equalToWhenPresent(record::updateDate)
        where(userDetailId, isEqualTo(record::userDetailId))
    }