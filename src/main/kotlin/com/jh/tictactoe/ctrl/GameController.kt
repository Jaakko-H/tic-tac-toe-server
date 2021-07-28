package com.jh.tictactoe.ctrl

import com.jh.tictactoe.model.GameState
import com.jh.tictactoe.model.Mark
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/game")
class GameController {

    var gameState: GameState = GameState()

    @GetMapping("/state")
    fun getGameState(): ResponseEntity<GameState> = ResponseEntity.ok(gameState)

    @PostMapping("/new")
    fun createNewGame(): ResponseEntity<GameState> {
        gameState = GameState()
        return ResponseEntity.ok(gameState)
    }

    @PatchMapping("/place-mark")
    fun placeMark(
        @RequestParam x: Int,
        @RequestParam y: Int,
        @RequestParam mark: Mark
    ): ResponseEntity<GameState> {
        val newBoardState = gameState.board.clone()
        newBoardState[x][y] = mark
        gameState.board = newBoardState
        return ResponseEntity.ok(gameState)
    }
}