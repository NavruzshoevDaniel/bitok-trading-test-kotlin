package ru.pokemon.bitok.bitoktradingtestkotlin.client.dto

import com.fasterxml.jackson.annotation.JsonProperty

data class BtcCurrentPrice(
    @field:JsonProperty("bitcoin")
    val usdPrice: UsdPrice,
)

