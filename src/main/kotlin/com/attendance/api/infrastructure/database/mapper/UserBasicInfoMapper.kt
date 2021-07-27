/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.attendance.api.infrastructure.database.mapper

import com.attendance.api.infrastructure.database.record.UserBasicInfoRecord
import org.apache.ibatis.annotations.DeleteProvider
import org.apache.ibatis.annotations.InsertProvider
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Result
import org.apache.ibatis.annotations.ResultMap
import org.apache.ibatis.annotations.Results
import org.apache.ibatis.annotations.SelectProvider
import org.apache.ibatis.annotations.UpdateProvider
import org.apache.ibatis.type.JdbcType
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider
import org.mybatis.dynamic.sql.insert.render.MultiRowInsertStatementProvider
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider
import org.mybatis.dynamic.sql.util.SqlProviderAdapter

@Mapper
interface UserBasicInfoMapper {
    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    fun count(selectStatement: SelectStatementProvider): Long

    @DeleteProvider(type=SqlProviderAdapter::class, method="delete")
    fun delete(deleteStatement: DeleteStatementProvider): Int

    @InsertProvider(type=SqlProviderAdapter::class, method="insert")
    fun insert(insertStatement: InsertStatementProvider<UserBasicInfoRecord>): Int

    @InsertProvider(type=SqlProviderAdapter::class, method="insertMultiple")
    fun insertMultiple(multipleInsertStatement: MultiRowInsertStatementProvider<UserBasicInfoRecord>): Int

    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @ResultMap("UserBasicInfoRecordResult")
    fun selectOne(selectStatement: SelectStatementProvider): UserBasicInfoRecord?

    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @Results(id="UserBasicInfoRecordResult", value = [
        Result(column="user_id", property="userId", jdbcType=JdbcType.VARCHAR, id=true),
        Result(column="user_last_name", property="userLastName", jdbcType=JdbcType.VARCHAR),
        Result(column="user_last_name_reading", property="userLastNameReading", jdbcType=JdbcType.VARCHAR),
        Result(column="user_first_name", property="userFirstName", jdbcType=JdbcType.VARCHAR),
        Result(column="user_first_name_reading", property="userFirstNameReading", jdbcType=JdbcType.VARCHAR),
        Result(column="birthday", property="birthday", jdbcType=JdbcType.DATE),
        Result(column="age", property="age", jdbcType=JdbcType.TINYINT),
        Result(column="postal_code", property="postalCode", jdbcType=JdbcType.INTEGER),
        Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        Result(column="role_type", property="roleType", jdbcType=JdbcType.VARCHAR)
    ])
    fun selectMany(selectStatement: SelectStatementProvider): List<UserBasicInfoRecord>

    @UpdateProvider(type=SqlProviderAdapter::class, method="update")
    fun update(updateStatement: UpdateStatementProvider): Int
}