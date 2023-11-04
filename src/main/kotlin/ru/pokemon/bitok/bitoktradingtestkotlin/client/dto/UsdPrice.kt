package ru.pokemon.bitok.bitoktradingtestkotlin.client.dto

import com.fasterxml.jackson.annotation.JsonProperty

data class UsdPrice(
    @field:JsonProperty("bitcoin")
    val price: Double,
)
