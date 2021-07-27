/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.attendance.api.infrastructure.database.mapper

import com.attendance.api.infrastructure.database.mapper.BreakTimeDetailDynamicSqlSupport.BreakTimeDetail
import com.attendance.api.infrastructure.database.mapper.BreakTimeDetailDynamicSqlSupport.BreakTimeDetail.attendanceId
import com.attendance.api.infrastructure.database.mapper.BreakTimeDetailDynamicSqlSupport.BreakTimeDetail.breakTime
import com.attendance.api.infrastructure.database.mapper.BreakTimeDetailDynamicSqlSupport.BreakTimeDetail.breakTimeId
import com.attendance.api.infrastructure.database.mapper.BreakTimeDetailDynamicSqlSupport.BreakTimeDetail.breakType
import com.attendance.api.infrastructure.database.mapper.BreakTimeDetailDynamicSqlSupport.BreakTimeDetail.date
import com.attendance.api.infrastructure.database.record.BreakTimeDetailRecord
import org.mybatis.dynamic.sql.SqlBuilder.isEqualTo
import org.mybatis.dynamic.sql.util.kotlin.*
import org.mybatis.dynamic.sql.util.kotlin.mybatis3.*

fun BreakTimeDetailMapper.count(completer: CountCompleter) =
    countFrom(this::count, BreakTimeDetail, completer)

fun BreakTimeDetailMapper.delete(completer: DeleteCompleter) =
    deleteFrom(this::delete, BreakTimeDetail, completer)

fun BreakTimeDetailMapper.deleteByPrimaryKey(breakTimeId_: Int) =
    delete {
        where(breakTimeId, isEqualTo(breakTimeId_))
    }

fun BreakTimeDetailMapper.insert(record: BreakTimeDetailRecord) =
    insert(this::insert, record, BreakTimeDetail) {
        map(breakTimeId).toProperty("breakTimeId")
        map(attendanceId).toProperty("attendanceId")
        map(date).toProperty("date")
        map(breakType).toProperty("breakType")
        map(breakTime).toProperty("breakTime")
    }

fun BreakTimeDetailMapper.insertMultiple(records: Collection<BreakTimeDetailRecord>) =
    insertMultiple(this::insertMultiple, records, BreakTimeDetail) {
        map(breakTimeId).toProperty("breakTimeId")
        map(attendanceId).toProperty("attendanceId")
        map(date).toProperty("date")
        map(breakType).toProperty("breakType")
        map(breakTime).toProperty("breakTime")
    }

fun BreakTimeDetailMapper.insertMultiple(vararg records: BreakTimeDetailRecord) =
    insertMultiple(records.toList())

fun BreakTimeDetailMapper.insertSelective(record: BreakTimeDetailRecord) =
    insert(this::insert, record, BreakTimeDetail) {
        map(breakTimeId).toPropertyWhenPresent("breakTimeId", record::breakTimeId)
        map(attendanceId).toPropertyWhenPresent("attendanceId", record::attendanceId)
        map(date).toPropertyWhenPresent("date", record::date)
        map(breakType).toPropertyWhenPresent("breakType", record::breakType)
        map(breakTime).toPropertyWhenPresent("breakTime", record::breakTime)
    }

private val columnList = listOf(breakTimeId, attendanceId, date, breakType, breakTime)

fun BreakTimeDetailMapper.selectOne(completer: SelectCompleter) =
    selectOne(this::selectOne, columnList, BreakTimeDetail, completer)

fun BreakTimeDetailMapper.select(completer: SelectCompleter) =
    selectList(this::selectMany, columnList, BreakTimeDetail, completer)

fun BreakTimeDetailMapper.selectDistinct(completer: SelectCompleter) =
    selectDistinct(this::selectMany, columnList, BreakTimeDetail, completer)

fun BreakTimeDetailMapper.selectByPrimaryKey(breakTimeId_: Int) =
    selectOne {
        where(breakTimeId, isEqualTo(breakTimeId_))
    }

fun BreakTimeDetailMapper.update(completer: UpdateCompleter) =
    update(this::update, BreakTimeDetail, completer)

fun KotlinUpdateBuilder.updateAllColumns(record: BreakTimeDetailRecord) =
    apply {
        set(breakTimeId).equalTo(record::breakTimeId)
        set(attendanceId).equalTo(record::attendanceId)
        set(date).equalTo(record::date)
        set(breakType).equalTo(record::breakType)
        set(breakTime).equalTo(record::breakTime)
    }

fun KotlinUpdateBuilder.updateSelectiveColumns(record: BreakTimeDetailRecord) =
    apply {
        set(breakTimeId).equalToWhenPresent(record::breakTimeId)
        set(attendanceId).equalToWhenPresent(record::attendanceId)
        set(date).equalToWhenPresent(record::date)
        set(breakType).equalToWhenPresent(record::breakType)
        set(breakTime).equalToWhenPresent(record::breakTime)
    }

fun BreakTimeDetailMapper.updateByPrimaryKey(record: BreakTimeDetailRecord) =
    update {
        set(attendanceId).equalTo(record::attendanceId)
        set(date).equalTo(record::date)
        set(breakType).equalTo(record::breakType)
        set(breakTime).equalTo(record::breakTime)
        where(breakTimeId, isEqualTo(record::breakTimeId))
    }

fun BreakTimeDetailMapper.updateByPrimaryKeySelective(record: BreakTimeDetailRecord) =
    update {
        set(attendanceId).equalToWhenPresent(record::attendanceId)
        set(date).equalToWhenPresent(record::date)
        set(breakType).equalToWhenPresent(record::breakType)
        set(breakTime).equalToWhenPresent(record::breakTime)
        where(breakTimeId, isEqualTo(record::breakTimeId))
    }