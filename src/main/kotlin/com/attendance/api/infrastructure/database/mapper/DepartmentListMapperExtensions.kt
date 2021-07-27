/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.attendance.api.infrastructure.database.mapper

import com.attendance.api.infrastructure.database.mapper.DepartmentListDynamicSqlSupport.DepartmentList
import com.attendance.api.infrastructure.database.mapper.DepartmentListDynamicSqlSupport.DepartmentList.department
import com.attendance.api.infrastructure.database.record.DepartmentListRecord
import org.mybatis.dynamic.sql.SqlBuilder.isEqualTo
import org.mybatis.dynamic.sql.util.kotlin.*
import org.mybatis.dynamic.sql.util.kotlin.mybatis3.*

fun DepartmentListMapper.count(completer: CountCompleter) =
    countFrom(this::count, DepartmentList, completer)

fun DepartmentListMapper.delete(completer: DeleteCompleter) =
    deleteFrom(this::delete, DepartmentList, completer)

fun DepartmentListMapper.deleteByPrimaryKey(department_: String) =
    delete {
        where(department, isEqualTo(department_))
    }

fun DepartmentListMapper.insert(record: DepartmentListRecord) =
    insert(this::insert, record, DepartmentList) {
        map(department).toProperty("department")
    }

fun DepartmentListMapper.insertMultiple(records: Collection<DepartmentListRecord>) =
    insertMultiple(this::insertMultiple, records, DepartmentList) {
        map(department).toProperty("department")
    }

fun DepartmentListMapper.insertMultiple(vararg records: DepartmentListRecord) =
    insertMultiple(records.toList())

fun DepartmentListMapper.insertSelective(record: DepartmentListRecord) =
    insert(this::insert, record, DepartmentList) {
        map(department).toPropertyWhenPresent("department", record::department)
    }

private val columnList = listOf(department)

fun DepartmentListMapper.selectOne(completer: SelectCompleter) =
    selectOne(this::selectOne, columnList, DepartmentList, completer)

fun DepartmentListMapper.select(completer: SelectCompleter) =
    selectList(this::selectMany, columnList, DepartmentList, completer)

fun DepartmentListMapper.selectDistinct(completer: SelectCompleter) =
    selectDistinct(this::selectMany, columnList, DepartmentList, completer)

fun DepartmentListMapper.update(completer: UpdateCompleter) =
    update(this::update, DepartmentList, completer)

fun KotlinUpdateBuilder.updateAllColumns(record: DepartmentListRecord) =
    apply {
        set(department).equalTo(record::department)
    }

fun KotlinUpdateBuilder.updateSelectiveColumns(record: DepartmentListRecord) =
    apply {
        set(department).equalToWhenPresent(record::department)
    }