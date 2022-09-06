package com.example.kotlinbackend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class KotlinBackendApplication

fun main(args: Array<String>) {
	runApplication<KotlinBackendApplication>(*args)
}

@RestController
class MessageResource() {
	@GetMapping
	fun index(): String = "Hello Kotlin!"
}