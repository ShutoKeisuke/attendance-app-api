/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.attendance.api.infrastructure.database.mapper

import com.attendance.api.infrastructure.database.mapper.PaidVacationDynamicSqlSupport.PaidVacation
import com.attendance.api.infrastructure.database.mapper.PaidVacationDynamicSqlSupport.PaidVacation.attendanceId
import com.attendance.api.infrastructure.database.mapper.PaidVacationDynamicSqlSupport.PaidVacation.date
import com.attendance.api.infrastructure.database.mapper.PaidVacationDynamicSqlSupport.PaidVacation.paidVacationId
import com.attendance.api.infrastructure.database.mapper.PaidVacationDynamicSqlSupport.PaidVacation.paidVacationTime
import com.attendance.api.infrastructure.database.record.PaidVacationRecord
import org.mybatis.dynamic.sql.SqlBuilder.isEqualTo
import org.mybatis.dynamic.sql.util.kotlin.*
import org.mybatis.dynamic.sql.util.kotlin.mybatis3.*

fun PaidVacationMapper.count(completer: CountCompleter) =
    countFrom(this::count, PaidVacation, completer)

fun PaidVacationMapper.delete(completer: DeleteCompleter) =
    deleteFrom(this::delete, PaidVacation, completer)

fun PaidVacationMapper.deleteByPrimaryKey(paidVacationId_: Int) =
    delete {
        where(paidVacationId, isEqualTo(paidVacationId_))
    }

fun PaidVacationMapper.insert(record: PaidVacationRecord) =
    insert(this::insert, record, PaidVacation) {
        map(paidVacationId).toProperty("paidVacationId")
        map(attendanceId).toProperty("attendanceId")
        map(date).toProperty("date")
        map(paidVacationTime).toProperty("paidVacationTime")
    }

fun PaidVacationMapper.insertMultiple(records: Collection<PaidVacationRecord>) =
    insertMultiple(this::insertMultiple, records, PaidVacation) {
        map(paidVacationId).toProperty("paidVacationId")
        map(attendanceId).toProperty("attendanceId")
        map(date).toProperty("date")
        map(paidVacationTime).toProperty("paidVacationTime")
    }

fun PaidVacationMapper.insertMultiple(vararg records: PaidVacationRecord) =
    insertMultiple(records.toList())

fun PaidVacationMapper.insertSelective(record: PaidVacationRecord) =
    insert(this::insert, record, PaidVacation) {
        map(paidVacationId).toPropertyWhenPresent("paidVacationId", record::paidVacationId)
        map(attendanceId).toPropertyWhenPresent("attendanceId", record::attendanceId)
        map(date).toPropertyWhenPresent("date", record::date)
        map(paidVacationTime).toPropertyWhenPresent("paidVacationTime", record::paidVacationTime)
    }

private val columnList = listOf(paidVacationId, attendanceId, date, paidVacationTime)

fun PaidVacationMapper.selectOne(completer: SelectCompleter) =
    selectOne(this::selectOne, columnList, PaidVacation, completer)

fun PaidVacationMapper.select(completer: SelectCompleter) =
    selectList(this::selectMany, columnList, PaidVacation, completer)

fun PaidVacationMapper.selectDistinct(completer: SelectCompleter) =
    selectDistinct(this::selectMany, columnList, PaidVacation, completer)

fun PaidVacationMapper.selectByPrimaryKey(paidVacationId_: Int) =
    selectOne {
        where(paidVacationId, isEqualTo(paidVacationId_))
    }

fun PaidVacationMapper.update(completer: UpdateCompleter) =
    update(this::update, PaidVacation, completer)

fun KotlinUpdateBuilder.updateAllColumns(record: PaidVacationRecord) =
    apply {
        set(paidVacationId).equalTo(record::paidVacationId)
        set(attendanceId).equalTo(record::attendanceId)
        set(date).equalTo(record::date)
        set(paidVacationTime).equalTo(record::paidVacationTime)
    }

fun KotlinUpdateBuilder.updateSelectiveColumns(record: PaidVacationRecord) =
    apply {
        set(paidVacationId).equalToWhenPresent(record::paidVacationId)
        set(attendanceId).equalToWhenPresent(record::attendanceId)
        set(date).equalToWhenPresent(record::date)
        set(paidVacationTime).equalToWhenPresent(record::paidVacationTime)
    }

fun PaidVacationMapper.updateByPrimaryKey(record: PaidVacationRecord) =
    update {
        set(attendanceId).equalTo(record::attendanceId)
        set(date).equalTo(record::date)
        set(paidVacationTime).equalTo(record::paidVacationTime)
        where(paidVacationId, isEqualTo(record::paidVacationId))
    }

fun PaidVacationMapper.updateByPrimaryKeySelective(record: PaidVacationRecord) =
    update {
        set(attendanceId).equalToWhenPresent(record::attendanceId)
        set(date).equalToWhenPresent(record::date)
        set(paidVacationTime).equalToWhenPresent(record::paidVacationTime)
        where(paidVacationId, isEqualTo(record::paidVacationId))
    }