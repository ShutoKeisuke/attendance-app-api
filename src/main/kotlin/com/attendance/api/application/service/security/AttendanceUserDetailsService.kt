package com.attendance.api.application.service.security

import com.attendance.api.application.service.UserService
import com.attendance.api.domain.model.UserBasicInfo
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.authority.AuthorityUtils
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import java.time.LocalDate

class AttendanceUserDetailsService(
        private val userService: UserService
) : UserDetailsService {
    override fun loadUserByUsername(username: String): AttendanceUserDetails? {
        val userInfo = userService.getUserBasicInfoByEmail(username)
        return userInfo?.let { AttendanceUserDetails(it) }
    }
}

data class AttendanceUserDetails(
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
    val pass: String,
    val roleType: String
) : UserDetails {
    constructor(userBasicInfo: UserBasicInfo) : this(userBasicInfo.userId, userBasicInfo.userLastName, userBasicInfo.userLastNameReading, userBasicInfo.userFirstName, userBasicInfo.userFirstNameReading, userBasicInfo.birthday, userBasicInfo.age, userBasicInfo.postalCode, userBasicInfo.address, userBasicInfo.email, userBasicInfo.password, userBasicInfo.roleType)

    override fun getAuthorities(): MutableCollection<out GrantedAuthority> {
        return AuthorityUtils.createAuthorityList(this.roleType)
    }

    override fun getPassword(): String {
        return this.pass
    }

    override fun getUsername(): String {
        return  this.email!!
    }

    override fun isAccountNonExpired(): Boolean {
        return true
    }

    override fun isAccountNonLocked(): Boolean {
        return true
    }

    override fun isCredentialsNonExpired(): Boolean {
        return true
    }

    override fun isEnabled(): Boolean {
        return true
    }


}