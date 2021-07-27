package com.attendance.api.domain.model

import java.time.LocalDate

data class UserBasicInfo (
    val userId: String,
    val userLastName: String,
    val userLastNameReading: String,
    val userFirstName: String,
    val userFirstNameReading: String,
    val birthday: LocalDate,
    val age: Byte,
    val postalCode: Int,
    val address: String,
    val email: String?,
    val password: String,
    val roleType: String
)

data class UserBasicInfoExpectPassword (
        val userId: String,
        val userLastName: String,
        val userLastNameReading: String,
        val userFirstName: String,
        val userFirstNameReading: String,
        val birthday: LocalDate,
        val age: Byte,
        val postalCode: Int,
        val address: String,
        val email: String?,
        val roleType: String
)