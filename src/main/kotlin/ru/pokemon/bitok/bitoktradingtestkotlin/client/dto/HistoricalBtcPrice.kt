package ru.pokemon.bitok.bitoktradingtestkotlin.client.dto

import com.fasterxml.jackson.annotation.JsonProperty

data class HistoricalBtcPrice(
    @field:JsonProperty("market_data")
    val marketData: MarketData,
)

data class MarketData(
    @field:JsonProperty("current_price")
    val usdPrice: UsdPrice,
)
