package com.driver.channel.repository.driver.domain

import com.driver.channel.entities.domain.DriverEntity
import com.sun.istack.NotNull
import java.time.LocalDateTime
import javax.persistence.*
import javax.validation.constraints.Min
import javax.validation.constraints.Size


@Entity
@Table(schema = "public", name = "tb_driver")
class Driver (


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	@Column(name = "id_driver", nullable = false)
	var id: Long? = null,

	@NotNull
	@Column(name = "nome")
	@Size(min=2, max=30)
	val name: String? = null,

	@Column(name = "telefone")
	@Min(18)
	val cellphone: String? = null,

	@Column(name = "email")
	val email: String? = null,

	@Column(name = "ativo")
	val active: Boolean? = null,


	@Column(name = "dh_criacao")
	val dateCreate: LocalDateTime? = LocalDateTime.now(),

	@Column(name = "dh_alteracao")
	val dateUpdate: LocalDateTime? = LocalDateTime.now(),


	@Column(name = "dh_exclusao")
	val dateExclude: LocalDateTime? = LocalDateTime.now())


fun List<Driver>.toEntity() = map { it.toEntity() }

fun Driver.toEntity() = DriverEntity(id = id,
								 name = name,
								 cellphone = cellphone,
								 email = email,
								 active = active,
								 dateCreate	  = dateCreate,
								 dateUpdate = dateUpdate,
								 dateExclude = dateExclude)

fun List<DriverEntity>.toDomain() =  map { it.toDomain() }

fun DriverEntity.toDomain() = Driver (id = id,
								name = name,
								cellphone = cellphone,
								email= email,
								 active = active,
								 dateCreate = dateCreate,
								 dateUpdate = dateUpdate,
								 dateExclude = dateExclude)


