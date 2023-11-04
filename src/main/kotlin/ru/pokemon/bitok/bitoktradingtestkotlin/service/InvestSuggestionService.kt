package ru.pokemon.bitok.bitoktradingtestkotlin.service

import org.springframework.stereotype.Service
import ru.pokemon.bitok.bitoktradingtestkotlin.client.CoinGeckoClient
import ru.pokemon.bitok.bitoktradingtestkotlin.client.dto.BtcCurrentPrice
import ru.pokemon.bitok.bitoktradingtestkotlin.client.dto.HistoricalBtcPrice
import java.time.LocalDate

@Service
class InvestSuggestionService(
    private val coinGeckoClient: CoinGeckoClient,
) {

    fun shouldInvest(): Boolean {
        val now: LocalDate = LocalDate.now()
        val currentBtcPriceInUsdData: BtcCurrentPrice = coinGeckoClient.getCurrentBtcPriceInUsd()
        val historicalBtcPriceInUsdData: HistoricalBtcPrice = coinGeckoClient.getHistoricalBtcPriceInUsd(
            now.minusDays(1)
        )
        val currentBtcPriceInUsd: Double = currentBtcPriceInUsdData.usdPrice.price
        val historicalBtcPriceInUsd: Double = historicalBtcPriceInUsdData.marketData.usdPrice.price
        return currentBtcPriceInUsd > historicalBtcPriceInUsd
    }
}
