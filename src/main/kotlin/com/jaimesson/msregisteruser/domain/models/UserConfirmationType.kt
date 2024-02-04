package com.jaimesson.msregisteruser.domain.models

import java.util.UUID


class UserConfirmationType(
    val id: UUID? = UUID.randomUUID(),
    val typeName: String
) {}