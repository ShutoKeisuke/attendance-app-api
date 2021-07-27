/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.attendance.api.infrastructure.database.mapper

import com.attendance.api.infrastructure.database.mapper.WorkStyleListDynamicSqlSupport.WorkStyleList
import com.attendance.api.infrastructure.database.mapper.WorkStyleListDynamicSqlSupport.WorkStyleList.workStyle
import com.attendance.api.infrastructure.database.record.WorkStyleListRecord
import org.mybatis.dynamic.sql.SqlBuilder.isEqualTo
import org.mybatis.dynamic.sql.util.kotlin.*
import org.mybatis.dynamic.sql.util.kotlin.mybatis3.*

fun WorkStyleListMapper.count(completer: CountCompleter) =
    countFrom(this::count, WorkStyleList, completer)

fun WorkStyleListMapper.delete(completer: DeleteCompleter) =
    deleteFrom(this::delete, WorkStyleList, completer)

fun WorkStyleListMapper.deleteByPrimaryKey(workStyle_: String) =
    delete {
        where(workStyle, isEqualTo(workStyle_))
    }

fun WorkStyleListMapper.insert(record: WorkStyleListRecord) =
    insert(this::insert, record, WorkStyleList) {
        map(workStyle).toProperty("workStyle")
    }

fun WorkStyleListMapper.insertMultiple(records: Collection<WorkStyleListRecord>) =
    insertMultiple(this::insertMultiple, records, WorkStyleList) {
        map(workStyle).toProperty("workStyle")
    }

fun WorkStyleListMapper.insertMultiple(vararg records: WorkStyleListRecord) =
    insertMultiple(records.toList())

fun WorkStyleListMapper.insertSelective(record: WorkStyleListRecord) =
    insert(this::insert, record, WorkStyleList) {
        map(workStyle).toPropertyWhenPresent("workStyle", record::workStyle)
    }

private val columnList = listOf(workStyle)

fun WorkStyleListMapper.selectOne(completer: SelectCompleter) =
    selectOne(this::selectOne, columnList, WorkStyleList, completer)

fun WorkStyleListMapper.select(completer: SelectCompleter) =
    selectList(this::selectMany, columnList, WorkStyleList, completer)

fun WorkStyleListMapper.selectDistinct(completer: SelectCompleter) =
    selectDistinct(this::selectMany, columnList, WorkStyleList, completer)

fun WorkStyleListMapper.update(completer: UpdateCompleter) =
    update(this::update, WorkStyleList, completer)

fun KotlinUpdateBuilder.updateAllColumns(record: WorkStyleListRecord) =
    apply {
        set(workStyle).equalTo(record::workStyle)
    }

fun KotlinUpdateBuilder.updateSelectiveColumns(record: WorkStyleListRecord) =
    apply {
        set(workStyle).equalToWhenPresent(record::workStyle)
    }