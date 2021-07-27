package com.attendance.api.domain.repository

import com.attendance.api.domain.model.UserBasicInfo
import com.attendance.api.domain.model.UserBasicInfoExpectPassword

interface UserRepository {
    fun getUserBasicInfoByEmail(email: String): UserBasicInfo?
    fun getUserBasicInfoExpectPasswordByEmail(email: String): UserBasicInfoExpectPassword?
}