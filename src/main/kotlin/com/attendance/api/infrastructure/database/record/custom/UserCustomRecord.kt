package com.attendance.api.infrastructure.database.record.custom

import java.time.LocalDate

data class UserBasicInfoExceptPasswordRecord(
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
    var roleType: String? = null
)
