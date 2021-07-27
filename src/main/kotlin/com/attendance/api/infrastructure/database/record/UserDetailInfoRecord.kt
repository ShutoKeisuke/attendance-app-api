/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.attendance.api.infrastructure.database.record

import java.time.LocalDate

data class UserDetailInfoRecord(
    var userDetailId: Int? = null,
    var userId: String? = null,
    var employmentStatus: String? = null,
    var department: String? = null,
    var hireDate: LocalDate? = null,
    var retirementDate: LocalDate? = null,
    var retirementFlg: Byte? = null,
    var registrationDate: LocalDate? = null,
    var updateDate: LocalDate? = null
)