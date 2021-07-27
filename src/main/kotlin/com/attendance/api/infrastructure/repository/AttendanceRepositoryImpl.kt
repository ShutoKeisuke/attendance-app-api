package com.attendance.api.infrastructure.repository

import com.attendance.api.domain.model.AttendanceBasicInfo
import com.attendance.api.domain.repository.AttendanceRepository
import com.attendance.api.infrastructure.database.mapper.AttendanceBasicInfoDynamicSqlSupport
import com.attendance.api.infrastructure.database.mapper.AttendanceBasicInfoMapper
import com.attendance.api.infrastructure.database.mapper.selectOne
import org.mybatis.dynamic.sql.SqlBuilder.isEqualTo
import org.springframework.stereotype.Repository

@Repository
@Suppress("SpringJavaInjectionPointsAutowiringInspection")
class AttendanceRepositoryImpl(
        private val attendanceBasicInfoMapper: AttendanceBasicInfoMapper
) : AttendanceRepository {
    override fun getAttendanceBasicInfoByUserId(userId: String, year: Int, month: Int): AttendanceBasicInfo {
        val record = attendanceBasicInfoMapper.selectOne {
            where(AttendanceBasicInfoDynamicSqlSupport.AttendanceBasicInfo.userId, isEqualTo(userId))
                    .and(AttendanceBasicInfoDynamicSqlSupport.AttendanceBasicInfo.year, isEqualTo(year))
                    .and(AttendanceBasicInfoDynamicSqlSupport.AttendanceBasicInfo.month, isEqualTo(month))
        }

        println("getAttendanceBasicInfoByUserId")
        println(record)

        return if (record == null) {
            AttendanceBasicInfo(null, userId, year, month, null)
        } else {
            AttendanceBasicInfo(record)
        }
    }
}