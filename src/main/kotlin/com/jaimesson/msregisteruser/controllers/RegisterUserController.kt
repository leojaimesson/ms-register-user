package com.jaimesson.msregisteruser.controllers

import com.jaimesson.msregisteruser.dtos.UserRegisterDTO
import com.jaimesson.msregisteruser.services.UserConfirmationService
import com.jaimesson.msregisteruser.services.UserConfirmationTypeService
import com.jaimesson.msregisteruser.services.UserService
import jakarta.validation.Valid
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("api/v1/register/user")
class RegisterUserController(
    private val userService: UserService,
    private val userConfirmationService: UserConfirmationService,
    private val userConfirmationTypeService: UserConfirmationTypeService
) {
    @PostMapping
    fun register(@Valid @RequestBody userRegisterDTO: UserRegisterDTO): ResponseEntity<Void> {
        val confirmationType = userConfirmationTypeService.retrieve("email")
        val user = userService.create(userRegisterDTO)
        userConfirmationService.create(user = user, userConfirmationType = confirmationType)
        return ResponseEntity.noContent().build()
    }
}