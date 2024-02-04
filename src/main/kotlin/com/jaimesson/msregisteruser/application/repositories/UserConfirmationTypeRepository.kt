package com.jaimesson.msregisteruser.application.repositories

import com.jaimesson.msregisteruser.domain.models.UserConfirmationType

interface UserConfirmationTypeRepository {
    fun findByTypeName(typeName: String): UserConfirmationType?
}