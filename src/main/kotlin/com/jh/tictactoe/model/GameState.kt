package com.jh.tictactoe.model

import java.util.*

class GameState(
    var board: Array<IntArray> = Array(3) { IntArray(3) { 0 } },
) {
    val id: UUID = UUID.randomUUID()

    var isFinished: Boolean = false
    var winner: String? = null
}