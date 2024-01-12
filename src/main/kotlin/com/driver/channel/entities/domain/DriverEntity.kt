package com.driver.channel.entities.domain

import java.time.LocalDateTime

data class DriverEntity(
    val id: Long? = null,
    val name: String? = null,
    val cellphone: String? = null,
    val email: String? = null,
    val active: Boolean? = null,
    val dateCreate: LocalDateTime? = LocalDateTime.now(),
    val dateUpdate: LocalDateTime? = LocalDateTime.now(),
    val dateExclude: LocalDateTime? = LocalDateTime.now()
)
