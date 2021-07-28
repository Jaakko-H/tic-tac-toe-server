package com.jh.tictactoe.model

import java.util.*

class GameState(
    var board: Array<Array<Mark?>> = Array(3) { Array(3) { null } },
) {
    val id: UUID = UUID.randomUUID()

    var isFinished: Boolean = false
    var winner: String? = null
}