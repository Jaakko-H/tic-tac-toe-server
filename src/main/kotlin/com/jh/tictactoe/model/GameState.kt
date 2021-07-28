package com.jh.tictactoe.model

class GameState(
    var board: Array<IntArray>,
    var isFinished: Boolean,
    var winner: String?
)