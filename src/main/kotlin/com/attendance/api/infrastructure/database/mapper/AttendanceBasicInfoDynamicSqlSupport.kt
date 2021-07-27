/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.attendance.api.infrastructure.database.mapper

import java.sql.JDBCType
import java.time.LocalTime
import org.mybatis.dynamic.sql.SqlTable

object AttendanceBasicInfoDynamicSqlSupport {
    object AttendanceBasicInfo : SqlTable("attendance_basic_info") {
        val attendaceId = column<Int>("attendace_id", JDBCType.INTEGER)

        val userId = column<String>("user_id", JDBCType.VARCHAR)

        val year = column<Int>("year", JDBCType.INTEGER)

        val month = column<Int>("month", JDBCType.INTEGER)

        val workStyle1 = column<String>("work_style_1", JDBCType.VARCHAR)

        val startTimeDay1 = column<LocalTime>("start_time_day_1", JDBCType.TIME)

        val endTimeDay1 = column<LocalTime>("end_time_day_1", JDBCType.TIME)

        val breakTimeDay1 = column<LocalTime>("break_time_day_1", JDBCType.TIME)

        val workStyle2 = column<String>("work_style_2", JDBCType.VARCHAR)

        val startTimeDay2 = column<LocalTime>("start_time_day_2", JDBCType.TIME)

        val endTimeDay2 = column<LocalTime>("end_time_day_2", JDBCType.TIME)

        val breakTimeDay2 = column<LocalTime>("break_time_day_2", JDBCType.TIME)

        val workStyle3 = column<String>("work_style_3", JDBCType.VARCHAR)

        val startTimeDay3 = column<LocalTime>("start_time_day_3", JDBCType.TIME)

        val endTimeDay3 = column<LocalTime>("end_time_day_3", JDBCType.TIME)

        val breakTimeDay3 = column<LocalTime>("break_time_day_3", JDBCType.TIME)

        val workStyle4 = column<String>("work_style_4", JDBCType.VARCHAR)

        val startTimeDay4 = column<LocalTime>("start_time_day_4", JDBCType.TIME)

        val endTimeDay4 = column<LocalTime>("end_time_day_4", JDBCType.TIME)

        val breakTimeDay4 = column<LocalTime>("break_time_day_4", JDBCType.TIME)

        val workStyle5 = column<String>("work_style_5", JDBCType.VARCHAR)

        val startTimeDay5 = column<LocalTime>("start_time_day_5", JDBCType.TIME)

        val endTimeDay5 = column<LocalTime>("end_time_day_5", JDBCType.TIME)

        val breakTimeDay5 = column<LocalTime>("break_time_day_5", JDBCType.TIME)

        val workStyle6 = column<String>("work_style_6", JDBCType.VARCHAR)

        val startTimeDay6 = column<LocalTime>("start_time_day_6", JDBCType.TIME)

        val endTimeDay6 = column<LocalTime>("end_time_day_6", JDBCType.TIME)

        val breakTimeDay6 = column<LocalTime>("break_time_day_6", JDBCType.TIME)

        val workStyle7 = column<String>("work_style_7", JDBCType.VARCHAR)

        val startTimeDay7 = column<LocalTime>("start_time_day_7", JDBCType.TIME)

        val endTimeDay7 = column<LocalTime>("end_time_day_7", JDBCType.TIME)

        val breakTimeDay7 = column<LocalTime>("break_time_day_7", JDBCType.TIME)

        val workStyle8 = column<String>("work_style_8", JDBCType.VARCHAR)

        val startTimeDay8 = column<LocalTime>("start_time_day_8", JDBCType.TIME)

        val endTimeDay8 = column<LocalTime>("end_time_day_8", JDBCType.TIME)

        val breakTimeDay8 = column<LocalTime>("break_time_day_8", JDBCType.TIME)

        val workStyle9 = column<String>("work_style_9", JDBCType.VARCHAR)

        val startTimeDay9 = column<LocalTime>("start_time_day_9", JDBCType.TIME)

        val endTimeDay9 = column<LocalTime>("end_time_day_9", JDBCType.TIME)

        val breakTimeDay9 = column<LocalTime>("break_time_day_9", JDBCType.TIME)

        val workStyle10 = column<String>("work_style_10", JDBCType.VARCHAR)

        val startTimeDay10 = column<LocalTime>("start_time_day_10", JDBCType.TIME)

        val endTimeDay10 = column<LocalTime>("end_time_day_10", JDBCType.TIME)

        val breakTimeDay10 = column<LocalTime>("break_time_day_10", JDBCType.TIME)

        val workStyle11 = column<String>("work_style_11", JDBCType.VARCHAR)

        val startTimeDay11 = column<LocalTime>("start_time_day_11", JDBCType.TIME)

        val endTimeDay11 = column<LocalTime>("end_time_day_11", JDBCType.TIME)

        val breakTimeDay11 = column<LocalTime>("break_time_day_11", JDBCType.TIME)

        val workStyle12 = column<String>("work_style_12", JDBCType.VARCHAR)

        val startTimeDay12 = column<LocalTime>("start_time_day_12", JDBCType.TIME)

        val endTimeDay12 = column<LocalTime>("end_time_day_12", JDBCType.TIME)

        val breakTimeDay12 = column<LocalTime>("break_time_day_12", JDBCType.TIME)

        val workStyle13 = column<String>("work_style_13", JDBCType.VARCHAR)

        val startTimeDay13 = column<LocalTime>("start_time_day_13", JDBCType.TIME)

        val endTimeDay13 = column<LocalTime>("end_time_day_13", JDBCType.TIME)

        val breakTimeDay13 = column<LocalTime>("break_time_day_13", JDBCType.TIME)

        val workStyle14 = column<String>("work_style_14", JDBCType.VARCHAR)

        val startTimeDay14 = column<LocalTime>("start_time_day_14", JDBCType.TIME)

        val endTimeDay14 = column<LocalTime>("end_time_day_14", JDBCType.TIME)

        val breakTimeDay14 = column<LocalTime>("break_time_day_14", JDBCType.TIME)

        val workStyle15 = column<String>("work_style_15", JDBCType.VARCHAR)

        val startTimeDay15 = column<LocalTime>("start_time_day_15", JDBCType.TIME)

        val endTimeDay15 = column<LocalTime>("end_time_day_15", JDBCType.TIME)

        val breakTimeDay15 = column<LocalTime>("break_time_day_15", JDBCType.TIME)

        val workStyle16 = column<String>("work_style_16", JDBCType.VARCHAR)

        val startTimeDay16 = column<LocalTime>("start_time_day_16", JDBCType.TIME)

        val endTimeDay16 = column<LocalTime>("end_time_day_16", JDBCType.TIME)

        val breakTimeDay16 = column<LocalTime>("break_time_day_16", JDBCType.TIME)

        val workStyle17 = column<String>("work_style_17", JDBCType.VARCHAR)

        val startTimeDay17 = column<LocalTime>("start_time_day_17", JDBCType.TIME)

        val endTimeDay17 = column<LocalTime>("end_time_day_17", JDBCType.TIME)

        val breakTimeDay17 = column<LocalTime>("break_time_day_17", JDBCType.TIME)

        val workStyle18 = column<String>("work_style_18", JDBCType.VARCHAR)

        val startTimeDay18 = column<LocalTime>("start_time_day_18", JDBCType.TIME)

        val endTimeDay18 = column<LocalTime>("end_time_day_18", JDBCType.TIME)

        val breakTimeDay18 = column<LocalTime>("break_time_day_18", JDBCType.TIME)

        val workStyle19 = column<String>("work_style_19", JDBCType.VARCHAR)

        val startTimeDay19 = column<LocalTime>("start_time_day_19", JDBCType.TIME)

        val endTimeDay19 = column<LocalTime>("end_time_day_19", JDBCType.TIME)

        val breakTimeDay19 = column<LocalTime>("break_time_day_19", JDBCType.TIME)

        val workStyle20 = column<String>("work_style_20", JDBCType.VARCHAR)

        val startTimeDay20 = column<LocalTime>("start_time_day_20", JDBCType.TIME)

        val endTimeDay20 = column<LocalTime>("end_time_day_20", JDBCType.TIME)

        val breakTimeDay20 = column<LocalTime>("break_time_day_20", JDBCType.TIME)

        val workStyle21 = column<String>("work_style_21", JDBCType.VARCHAR)

        val startTimeDay21 = column<LocalTime>("start_time_day_21", JDBCType.TIME)

        val endTimeDay21 = column<LocalTime>("end_time_day_21", JDBCType.TIME)

        val breakTimeDay21 = column<LocalTime>("break_time_day_21", JDBCType.TIME)

        val workStyle22 = column<String>("work_style_22", JDBCType.VARCHAR)

        val startTimeDay22 = column<LocalTime>("start_time_day_22", JDBCType.TIME)

        val endTimeDay22 = column<LocalTime>("end_time_day_22", JDBCType.TIME)

        val breakTimeDay22 = column<LocalTime>("break_time_day_22", JDBCType.TIME)

        val workStyle23 = column<String>("work_style_23", JDBCType.VARCHAR)

        val startTimeDay23 = column<LocalTime>("start_time_day_23", JDBCType.TIME)

        val endTimeDay23 = column<LocalTime>("end_time_day_23", JDBCType.TIME)

        val breakTimeDay23 = column<LocalTime>("break_time_day_23", JDBCType.TIME)

        val workStyle24 = column<String>("work_style_24", JDBCType.VARCHAR)

        val startTimeDay24 = column<LocalTime>("start_time_day_24", JDBCType.TIME)

        val endTimeDay24 = column<LocalTime>("end_time_day_24", JDBCType.TIME)

        val breakTimeDay24 = column<LocalTime>("break_time_day_24", JDBCType.TIME)

        val workStyle25 = column<String>("work_style_25", JDBCType.VARCHAR)

        val startTimeDay25 = column<LocalTime>("start_time_day_25", JDBCType.TIME)

        val endTimeDay25 = column<LocalTime>("end_time_day_25", JDBCType.TIME)

        val breakTimeDay25 = column<LocalTime>("break_time_day_25", JDBCType.TIME)

        val workStyle26 = column<String>("work_style_26", JDBCType.VARCHAR)

        val startTimeDay26 = column<LocalTime>("start_time_day_26", JDBCType.TIME)

        val endTimeDay26 = column<LocalTime>("end_time_day_26", JDBCType.TIME)

        val breakTimeDay26 = column<LocalTime>("break_time_day_26", JDBCType.TIME)

        val workStyle27 = column<String>("work_style_27", JDBCType.VARCHAR)

        val startTimeDay27 = column<LocalTime>("start_time_day_27", JDBCType.TIME)

        val endTimeDay27 = column<LocalTime>("end_time_day_27", JDBCType.TIME)

        val breakTimeDay27 = column<LocalTime>("break_time_day_27", JDBCType.TIME)

        val workStyle28 = column<String>("work_style_28", JDBCType.VARCHAR)

        val startTimeDay28 = column<LocalTime>("start_time_day_28", JDBCType.TIME)

        val endTimeDay28 = column<LocalTime>("end_time_day_28", JDBCType.TIME)

        val breakTimeDay28 = column<LocalTime>("break_time_day_28", JDBCType.TIME)

        val workStyle29 = column<String>("work_style_29", JDBCType.VARCHAR)

        val startTimeDay29 = column<LocalTime>("start_time_day_29", JDBCType.TIME)

        val endTimeDay29 = column<LocalTime>("end_time_day_29", JDBCType.TIME)

        val breakTimeDay29 = column<LocalTime>("break_time_day_29", JDBCType.TIME)

        val workStyle30 = column<String>("work_style_30", JDBCType.VARCHAR)

        val startTimeDay30 = column<LocalTime>("start_time_day_30", JDBCType.TIME)

        val endTimeDay30 = column<LocalTime>("end_time_day_30", JDBCType.TIME)

        val breakTimeDay30 = column<LocalTime>("break_time_day_30", JDBCType.TIME)

        val workStyle31 = column<String>("work_style_31", JDBCType.VARCHAR)

        val startTimeDay31 = column<LocalTime>("start_time_day_31", JDBCType.TIME)

        val endTimeDay31 = column<LocalTime>("end_time_day_31", JDBCType.TIME)

        val breakTimeDay31 = column<LocalTime>("break_time_day_31", JDBCType.TIME)
    }
}