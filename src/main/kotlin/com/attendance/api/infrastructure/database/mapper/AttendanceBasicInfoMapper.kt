/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.attendance.api.infrastructure.database.mapper

import com.attendance.api.infrastructure.database.record.AttendanceBasicInfoRecord
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
interface AttendanceBasicInfoMapper {
    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    fun count(selectStatement: SelectStatementProvider): Long

    @DeleteProvider(type=SqlProviderAdapter::class, method="delete")
    fun delete(deleteStatement: DeleteStatementProvider): Int

    @InsertProvider(type=SqlProviderAdapter::class, method="insert")
    fun insert(insertStatement: InsertStatementProvider<AttendanceBasicInfoRecord>): Int

    @InsertProvider(type=SqlProviderAdapter::class, method="insertMultiple")
    fun insertMultiple(multipleInsertStatement: MultiRowInsertStatementProvider<AttendanceBasicInfoRecord>): Int

    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @ResultMap("AttendanceBasicInfoRecordResult")
    fun selectOne(selectStatement: SelectStatementProvider): AttendanceBasicInfoRecord?

    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @Results(id="AttendanceBasicInfoRecordResult", value = [
        Result(column="attendace_id", property="attendaceId", jdbcType=JdbcType.INTEGER, id=true),
        Result(column="user_id", property="userId", jdbcType=JdbcType.VARCHAR),
        Result(column="year", property="year", jdbcType=JdbcType.INTEGER),
        Result(column="month", property="month", jdbcType=JdbcType.INTEGER),
        Result(column="work_style_1", property="workStyle1", jdbcType=JdbcType.VARCHAR),
        Result(column="start_time_day_1", property="startTimeDay1", jdbcType=JdbcType.TIME),
        Result(column="end_time_day_1", property="endTimeDay1", jdbcType=JdbcType.TIME),
        Result(column="break_time_day_1", property="breakTimeDay1", jdbcType=JdbcType.TIME),
        Result(column="work_style_2", property="workStyle2", jdbcType=JdbcType.VARCHAR),
        Result(column="start_time_day_2", property="startTimeDay2", jdbcType=JdbcType.TIME),
        Result(column="end_time_day_2", property="endTimeDay2", jdbcType=JdbcType.TIME),
        Result(column="break_time_day_2", property="breakTimeDay2", jdbcType=JdbcType.TIME),
        Result(column="work_style_3", property="workStyle3", jdbcType=JdbcType.VARCHAR),
        Result(column="start_time_day_3", property="startTimeDay3", jdbcType=JdbcType.TIME),
        Result(column="end_time_day_3", property="endTimeDay3", jdbcType=JdbcType.TIME),
        Result(column="break_time_day_3", property="breakTimeDay3", jdbcType=JdbcType.TIME),
        Result(column="work_style_4", property="workStyle4", jdbcType=JdbcType.VARCHAR),
        Result(column="start_time_day_4", property="startTimeDay4", jdbcType=JdbcType.TIME),
        Result(column="end_time_day_4", property="endTimeDay4", jdbcType=JdbcType.TIME),
        Result(column="break_time_day_4", property="breakTimeDay4", jdbcType=JdbcType.TIME),
        Result(column="work_style_5", property="workStyle5", jdbcType=JdbcType.VARCHAR),
        Result(column="start_time_day_5", property="startTimeDay5", jdbcType=JdbcType.TIME),
        Result(column="end_time_day_5", property="endTimeDay5", jdbcType=JdbcType.TIME),
        Result(column="break_time_day_5", property="breakTimeDay5", jdbcType=JdbcType.TIME),
        Result(column="work_style_6", property="workStyle6", jdbcType=JdbcType.VARCHAR),
        Result(column="start_time_day_6", property="startTimeDay6", jdbcType=JdbcType.TIME),
        Result(column="end_time_day_6", property="endTimeDay6", jdbcType=JdbcType.TIME),
        Result(column="break_time_day_6", property="breakTimeDay6", jdbcType=JdbcType.TIME),
        Result(column="work_style_7", property="workStyle7", jdbcType=JdbcType.VARCHAR),
        Result(column="start_time_day_7", property="startTimeDay7", jdbcType=JdbcType.TIME),
        Result(column="end_time_day_7", property="endTimeDay7", jdbcType=JdbcType.TIME),
        Result(column="break_time_day_7", property="breakTimeDay7", jdbcType=JdbcType.TIME),
        Result(column="work_style_8", property="workStyle8", jdbcType=JdbcType.VARCHAR),
        Result(column="start_time_day_8", property="startTimeDay8", jdbcType=JdbcType.TIME),
        Result(column="end_time_day_8", property="endTimeDay8", jdbcType=JdbcType.TIME),
        Result(column="break_time_day_8", property="breakTimeDay8", jdbcType=JdbcType.TIME),
        Result(column="work_style_9", property="workStyle9", jdbcType=JdbcType.VARCHAR),
        Result(column="start_time_day_9", property="startTimeDay9", jdbcType=JdbcType.TIME),
        Result(column="end_time_day_9", property="endTimeDay9", jdbcType=JdbcType.TIME),
        Result(column="break_time_day_9", property="breakTimeDay9", jdbcType=JdbcType.TIME),
        Result(column="work_style_10", property="workStyle10", jdbcType=JdbcType.VARCHAR),
        Result(column="start_time_day_10", property="startTimeDay10", jdbcType=JdbcType.TIME),
        Result(column="end_time_day_10", property="endTimeDay10", jdbcType=JdbcType.TIME),
        Result(column="break_time_day_10", property="breakTimeDay10", jdbcType=JdbcType.TIME),
        Result(column="work_style_11", property="workStyle11", jdbcType=JdbcType.VARCHAR),
        Result(column="start_time_day_11", property="startTimeDay11", jdbcType=JdbcType.TIME),
        Result(column="end_time_day_11", property="endTimeDay11", jdbcType=JdbcType.TIME),
        Result(column="break_time_day_11", property="breakTimeDay11", jdbcType=JdbcType.TIME),
        Result(column="work_style_12", property="workStyle12", jdbcType=JdbcType.VARCHAR),
        Result(column="start_time_day_12", property="startTimeDay12", jdbcType=JdbcType.TIME),
        Result(column="end_time_day_12", property="endTimeDay12", jdbcType=JdbcType.TIME),
        Result(column="break_time_day_12", property="breakTimeDay12", jdbcType=JdbcType.TIME),
        Result(column="work_style_13", property="workStyle13", jdbcType=JdbcType.VARCHAR),
        Result(column="start_time_day_13", property="startTimeDay13", jdbcType=JdbcType.TIME),
        Result(column="end_time_day_13", property="endTimeDay13", jdbcType=JdbcType.TIME),
        Result(column="break_time_day_13", property="breakTimeDay13", jdbcType=JdbcType.TIME),
        Result(column="work_style_14", property="workStyle14", jdbcType=JdbcType.VARCHAR),
        Result(column="start_time_day_14", property="startTimeDay14", jdbcType=JdbcType.TIME),
        Result(column="end_time_day_14", property="endTimeDay14", jdbcType=JdbcType.TIME),
        Result(column="break_time_day_14", property="breakTimeDay14", jdbcType=JdbcType.TIME),
        Result(column="work_style_15", property="workStyle15", jdbcType=JdbcType.VARCHAR),
        Result(column="start_time_day_15", property="startTimeDay15", jdbcType=JdbcType.TIME),
        Result(column="end_time_day_15", property="endTimeDay15", jdbcType=JdbcType.TIME),
        Result(column="break_time_day_15", property="breakTimeDay15", jdbcType=JdbcType.TIME),
        Result(column="work_style_16", property="workStyle16", jdbcType=JdbcType.VARCHAR),
        Result(column="start_time_day_16", property="startTimeDay16", jdbcType=JdbcType.TIME),
        Result(column="end_time_day_16", property="endTimeDay16", jdbcType=JdbcType.TIME),
        Result(column="break_time_day_16", property="breakTimeDay16", jdbcType=JdbcType.TIME),
        Result(column="work_style_17", property="workStyle17", jdbcType=JdbcType.VARCHAR),
        Result(column="start_time_day_17", property="startTimeDay17", jdbcType=JdbcType.TIME),
        Result(column="end_time_day_17", property="endTimeDay17", jdbcType=JdbcType.TIME),
        Result(column="break_time_day_17", property="breakTimeDay17", jdbcType=JdbcType.TIME),
        Result(column="work_style_18", property="workStyle18", jdbcType=JdbcType.VARCHAR),
        Result(column="start_time_day_18", property="startTimeDay18", jdbcType=JdbcType.TIME),
        Result(column="end_time_day_18", property="endTimeDay18", jdbcType=JdbcType.TIME),
        Result(column="break_time_day_18", property="breakTimeDay18", jdbcType=JdbcType.TIME),
        Result(column="work_style_19", property="workStyle19", jdbcType=JdbcType.VARCHAR),
        Result(column="start_time_day_19", property="startTimeDay19", jdbcType=JdbcType.TIME),
        Result(column="end_time_day_19", property="endTimeDay19", jdbcType=JdbcType.TIME),
        Result(column="break_time_day_19", property="breakTimeDay19", jdbcType=JdbcType.TIME),
        Result(column="work_style_20", property="workStyle20", jdbcType=JdbcType.VARCHAR),
        Result(column="start_time_day_20", property="startTimeDay20", jdbcType=JdbcType.TIME),
        Result(column="end_time_day_20", property="endTimeDay20", jdbcType=JdbcType.TIME),
        Result(column="break_time_day_20", property="breakTimeDay20", jdbcType=JdbcType.TIME),
        Result(column="work_style_21", property="workStyle21", jdbcType=JdbcType.VARCHAR),
        Result(column="start_time_day_21", property="startTimeDay21", jdbcType=JdbcType.TIME),
        Result(column="end_time_day_21", property="endTimeDay21", jdbcType=JdbcType.TIME),
        Result(column="break_time_day_21", property="breakTimeDay21", jdbcType=JdbcType.TIME),
        Result(column="work_style_22", property="workStyle22", jdbcType=JdbcType.VARCHAR),
        Result(column="start_time_day_22", property="startTimeDay22", jdbcType=JdbcType.TIME),
        Result(column="end_time_day_22", property="endTimeDay22", jdbcType=JdbcType.TIME),
        Result(column="break_time_day_22", property="breakTimeDay22", jdbcType=JdbcType.TIME),
        Result(column="work_style_23", property="workStyle23", jdbcType=JdbcType.VARCHAR),
        Result(column="start_time_day_23", property="startTimeDay23", jdbcType=JdbcType.TIME),
        Result(column="end_time_day_23", property="endTimeDay23", jdbcType=JdbcType.TIME),
        Result(column="break_time_day_23", property="breakTimeDay23", jdbcType=JdbcType.TIME),
        Result(column="work_style_24", property="workStyle24", jdbcType=JdbcType.VARCHAR),
        Result(column="start_time_day_24", property="startTimeDay24", jdbcType=JdbcType.TIME),
        Result(column="end_time_day_24", property="endTimeDay24", jdbcType=JdbcType.TIME),
        Result(column="break_time_day_24", property="breakTimeDay24", jdbcType=JdbcType.TIME),
        Result(column="work_style_25", property="workStyle25", jdbcType=JdbcType.VARCHAR),
        Result(column="start_time_day_25", property="startTimeDay25", jdbcType=JdbcType.TIME),
        Result(column="end_time_day_25", property="endTimeDay25", jdbcType=JdbcType.TIME),
        Result(column="break_time_day_25", property="breakTimeDay25", jdbcType=JdbcType.TIME),
        Result(column="work_style_26", property="workStyle26", jdbcType=JdbcType.VARCHAR),
        Result(column="start_time_day_26", property="startTimeDay26", jdbcType=JdbcType.TIME),
        Result(column="end_time_day_26", property="endTimeDay26", jdbcType=JdbcType.TIME),
        Result(column="break_time_day_26", property="breakTimeDay26", jdbcType=JdbcType.TIME),
        Result(column="work_style_27", property="workStyle27", jdbcType=JdbcType.VARCHAR),
        Result(column="start_time_day_27", property="startTimeDay27", jdbcType=JdbcType.TIME),
        Result(column="end_time_day_27", property="endTimeDay27", jdbcType=JdbcType.TIME),
        Result(column="break_time_day_27", property="breakTimeDay27", jdbcType=JdbcType.TIME),
        Result(column="work_style_28", property="workStyle28", jdbcType=JdbcType.VARCHAR),
        Result(column="start_time_day_28", property="startTimeDay28", jdbcType=JdbcType.TIME),
        Result(column="end_time_day_28", property="endTimeDay28", jdbcType=JdbcType.TIME),
        Result(column="break_time_day_28", property="breakTimeDay28", jdbcType=JdbcType.TIME),
        Result(column="work_style_29", property="workStyle29", jdbcType=JdbcType.VARCHAR),
        Result(column="start_time_day_29", property="startTimeDay29", jdbcType=JdbcType.TIME),
        Result(column="end_time_day_29", property="endTimeDay29", jdbcType=JdbcType.TIME),
        Result(column="break_time_day_29", property="breakTimeDay29", jdbcType=JdbcType.TIME),
        Result(column="work_style_30", property="workStyle30", jdbcType=JdbcType.VARCHAR),
        Result(column="start_time_day_30", property="startTimeDay30", jdbcType=JdbcType.TIME),
        Result(column="end_time_day_30", property="endTimeDay30", jdbcType=JdbcType.TIME),
        Result(column="break_time_day_30", property="breakTimeDay30", jdbcType=JdbcType.TIME),
        Result(column="work_style_31", property="workStyle31", jdbcType=JdbcType.VARCHAR),
        Result(column="start_time_day_31", property="startTimeDay31", jdbcType=JdbcType.TIME),
        Result(column="end_time_day_31", property="endTimeDay31", jdbcType=JdbcType.TIME),
        Result(column="break_time_day_31", property="breakTimeDay31", jdbcType=JdbcType.TIME)
    ])
    fun selectMany(selectStatement: SelectStatementProvider): List<AttendanceBasicInfoRecord>

    @UpdateProvider(type=SqlProviderAdapter::class, method="update")
    fun update(updateStatement: UpdateStatementProvider): Int
}