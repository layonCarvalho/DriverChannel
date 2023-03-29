package com.driver.channel

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.web.servlet.config.annotation.EnableWebMvc

@ComponentScan(value =["com.driver.channel"])
@SpringBootApplication
@EnableWebMvc
@EntityScan(basePackages = ["com.driver.channel.repository"])
@EnableJpaRepositories(basePackages = ["com.driver.channel.repository"])
class Boot {

	companion object {
		@JvmStatic
		fun main(args: Array<String>) {
			runApplication<com.driver.channel.Boot>(*args)
		}
	}
}


