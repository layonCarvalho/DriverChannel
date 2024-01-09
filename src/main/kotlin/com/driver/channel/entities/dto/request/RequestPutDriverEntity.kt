package com.driver.channel.entities.dto.request

import com.driver.channel.entities.domain.DriverEntity

class RequestPutDriverEntity(val driver: PutDriverEntity)

    class PutDriverEntity(val name: String? = null,
                     val cellphone: String? = null,
                     val email: String? = null,
                     val active: Boolean? = true)


    fun PutDriverEntity.toEntity(id: Long) = DriverEntity(
    id = id,
    name = this.name?.let { it },
    cellphone = this.cellphone?.let { it },
    email = this.email?.let { it },
    active = this.active?.let { it }
    )






