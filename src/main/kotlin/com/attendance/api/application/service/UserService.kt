package com.attendance.api.application.service

import com.attendance.api.domain.model.UserBasicInfo
import com.attendance.api.domain.model.UserBasicInfoExpectPassword
import com.attendance.api.domain.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(
        private val userRepository: UserRepository
) {
    fun getUserBasicInfoByEmail(email: String): UserBasicInfo? {
        return userRepository.getUserBasicInfoByEmail(email)
    }

    fun getUserBasicInfoExceptPasswordByEmail(email: String): UserBasicInfoExpectPassword? {
        return userRepository.getUserBasicInfoExpectPasswordByEmail(email)
    }
}