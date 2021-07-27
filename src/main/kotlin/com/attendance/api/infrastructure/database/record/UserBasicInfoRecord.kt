/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.attendance.api.infrastructure.database.record

import java.time.LocalDate

data class UserBasicInfoRecord(
    var userId: String? = null,
    var userLastName: String? = null,
    var userLastNameReading: String? = null,
    var userFirstName: String? = null,
    var userFirstNameReading: String? = null,
    var birthday: LocalDate? = null,
    var age: Byte? = null,
    var postalCode: Int? = null,
    var address: String? = null,
    var email: String? = null,
    var password: String? = null,
    var roleType: String? = null
)