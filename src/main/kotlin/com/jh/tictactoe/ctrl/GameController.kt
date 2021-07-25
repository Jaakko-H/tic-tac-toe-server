package com.jh.tictactoe.ctrl

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/game")
class GameController {

    var gameState: Array<IntArray> = Array(3) { IntArray(3) { 0 } }

    @GetMapping("/state")
    fun getGameState(): ResponseEntity<Array<IntArray>> {
        return ResponseEntity.ok(gameState)
    }
}