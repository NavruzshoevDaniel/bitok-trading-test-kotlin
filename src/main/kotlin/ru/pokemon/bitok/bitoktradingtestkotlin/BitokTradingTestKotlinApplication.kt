package ru.pokemon.bitok.bitoktradingtestkotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@EnableFeignClients
@SpringBootApplication
class BitokTradingTestKotlinApplication

fun main(args: Array<String>) {
	runApplication<BitokTradingTestKotlinApplication>(*args)
}
