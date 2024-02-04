package com.jaimesson.msregisteruser.adapter.web.controllers

import com.jaimesson.msregisteruser.adapter.web.dtos.CreateUserRequestDto
import com.jaimesson.msregisteruser.domain.models.UserConfirmation
import com.jaimesson.msregisteruser.domain.usecases.CreateUserConfirmationUseCase
import com.jaimesson.msregisteruser.domain.usecases.CreateUserUseCase
import com.jaimesson.msregisteruser.domain.usecases.GetUserConfirmationTypeUseCase
import jakarta.validation.Valid
import org.springframework.http.ResponseEntity
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/v1/users")
class UserController(
    private val passwordEncoder: PasswordEncoder,
    private val createUserUseCase: CreateUserUseCase,
    private val createUserConfirmationUseCase: CreateUserConfirmationUseCase,
    private val getUserConfirmationTypeUseCase: GetUserConfirmationTypeUseCase
) {
    @PostMapping
    fun register(@Valid @RequestBody createUserRequestDto: CreateUserRequestDto): ResponseEntity<Void> {
        val userConfirmationType = getUserConfirmationTypeUseCase.execute("email")

        val user = createUserRequestDto.toDomain()

        user.setPassword(passwordEncoder.encode(user.getPassword()))

        val newUser = createUserUseCase.execute(user)

        createUserConfirmationUseCase.execute(
            UserConfirmation(
                user = newUser,
                userConfirmationType = userConfirmationType,
                confirmationToken = "VAZIO POR ENQUANTO"
            )
        )

        return ResponseEntity.noContent().build()
    }
}