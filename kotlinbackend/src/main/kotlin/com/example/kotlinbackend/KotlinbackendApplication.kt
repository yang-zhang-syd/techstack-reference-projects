package com.example.kotlinbackend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

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



private suspend fun loadItemsFromDB(): List<String> {
	delay(5000)
	return listOf("Kotlin", "Java", "C#")
}

private suspend fun loadItemsFromNetwork(): List<String> {
	delay(5000)
	return listOf("Rust", "Python", "C")
}

// Use async() to parallelize the execution of the two provided suspend functions
// Use await() to get results of both async() calls
// Convert the results into a unified list and print out to the console
fun main(): Unit = runBlocking {

}