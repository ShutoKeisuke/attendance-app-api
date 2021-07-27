/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.attendance.api.infrastructure.database.mapper

import com.attendance.api.infrastructure.database.mapper.RoleListDynamicSqlSupport.RoleList
import com.attendance.api.infrastructure.database.mapper.RoleListDynamicSqlSupport.RoleList.role
import com.attendance.api.infrastructure.database.record.RoleListRecord
import org.mybatis.dynamic.sql.SqlBuilder.isEqualTo
import org.mybatis.dynamic.sql.util.kotlin.*
import org.mybatis.dynamic.sql.util.kotlin.mybatis3.*

fun RoleListMapper.count(completer: CountCompleter) =
    countFrom(this::count, RoleList, completer)

fun RoleListMapper.delete(completer: DeleteCompleter) =
    deleteFrom(this::delete, RoleList, completer)

fun RoleListMapper.deleteByPrimaryKey(role_: String) =
    delete {
        where(role, isEqualTo(role_))
    }

fun RoleListMapper.insert(record: RoleListRecord) =
    insert(this::insert, record, RoleList) {
        map(role).toProperty("role")
    }

fun RoleListMapper.insertMultiple(records: Collection<RoleListRecord>) =
    insertMultiple(this::insertMultiple, records, RoleList) {
        map(role).toProperty("role")
    }

fun RoleListMapper.insertMultiple(vararg records: RoleListRecord) =
    insertMultiple(records.toList())

fun RoleListMapper.insertSelective(record: RoleListRecord) =
    insert(this::insert, record, RoleList) {
        map(role).toPropertyWhenPresent("role", record::role)
    }

private val columnList = listOf(role)

fun RoleListMapper.selectOne(completer: SelectCompleter) =
    selectOne(this::selectOne, columnList, RoleList, completer)

fun RoleListMapper.select(completer: SelectCompleter) =
    selectList(this::selectMany, columnList, RoleList, completer)

fun RoleListMapper.selectDistinct(completer: SelectCompleter) =
    selectDistinct(this::selectMany, columnList, RoleList, completer)

fun RoleListMapper.update(completer: UpdateCompleter) =
    update(this::update, RoleList, completer)

fun KotlinUpdateBuilder.updateAllColumns(record: RoleListRecord) =
    apply {
        set(role).equalTo(record::role)
    }

fun KotlinUpdateBuilder.updateSelectiveColumns(record: RoleListRecord) =
    apply {
        set(role).equalToWhenPresent(record::role)
    }