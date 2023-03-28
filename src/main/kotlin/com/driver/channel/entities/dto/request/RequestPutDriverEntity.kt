package com.driver.channel.entities.dto.request

import com.driver.channel.entities.domain.DriverEntity
import com.driver.channel.repository.driver.domain.Driver

class RequestPutDriverEntity{val driver: PutDriverEntity = TODO()

class PutDriverEntity(val name: String? = null,
                     val cellphone: String? = null,
                     val email: String? = null,
                     val active: Boolean? = true) {

    override fun toString(): String {
        return "PutDriverEntity(name=$name, cellphone=$cellphone, email=$email, active=$active)" }
}

    fun PutDriverEntity.toEntity(id: Long) = DriverEntity(
    id = id,
    name = this.name?.let { it },
    cellphone = this.cellphone?.let { it },
    email = email)

    fun toDomain() = Driver()

    }




