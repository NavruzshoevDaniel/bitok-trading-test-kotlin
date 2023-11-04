package ru.pokemon.bitok.bitoktradingtestkotlin.client

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.format.annotation.DateTimeFormat
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import ru.pokemon.bitok.bitoktradingtestkotlin.client.dto.BtcCurrentPrice
import ru.pokemon.bitok.bitoktradingtestkotlin.client.dto.HistoricalBtcPrice
import java.time.LocalDate

@FeignClient(name = "coin-gecko-client")
interface CoinGeckoClient {
    @GetMapping("/simple/price?vs_currencies=usd&ids=bitcoin")
    fun getCurrentBtcPriceInUsd(): BtcCurrentPrice

    @GetMapping("/coins/bitcoin/history")
    fun getHistoricalBtcPriceInUsd(
        @RequestParam(name = "date")
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE, pattern = "dd-MM-yyyy")
        historicalDate: LocalDate,
    ): HistoricalBtcPrice
}
