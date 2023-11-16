package minesweeper.domain

import minesweeper.domain.Height.Companion.MINIMUM_HEIGHT

class MineMap(private val height: Height, private val width: Width) {

    fun createPosition(): List<List<Position>> {
        return (MINIMUM_HEIGHT..height.value).map {
            createRow(it)
        }
    }

    fun isInMap(position: Position): Boolean {
        return position.x in 1..width.value && position.y in 1..height.value
    }

    private fun createRow(y: Int): List<Position> {
        return (1..width.value).map { Position(it, y) }
    }
}
