/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.attendance.api.infrastructure.database.mapper

import com.attendance.api.infrastructure.database.record.UserDetailInfoRecord
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
interface UserDetailInfoMapper {
    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    fun count(selectStatement: SelectStatementProvider): Long

    @DeleteProvider(type=SqlProviderAdapter::class, method="delete")
    fun delete(deleteStatement: DeleteStatementProvider): Int

    @InsertProvider(type=SqlProviderAdapter::class, method="insert")
    fun insert(insertStatement: InsertStatementProvider<UserDetailInfoRecord>): Int

    @InsertProvider(type=SqlProviderAdapter::class, method="insertMultiple")
    fun insertMultiple(multipleInsertStatement: MultiRowInsertStatementProvider<UserDetailInfoRecord>): Int

    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @ResultMap("UserDetailInfoRecordResult")
    fun selectOne(selectStatement: SelectStatementProvider): UserDetailInfoRecord?

    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @Results(id="UserDetailInfoRecordResult", value = [
        Result(column="user_detail_id", property="userDetailId", jdbcType=JdbcType.INTEGER, id=true),
        Result(column="user_id", property="userId", jdbcType=JdbcType.VARCHAR),
        Result(column="employment_status", property="employmentStatus", jdbcType=JdbcType.VARCHAR),
        Result(column="department", property="department", jdbcType=JdbcType.VARCHAR),
        Result(column="hire_date", property="hireDate", jdbcType=JdbcType.DATE),
        Result(column="retirement_date", property="retirementDate", jdbcType=JdbcType.DATE),
        Result(column="retirement_flg", property="retirementFlg", jdbcType=JdbcType.TINYINT),
        Result(column="registration_date", property="registrationDate", jdbcType=JdbcType.DATE),
        Result(column="update_date", property="updateDate", jdbcType=JdbcType.DATE)
    ])
    fun selectMany(selectStatement: SelectStatementProvider): List<UserDetailInfoRecord>

    @UpdateProvider(type=SqlProviderAdapter::class, method="update")
    fun update(updateStatement: UpdateStatementProvider): Int
}