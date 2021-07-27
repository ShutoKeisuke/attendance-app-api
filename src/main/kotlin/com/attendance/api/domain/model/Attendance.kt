package com.attendance.api.domain.model

import com.attendance.api.infrastructure.database.record.AttendanceBasicInfoRecord
import java.time.LocalTime

data class AttendanceBasicInfo(
        val attendanceId: Int? = null,
        val userId: String,
        val year: Int,
        val month: Int,
        val attendanceList: List<AttendanceListItem>?
) {
    constructor(attendanceBasicInfoRecord: AttendanceBasicInfoRecord) : this (
        attendanceBasicInfoRecord.attendaceId,
        attendanceBasicInfoRecord.userId!!,
        attendanceBasicInfoRecord.year!!,
        attendanceBasicInfoRecord.month!!,
        listOf(
                AttendanceListItem(attendanceBasicInfoRecord.workStyle1, attendanceBasicInfoRecord.startTimeDay1, attendanceBasicInfoRecord.endTimeDay1, attendanceBasicInfoRecord.breakTimeDay1),
                AttendanceListItem(attendanceBasicInfoRecord.workStyle2, attendanceBasicInfoRecord.startTimeDay2, attendanceBasicInfoRecord.endTimeDay2, attendanceBasicInfoRecord.breakTimeDay2),
                AttendanceListItem(attendanceBasicInfoRecord.workStyle3, attendanceBasicInfoRecord.startTimeDay3, attendanceBasicInfoRecord.endTimeDay3, attendanceBasicInfoRecord.breakTimeDay3),
                AttendanceListItem(attendanceBasicInfoRecord.workStyle4, attendanceBasicInfoRecord.startTimeDay4, attendanceBasicInfoRecord.endTimeDay4, attendanceBasicInfoRecord.breakTimeDay4),
                AttendanceListItem(attendanceBasicInfoRecord.workStyle5, attendanceBasicInfoRecord.startTimeDay5, attendanceBasicInfoRecord.endTimeDay5, attendanceBasicInfoRecord.breakTimeDay5),
                AttendanceListItem(attendanceBasicInfoRecord.workStyle6, attendanceBasicInfoRecord.startTimeDay6, attendanceBasicInfoRecord.endTimeDay6, attendanceBasicInfoRecord.breakTimeDay6),
                AttendanceListItem(attendanceBasicInfoRecord.workStyle7, attendanceBasicInfoRecord.startTimeDay7, attendanceBasicInfoRecord.endTimeDay7, attendanceBasicInfoRecord.breakTimeDay7),
                AttendanceListItem(attendanceBasicInfoRecord.workStyle8, attendanceBasicInfoRecord.startTimeDay8, attendanceBasicInfoRecord.endTimeDay8, attendanceBasicInfoRecord.breakTimeDay8),
                AttendanceListItem(attendanceBasicInfoRecord.workStyle9, attendanceBasicInfoRecord.startTimeDay9, attendanceBasicInfoRecord.endTimeDay9, attendanceBasicInfoRecord.breakTimeDay9),
                AttendanceListItem(attendanceBasicInfoRecord.workStyle10, attendanceBasicInfoRecord.startTimeDay10, attendanceBasicInfoRecord.endTimeDay10, attendanceBasicInfoRecord.breakTimeDay10),
                AttendanceListItem(attendanceBasicInfoRecord.workStyle11, attendanceBasicInfoRecord.startTimeDay11, attendanceBasicInfoRecord.endTimeDay11, attendanceBasicInfoRecord.breakTimeDay11),
                AttendanceListItem(attendanceBasicInfoRecord.workStyle12, attendanceBasicInfoRecord.startTimeDay12, attendanceBasicInfoRecord.endTimeDay12, attendanceBasicInfoRecord.breakTimeDay12),
                AttendanceListItem(attendanceBasicInfoRecord.workStyle13, attendanceBasicInfoRecord.startTimeDay13, attendanceBasicInfoRecord.endTimeDay13, attendanceBasicInfoRecord.breakTimeDay13),
                AttendanceListItem(attendanceBasicInfoRecord.workStyle14, attendanceBasicInfoRecord.startTimeDay14, attendanceBasicInfoRecord.endTimeDay14, attendanceBasicInfoRecord.breakTimeDay14),
                AttendanceListItem(attendanceBasicInfoRecord.workStyle15, attendanceBasicInfoRecord.startTimeDay15, attendanceBasicInfoRecord.endTimeDay15, attendanceBasicInfoRecord.breakTimeDay15),
                AttendanceListItem(attendanceBasicInfoRecord.workStyle16, attendanceBasicInfoRecord.startTimeDay16, attendanceBasicInfoRecord.endTimeDay16, attendanceBasicInfoRecord.breakTimeDay16),
                AttendanceListItem(attendanceBasicInfoRecord.workStyle17, attendanceBasicInfoRecord.startTimeDay17, attendanceBasicInfoRecord.endTimeDay17, attendanceBasicInfoRecord.breakTimeDay17),
                AttendanceListItem(attendanceBasicInfoRecord.workStyle18, attendanceBasicInfoRecord.startTimeDay18, attendanceBasicInfoRecord.endTimeDay18, attendanceBasicInfoRecord.breakTimeDay18),
                AttendanceListItem(attendanceBasicInfoRecord.workStyle19, attendanceBasicInfoRecord.startTimeDay19, attendanceBasicInfoRecord.endTimeDay19, attendanceBasicInfoRecord.breakTimeDay19),
                AttendanceListItem(attendanceBasicInfoRecord.workStyle20, attendanceBasicInfoRecord.startTimeDay20, attendanceBasicInfoRecord.endTimeDay20, attendanceBasicInfoRecord.breakTimeDay20),
                AttendanceListItem(attendanceBasicInfoRecord.workStyle21, attendanceBasicInfoRecord.startTimeDay21, attendanceBasicInfoRecord.endTimeDay21, attendanceBasicInfoRecord.breakTimeDay21),
                AttendanceListItem(attendanceBasicInfoRecord.workStyle22, attendanceBasicInfoRecord.startTimeDay22, attendanceBasicInfoRecord.endTimeDay22, attendanceBasicInfoRecord.breakTimeDay22),
                AttendanceListItem(attendanceBasicInfoRecord.workStyle23, attendanceBasicInfoRecord.startTimeDay23, attendanceBasicInfoRecord.endTimeDay23, attendanceBasicInfoRecord.breakTimeDay23),
                AttendanceListItem(attendanceBasicInfoRecord.workStyle24, attendanceBasicInfoRecord.startTimeDay24, attendanceBasicInfoRecord.endTimeDay24, attendanceBasicInfoRecord.breakTimeDay24),
                AttendanceListItem(attendanceBasicInfoRecord.workStyle25, attendanceBasicInfoRecord.startTimeDay25, attendanceBasicInfoRecord.endTimeDay25, attendanceBasicInfoRecord.breakTimeDay25),
                AttendanceListItem(attendanceBasicInfoRecord.workStyle26, attendanceBasicInfoRecord.startTimeDay26, attendanceBasicInfoRecord.endTimeDay26, attendanceBasicInfoRecord.breakTimeDay26),
                AttendanceListItem(attendanceBasicInfoRecord.workStyle27, attendanceBasicInfoRecord.startTimeDay27, attendanceBasicInfoRecord.endTimeDay27, attendanceBasicInfoRecord.breakTimeDay27),
                AttendanceListItem(attendanceBasicInfoRecord.workStyle28, attendanceBasicInfoRecord.startTimeDay28, attendanceBasicInfoRecord.endTimeDay28, attendanceBasicInfoRecord.breakTimeDay28),
                AttendanceListItem(attendanceBasicInfoRecord.workStyle29, attendanceBasicInfoRecord.startTimeDay29, attendanceBasicInfoRecord.endTimeDay29, attendanceBasicInfoRecord.breakTimeDay29),
                AttendanceListItem(attendanceBasicInfoRecord.workStyle30, attendanceBasicInfoRecord.startTimeDay30, attendanceBasicInfoRecord.endTimeDay30, attendanceBasicInfoRecord.breakTimeDay30),
                AttendanceListItem(attendanceBasicInfoRecord.workStyle31, attendanceBasicInfoRecord.startTimeDay31, attendanceBasicInfoRecord.endTimeDay31, attendanceBasicInfoRecord.breakTimeDay31),
        )
    )
}

data class AttendanceListItem(
        val workStyle: String? = null,
        val startTime: LocalTime? = null,
        val endTime: LocalTime? = null,
        val breakTime: LocalTime? = null
)
