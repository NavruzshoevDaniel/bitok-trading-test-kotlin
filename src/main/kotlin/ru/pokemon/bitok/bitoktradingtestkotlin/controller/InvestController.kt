package ru.pokemon.bitok.bitoktradingtestkotlin.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import ru.pokemon.bitok.bitoktradingtestkotlin.domain.ShouldInvestResult
import ru.pokemon.bitok.bitoktradingtestkotlin.service.InvestSuggestionService

@RestController
class InvestController(
    private val investSuggestionService: InvestSuggestionService,
) {

    @GetMapping("/should-invest")
    fun shouldInvest(): ShouldInvestResult = if (investSuggestionService.shouldInvest()) {
        ShouldInvestResult(
            shouldInvest = true,
            message = "Фиксируем прибыль!"
        )
    } else {
        ShouldInvestResult(
            shouldInvest = false,
            message = "Крипта - скам!"
        )
    }
}
