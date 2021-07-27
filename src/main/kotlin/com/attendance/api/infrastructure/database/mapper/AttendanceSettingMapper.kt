/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.attendance.api.infrastructure.database.mapper

import com.attendance.api.infrastructure.database.record.AttendanceSettingRecord
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
interface AttendanceSettingMapper {
    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    fun count(selectStatement: SelectStatementProvider): Long

    @DeleteProvider(type=SqlProviderAdapter::class, method="delete")
    fun delete(deleteStatement: DeleteStatementProvider): Int

    @InsertProvider(type=SqlProviderAdapter::class, method="insert")
    fun insert(insertStatement: InsertStatementProvider<AttendanceSettingRecord>): Int

    @InsertProvider(type=SqlProviderAdapter::class, method="insertMultiple")
    fun insertMultiple(multipleInsertStatement: MultiRowInsertStatementProvider<AttendanceSettingRecord>): Int

    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @ResultMap("AttendanceSettingRecordResult")
    fun selectOne(selectStatement: SelectStatementProvider): AttendanceSettingRecord?

    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @Results(id="AttendanceSettingRecordResult", value = [
        Result(column="setting_id", property="settingId", jdbcType=JdbcType.INTEGER, id=true),
        Result(column="attendace_id", property="attendaceId", jdbcType=JdbcType.INTEGER),
        Result(column="scheduled_working_days", property="scheduledWorkingDays", jdbcType=JdbcType.TINYINT),
        Result(column="actual_working_days", property="actualWorkingDays", jdbcType=JdbcType.TINYINT),
        Result(column="remaining_paid_days", property="remainingPaidDays", jdbcType=JdbcType.TINYINT),
        Result(column="paid_vacation_digestion_days", property="paidVacationDigestionDays", jdbcType=JdbcType.DECIMAL),
        Result(column="special_vacation_days", property="specialVacationDays", jdbcType=JdbcType.DECIMAL),
        Result(column="absence_days", property="absenceDays", jdbcType=JdbcType.DECIMAL),
        Result(column="standard_start_time", property="standardStartTime", jdbcType=JdbcType.TIME),
        Result(column="standard_end_time", property="standardEndTime", jdbcType=JdbcType.TIME)
    ])
    fun selectMany(selectStatement: SelectStatementProvider): List<AttendanceSettingRecord>

    @UpdateProvider(type=SqlProviderAdapter::class, method="update")
    fun update(updateStatement: UpdateStatementProvider): Int
}