package com.jaimesson.msregisteruser.dtos
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Size;

class UserRegisterDTO (
        @field:NotBlank(message = "Email cannot be blank")
        val email: String,
        @field:Size(min = 6, message = "Password must have at least 6 characters")
        val password: String
)