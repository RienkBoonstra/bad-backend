package boonstra.application.development.badbackend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BadBackendApplication

fun main(args: Array<String>) {
	runApplication<BadBackendApplication>(*args)
}
