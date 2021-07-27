/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.attendance.api.infrastructure.database.mapper

import com.attendance.api.infrastructure.database.mapper.AttendanceSettingDynamicSqlSupport.AttendanceSetting
import com.attendance.api.infrastructure.database.mapper.AttendanceSettingDynamicSqlSupport.AttendanceSetting.absenceDays
import com.attendance.api.infrastructure.database.mapper.AttendanceSettingDynamicSqlSupport.AttendanceSetting.actualWorkingDays
import com.attendance.api.infrastructure.database.mapper.AttendanceSettingDynamicSqlSupport.AttendanceSetting.attendaceId
import com.attendance.api.infrastructure.database.mapper.AttendanceSettingDynamicSqlSupport.AttendanceSetting.paidVacationDigestionDays
import com.attendance.api.infrastructure.database.mapper.AttendanceSettingDynamicSqlSupport.AttendanceSetting.remainingPaidDays
import com.attendance.api.infrastructure.database.mapper.AttendanceSettingDynamicSqlSupport.AttendanceSetting.scheduledWorkingDays
import com.attendance.api.infrastructure.database.mapper.AttendanceSettingDynamicSqlSupport.AttendanceSetting.settingId
import com.attendance.api.infrastructure.database.mapper.AttendanceSettingDynamicSqlSupport.AttendanceSetting.specialVacationDays
import com.attendance.api.infrastructure.database.mapper.AttendanceSettingDynamicSqlSupport.AttendanceSetting.standardEndTime
import com.attendance.api.infrastructure.database.mapper.AttendanceSettingDynamicSqlSupport.AttendanceSetting.standardStartTime
import com.attendance.api.infrastructure.database.record.AttendanceSettingRecord
import org.mybatis.dynamic.sql.SqlBuilder.isEqualTo
import org.mybatis.dynamic.sql.util.kotlin.*
import org.mybatis.dynamic.sql.util.kotlin.mybatis3.*

fun AttendanceSettingMapper.count(completer: CountCompleter) =
    countFrom(this::count, AttendanceSetting, completer)

fun AttendanceSettingMapper.delete(completer: DeleteCompleter) =
    deleteFrom(this::delete, AttendanceSetting, completer)

fun AttendanceSettingMapper.deleteByPrimaryKey(settingId_: Int) =
    delete {
        where(settingId, isEqualTo(settingId_))
    }

fun AttendanceSettingMapper.insert(record: AttendanceSettingRecord) =
    insert(this::insert, record, AttendanceSetting) {
        map(settingId).toProperty("settingId")
        map(attendaceId).toProperty("attendaceId")
        map(scheduledWorkingDays).toProperty("scheduledWorkingDays")
        map(actualWorkingDays).toProperty("actualWorkingDays")
        map(remainingPaidDays).toProperty("remainingPaidDays")
        map(paidVacationDigestionDays).toProperty("paidVacationDigestionDays")
        map(specialVacationDays).toProperty("specialVacationDays")
        map(absenceDays).toProperty("absenceDays")
        map(standardStartTime).toProperty("standardStartTime")
        map(standardEndTime).toProperty("standardEndTime")
    }

fun AttendanceSettingMapper.insertMultiple(records: Collection<AttendanceSettingRecord>) =
    insertMultiple(this::insertMultiple, records, AttendanceSetting) {
        map(settingId).toProperty("settingId")
        map(attendaceId).toProperty("attendaceId")
        map(scheduledWorkingDays).toProperty("scheduledWorkingDays")
        map(actualWorkingDays).toProperty("actualWorkingDays")
        map(remainingPaidDays).toProperty("remainingPaidDays")
        map(paidVacationDigestionDays).toProperty("paidVacationDigestionDays")
        map(specialVacationDays).toProperty("specialVacationDays")
        map(absenceDays).toProperty("absenceDays")
        map(standardStartTime).toProperty("standardStartTime")
        map(standardEndTime).toProperty("standardEndTime")
    }

fun AttendanceSettingMapper.insertMultiple(vararg records: AttendanceSettingRecord) =
    insertMultiple(records.toList())

fun AttendanceSettingMapper.insertSelective(record: AttendanceSettingRecord) =
    insert(this::insert, record, AttendanceSetting) {
        map(settingId).toPropertyWhenPresent("settingId", record::settingId)
        map(attendaceId).toPropertyWhenPresent("attendaceId", record::attendaceId)
        map(scheduledWorkingDays).toPropertyWhenPresent("scheduledWorkingDays", record::scheduledWorkingDays)
        map(actualWorkingDays).toPropertyWhenPresent("actualWorkingDays", record::actualWorkingDays)
        map(remainingPaidDays).toPropertyWhenPresent("remainingPaidDays", record::remainingPaidDays)
        map(paidVacationDigestionDays).toPropertyWhenPresent("paidVacationDigestionDays", record::paidVacationDigestionDays)
        map(specialVacationDays).toPropertyWhenPresent("specialVacationDays", record::specialVacationDays)
        map(absenceDays).toPropertyWhenPresent("absenceDays", record::absenceDays)
        map(standardStartTime).toPropertyWhenPresent("standardStartTime", record::standardStartTime)
        map(standardEndTime).toPropertyWhenPresent("standardEndTime", record::standardEndTime)
    }

private val columnList = listOf(settingId, attendaceId, scheduledWorkingDays, actualWorkingDays, remainingPaidDays, paidVacationDigestionDays, specialVacationDays, absenceDays, standardStartTime, standardEndTime)

fun AttendanceSettingMapper.selectOne(completer: SelectCompleter) =
    selectOne(this::selectOne, columnList, AttendanceSetting, completer)

fun AttendanceSettingMapper.select(completer: SelectCompleter) =
    selectList(this::selectMany, columnList, AttendanceSetting, completer)

fun AttendanceSettingMapper.selectDistinct(completer: SelectCompleter) =
    selectDistinct(this::selectMany, columnList, AttendanceSetting, completer)

fun AttendanceSettingMapper.selectByPrimaryKey(settingId_: Int) =
    selectOne {
        where(settingId, isEqualTo(settingId_))
    }

fun AttendanceSettingMapper.update(completer: UpdateCompleter) =
    update(this::update, AttendanceSetting, completer)

fun KotlinUpdateBuilder.updateAllColumns(record: AttendanceSettingRecord) =
    apply {
        set(settingId).equalTo(record::settingId)
        set(attendaceId).equalTo(record::attendaceId)
        set(scheduledWorkingDays).equalTo(record::scheduledWorkingDays)
        set(actualWorkingDays).equalTo(record::actualWorkingDays)
        set(remainingPaidDays).equalTo(record::remainingPaidDays)
        set(paidVacationDigestionDays).equalTo(record::paidVacationDigestionDays)
        set(specialVacationDays).equalTo(record::specialVacationDays)
        set(absenceDays).equalTo(record::absenceDays)
        set(standardStartTime).equalTo(record::standardStartTime)
        set(standardEndTime).equalTo(record::standardEndTime)
    }

fun KotlinUpdateBuilder.updateSelectiveColumns(record: AttendanceSettingRecord) =
    apply {
        set(settingId).equalToWhenPresent(record::settingId)
        set(attendaceId).equalToWhenPresent(record::attendaceId)
        set(scheduledWorkingDays).equalToWhenPresent(record::scheduledWorkingDays)
        set(actualWorkingDays).equalToWhenPresent(record::actualWorkingDays)
        set(remainingPaidDays).equalToWhenPresent(record::remainingPaidDays)
        set(paidVacationDigestionDays).equalToWhenPresent(record::paidVacationDigestionDays)
        set(specialVacationDays).equalToWhenPresent(record::specialVacationDays)
        set(absenceDays).equalToWhenPresent(record::absenceDays)
        set(standardStartTime).equalToWhenPresent(record::standardStartTime)
        set(standardEndTime).equalToWhenPresent(record::standardEndTime)
    }

fun AttendanceSettingMapper.updateByPrimaryKey(record: AttendanceSettingRecord) =
    update {
        set(attendaceId).equalTo(record::attendaceId)
        set(scheduledWorkingDays).equalTo(record::scheduledWorkingDays)
        set(actualWorkingDays).equalTo(record::actualWorkingDays)
        set(remainingPaidDays).equalTo(record::remainingPaidDays)
        set(paidVacationDigestionDays).equalTo(record::paidVacationDigestionDays)
        set(specialVacationDays).equalTo(record::specialVacationDays)
        set(absenceDays).equalTo(record::absenceDays)
        set(standardStartTime).equalTo(record::standardStartTime)
        set(standardEndTime).equalTo(record::standardEndTime)
        where(settingId, isEqualTo(record::settingId))
    }

fun AttendanceSettingMapper.updateByPrimaryKeySelective(record: AttendanceSettingRecord) =
    update {
        set(attendaceId).equalToWhenPresent(record::attendaceId)
        set(scheduledWorkingDays).equalToWhenPresent(record::scheduledWorkingDays)
        set(actualWorkingDays).equalToWhenPresent(record::actualWorkingDays)
        set(remainingPaidDays).equalToWhenPresent(record::remainingPaidDays)
        set(paidVacationDigestionDays).equalToWhenPresent(record::paidVacationDigestionDays)
        set(specialVacationDays).equalToWhenPresent(record::specialVacationDays)
        set(absenceDays).equalToWhenPresent(record::absenceDays)
        set(standardStartTime).equalToWhenPresent(record::standardStartTime)
        set(standardEndTime).equalToWhenPresent(record::standardEndTime)
        where(settingId, isEqualTo(record::settingId))
    }