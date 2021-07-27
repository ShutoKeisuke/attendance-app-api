/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.attendance.api.infrastructure.database.mapper

import com.attendance.api.infrastructure.database.mapper.BreakTypeListDynamicSqlSupport.BreakTypeList
import com.attendance.api.infrastructure.database.mapper.BreakTypeListDynamicSqlSupport.BreakTypeList.breakType
import com.attendance.api.infrastructure.database.record.BreakTypeListRecord
import org.mybatis.dynamic.sql.SqlBuilder.isEqualTo
import org.mybatis.dynamic.sql.util.kotlin.*
import org.mybatis.dynamic.sql.util.kotlin.mybatis3.*

fun BreakTypeListMapper.count(completer: CountCompleter) =
    countFrom(this::count, BreakTypeList, completer)

fun BreakTypeListMapper.delete(completer: DeleteCompleter) =
    deleteFrom(this::delete, BreakTypeList, completer)

fun BreakTypeListMapper.deleteByPrimaryKey(breakType_: String) =
    delete {
        where(breakType, isEqualTo(breakType_))
    }

fun BreakTypeListMapper.insert(record: BreakTypeListRecord) =
    insert(this::insert, record, BreakTypeList) {
        map(breakType).toProperty("breakType")
    }

fun BreakTypeListMapper.insertMultiple(records: Collection<BreakTypeListRecord>) =
    insertMultiple(this::insertMultiple, records, BreakTypeList) {
        map(breakType).toProperty("breakType")
    }

fun BreakTypeListMapper.insertMultiple(vararg records: BreakTypeListRecord) =
    insertMultiple(records.toList())

fun BreakTypeListMapper.insertSelective(record: BreakTypeListRecord) =
    insert(this::insert, record, BreakTypeList) {
        map(breakType).toPropertyWhenPresent("breakType", record::breakType)
    }

private val columnList = listOf(breakType)

fun BreakTypeListMapper.selectOne(completer: SelectCompleter) =
    selectOne(this::selectOne, columnList, BreakTypeList, completer)

fun BreakTypeListMapper.select(completer: SelectCompleter) =
    selectList(this::selectMany, columnList, BreakTypeList, completer)

fun BreakTypeListMapper.selectDistinct(completer: SelectCompleter) =
    selectDistinct(this::selectMany, columnList, BreakTypeList, completer)

fun BreakTypeListMapper.update(completer: UpdateCompleter) =
    update(this::update, BreakTypeList, completer)

fun KotlinUpdateBuilder.updateAllColumns(record: BreakTypeListRecord) =
    apply {
        set(breakType).equalTo(record::breakType)
    }

fun KotlinUpdateBuilder.updateSelectiveColumns(record: BreakTypeListRecord) =
    apply {
        set(breakType).equalToWhenPresent(record::breakType)
    }