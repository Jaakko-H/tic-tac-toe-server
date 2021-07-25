package com.jh.tictactoe.ctrl

import javax.persistence.Entity

@Entity
class GameState(
    var board: Array<IntArray>,
    var isFinished: Boolean,
    var winner: String
)