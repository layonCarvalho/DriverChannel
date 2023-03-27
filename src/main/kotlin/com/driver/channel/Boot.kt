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


/*
@SpringBootApplication
class Application {
	@Bean
	fun commandLineRunner(ctx: ApplicationContext): CommandLineRunner {
		return CommandLineRunner { args ->
			System.out.println("Let's inspect the beans provided by Spring Boot:")
			val beanNames: Array<String> = ctx.getBeanDefinitionNames()
			Arrays.sort(beanNames)
			for (beanName in beanNames) {
				System.out.println(beanName)
			}
		}
	}

	companion object {
		fun main(args: Array<String?>?) {
			SpringApplication.run(Application::class.java, args)
		}
	}
}

 */
