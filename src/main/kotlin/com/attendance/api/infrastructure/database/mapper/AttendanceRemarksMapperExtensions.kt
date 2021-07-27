/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.attendance.api.infrastructure.database.mapper

import com.attendance.api.infrastructure.database.mapper.AttendanceRemarksDynamicSqlSupport.AttendanceRemarks
import com.attendance.api.infrastructure.database.mapper.AttendanceRemarksDynamicSqlSupport.AttendanceRemarks.attendanceId
import com.attendance.api.infrastructure.database.mapper.AttendanceRemarksDynamicSqlSupport.AttendanceRemarks.date
import com.attendance.api.infrastructure.database.mapper.AttendanceRemarksDynamicSqlSupport.AttendanceRemarks.remarks
import com.attendance.api.infrastructure.database.mapper.AttendanceRemarksDynamicSqlSupport.AttendanceRemarks.remarksId
import com.attendance.api.infrastructure.database.record.AttendanceRemarksRecord
import org.mybatis.dynamic.sql.SqlBuilder.isEqualTo
import org.mybatis.dynamic.sql.util.kotlin.*
import org.mybatis.dynamic.sql.util.kotlin.mybatis3.*

fun AttendanceRemarksMapper.count(completer: CountCompleter) =
    countFrom(this::count, AttendanceRemarks, completer)

fun AttendanceRemarksMapper.delete(completer: DeleteCompleter) =
    deleteFrom(this::delete, AttendanceRemarks, completer)

fun AttendanceRemarksMapper.deleteByPrimaryKey(remarksId_: Int) =
    delete {
        where(remarksId, isEqualTo(remarksId_))
    }

fun AttendanceRemarksMapper.insert(record: AttendanceRemarksRecord) =
    insert(this::insert, record, AttendanceRemarks) {
        map(remarksId).toProperty("remarksId")
        map(attendanceId).toProperty("attendanceId")
        map(date).toProperty("date")
        map(remarks).toProperty("remarks")
    }

fun AttendanceRemarksMapper.insertMultiple(records: Collection<AttendanceRemarksRecord>) =
    insertMultiple(this::insertMultiple, records, AttendanceRemarks) {
        map(remarksId).toProperty("remarksId")
        map(attendanceId).toProperty("attendanceId")
        map(date).toProperty("date")
        map(remarks).toProperty("remarks")
    }

fun AttendanceRemarksMapper.insertMultiple(vararg records: AttendanceRemarksRecord) =
    insertMultiple(records.toList())

fun AttendanceRemarksMapper.insertSelective(record: AttendanceRemarksRecord) =
    insert(this::insert, record, AttendanceRemarks) {
        map(remarksId).toPropertyWhenPresent("remarksId", record::remarksId)
        map(attendanceId).toPropertyWhenPresent("attendanceId", record::attendanceId)
        map(date).toPropertyWhenPresent("date", record::date)
        map(remarks).toPropertyWhenPresent("remarks", record::remarks)
    }

private val columnList = listOf(remarksId, attendanceId, date, remarks)

fun AttendanceRemarksMapper.selectOne(completer: SelectCompleter) =
    selectOne(this::selectOne, columnList, AttendanceRemarks, completer)

fun AttendanceRemarksMapper.select(completer: SelectCompleter) =
    selectList(this::selectMany, columnList, AttendanceRemarks, completer)

fun AttendanceRemarksMapper.selectDistinct(completer: SelectCompleter) =
    selectDistinct(this::selectMany, columnList, AttendanceRemarks, completer)

fun AttendanceRemarksMapper.selectByPrimaryKey(remarksId_: Int) =
    selectOne {
        where(remarksId, isEqualTo(remarksId_))
    }

fun AttendanceRemarksMapper.update(completer: UpdateCompleter) =
    update(this::update, AttendanceRemarks, completer)

fun KotlinUpdateBuilder.updateAllColumns(record: AttendanceRemarksRecord) =
    apply {
        set(remarksId).equalTo(record::remarksId)
        set(attendanceId).equalTo(record::attendanceId)
        set(date).equalTo(record::date)
        set(remarks).equalTo(record::remarks)
    }

fun KotlinUpdateBuilder.updateSelectiveColumns(record: AttendanceRemarksRecord) =
    apply {
        set(remarksId).equalToWhenPresent(record::remarksId)
        set(attendanceId).equalToWhenPresent(record::attendanceId)
        set(date).equalToWhenPresent(record::date)
        set(remarks).equalToWhenPresent(record::remarks)
    }

fun AttendanceRemarksMapper.updateByPrimaryKey(record: AttendanceRemarksRecord) =
    update {
        set(attendanceId).equalTo(record::attendanceId)
        set(date).equalTo(record::date)
        set(remarks).equalTo(record::remarks)
        where(remarksId, isEqualTo(record::remarksId))
    }

fun AttendanceRemarksMapper.updateByPrimaryKeySelective(record: AttendanceRemarksRecord) =
    update {
        set(attendanceId).equalToWhenPresent(record::attendanceId)
        set(date).equalToWhenPresent(record::date)
        set(remarks).equalToWhenPresent(record::remarks)
        where(remarksId, isEqualTo(record::remarksId))
    }