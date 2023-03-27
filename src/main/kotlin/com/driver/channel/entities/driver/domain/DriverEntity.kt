package com.driver.channel.entities.driver.domain

import java.time.LocalDateTime

class DriverEntity (val id: Long? = null,
                   val name: String? = null,
                   val cellphone: String? = null,
                   val email: String? = null,
                   val active: Boolean? = null,
                   val image: ByteArray? = null,
                   val dateCreate: LocalDateTime? = LocalDateTime.now(),
                   val dateUpdate: LocalDateTime? = null,
                   val dateExclude: LocalDateTime? = null

) : List<DriverEntity> {
    override val size: Int
        get() = TODO("Not yet implemented")

    override fun containsAll(elements: Collection<DriverEntity>): Boolean {
        TODO("Not yet implemented")
    }

    override fun contains(element: DriverEntity): Boolean {
        TODO("Not yet implemented")
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as DriverEntity

        if (id != other.id) return false
        if (name != other.name) return false
        if (cellphone != other.cellphone) return false
        if (email != other.email) return false
        if (active != other.active) return false
        if (image != null) {
            if (other.image == null) return false
            if (!image.contentEquals(other.image)) return false
        } else if (other.image != null) return false
        if (dateCreate != other.dateCreate) return false
        if (dateUpdate != other.dateUpdate) return false
        if (dateExclude != other.dateExclude) return false

        return true
    }

    override fun get(index: Int): DriverEntity {
        TODO("Not yet implemented")
    }

    override fun hashCode(): Int {
        var result = id?.hashCode() ?: 0
        result = 31 * result + (name?.hashCode() ?: 0)
        result = 31 * result + (cellphone?.hashCode() ?: 0)
        result = 31 * result + (email?.hashCode() ?: 0)
        result = 31 * result + (active?.hashCode() ?: 0)
        result = 31 * result + (image?.contentHashCode() ?: 0)
        result = 31 * result + (dateCreate?.hashCode() ?: 0)
        result = 31 * result + (dateUpdate?.hashCode() ?: 0)
        result = 31 * result + (dateExclude?.hashCode() ?: 0)
        return result
    }

    override fun isEmpty(): Boolean {
        TODO("Not yet implemented")
    }

    override fun iterator(): Iterator<DriverEntity> {
        TODO("Not yet implemented")
    }

    override fun listIterator(): ListIterator<DriverEntity> {
        TODO("Not yet implemented")
    }

    override fun listIterator(index: Int): ListIterator<DriverEntity> {
        TODO("Not yet implemented")
    }

    override fun subList(fromIndex: Int, toIndex: Int): List<DriverEntity> {
        TODO("Not yet implemented")
    }

    override fun lastIndexOf(element: DriverEntity): Int {
        TODO("Not yet implemented")
    }

    override fun indexOf(element: DriverEntity): Int {
        TODO("Not yet implemented")
    }
}