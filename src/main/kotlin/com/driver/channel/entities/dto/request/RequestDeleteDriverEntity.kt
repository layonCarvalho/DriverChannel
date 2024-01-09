package com.driver.channel.entities.dto.request



data class RequestDeleteDriverEntity(val driver: DeleteDriverEntity)

data class DeleteDriverEntity(
    val id: List<Long> = emptyList(),
    val name: List<String> = emptyList()
)
