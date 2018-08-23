package de.konradloetzsch.neuronet

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class NeuronetApplication

fun main(args: Array<String>) {
    runApplication<NeuronetApplication>(*args)
}
