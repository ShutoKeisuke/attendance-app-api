/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.attendance.api.infrastructure.database.mapper

import com.attendance.api.infrastructure.database.mapper.EmploymentListDynamicSqlSupport.EmploymentList
import com.attendance.api.infrastructure.database.mapper.EmploymentListDynamicSqlSupport.EmploymentList.employment
import com.attendance.api.infrastructure.database.record.EmploymentListRecord
import org.mybatis.dynamic.sql.SqlBuilder.isEqualTo
import org.mybatis.dynamic.sql.util.kotlin.*
import org.mybatis.dynamic.sql.util.kotlin.mybatis3.*

fun EmploymentListMapper.count(completer: CountCompleter) =
    countFrom(this::count, EmploymentList, completer)

fun EmploymentListMapper.delete(completer: DeleteCompleter) =
    deleteFrom(this::delete, EmploymentList, completer)

fun EmploymentListMapper.deleteByPrimaryKey(employment_: String) =
    delete {
        where(employment, isEqualTo(employment_))
    }

fun EmploymentListMapper.insert(record: EmploymentListRecord) =
    insert(this::insert, record, EmploymentList) {
        map(employment).toProperty("employment")
    }

fun EmploymentListMapper.insertMultiple(records: Collection<EmploymentListRecord>) =
    insertMultiple(this::insertMultiple, records, EmploymentList) {
        map(employment).toProperty("employment")
    }

fun EmploymentListMapper.insertMultiple(vararg records: EmploymentListRecord) =
    insertMultiple(records.toList())

fun EmploymentListMapper.insertSelective(record: EmploymentListRecord) =
    insert(this::insert, record, EmploymentList) {
        map(employment).toPropertyWhenPresent("employment", record::employment)
    }

private val columnList = listOf(employment)

fun EmploymentListMapper.selectOne(completer: SelectCompleter) =
    selectOne(this::selectOne, columnList, EmploymentList, completer)

fun EmploymentListMapper.select(completer: SelectCompleter) =
    selectList(this::selectMany, columnList, EmploymentList, completer)

fun EmploymentListMapper.selectDistinct(completer: SelectCompleter) =
    selectDistinct(this::selectMany, columnList, EmploymentList, completer)

fun EmploymentListMapper.update(completer: UpdateCompleter) =
    update(this::update, EmploymentList, completer)

fun KotlinUpdateBuilder.updateAllColumns(record: EmploymentListRecord) =
    apply {
        set(employment).equalTo(record::employment)
    }

fun KotlinUpdateBuilder.updateSelectiveColumns(record: EmploymentListRecord) =
    apply {
        set(employment).equalToWhenPresent(record::employment)
    }