package com.jh.tictactoe.ctrl

import com.jh.tictactoe.model.GameState
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/game")
class GameController {

    var gameState: GameState = GameState()

    @GetMapping("/state")
    fun getGameState(): ResponseEntity<GameState> {
        return ResponseEntity.ok(gameState)
    }
}