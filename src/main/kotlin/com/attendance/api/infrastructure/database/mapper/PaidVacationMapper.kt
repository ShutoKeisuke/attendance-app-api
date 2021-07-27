/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.attendance.api.infrastructure.database.mapper

import com.attendance.api.infrastructure.database.record.PaidVacationRecord
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
interface PaidVacationMapper {
    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    fun count(selectStatement: SelectStatementProvider): Long

    @DeleteProvider(type=SqlProviderAdapter::class, method="delete")
    fun delete(deleteStatement: DeleteStatementProvider): Int

    @InsertProvider(type=SqlProviderAdapter::class, method="insert")
    fun insert(insertStatement: InsertStatementProvider<PaidVacationRecord>): Int

    @InsertProvider(type=SqlProviderAdapter::class, method="insertMultiple")
    fun insertMultiple(multipleInsertStatement: MultiRowInsertStatementProvider<PaidVacationRecord>): Int

    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @ResultMap("PaidVacationRecordResult")
    fun selectOne(selectStatement: SelectStatementProvider): PaidVacationRecord?

    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @Results(id="PaidVacationRecordResult", value = [
        Result(column="paid_vacation_id", property="paidVacationId", jdbcType=JdbcType.INTEGER, id=true),
        Result(column="attendance_id", property="attendanceId", jdbcType=JdbcType.INTEGER),
        Result(column="date", property="date", jdbcType=JdbcType.DATE),
        Result(column="paid_vacation_time", property="paidVacationTime", jdbcType=JdbcType.TIME)
    ])
    fun selectMany(selectStatement: SelectStatementProvider): List<PaidVacationRecord>

    @UpdateProvider(type=SqlProviderAdapter::class, method="update")
    fun update(updateStatement: UpdateStatementProvider): Int
}