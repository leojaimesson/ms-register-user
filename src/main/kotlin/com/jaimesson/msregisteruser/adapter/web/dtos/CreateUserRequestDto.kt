package com.jaimesson.msregisteruser.adapter.web.dtos

import com.jaimesson.msregisteruser.domain.models.User
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Size
class CreateUserRequestDto(
    @field:NotBlank(message = "Email cannot be blank")
    val email: String,
    @field:Size(min = 6, message = "Password must have at least 6 characters")
    val password: String
) {
    fun toDomain(): User {
        return User(email = this.email, password = this.password)
    }
}