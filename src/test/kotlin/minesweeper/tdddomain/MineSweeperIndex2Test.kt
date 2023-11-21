package minesweeper.tdddomain

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe
import minesweeper.domain.MineStatus
import minesweeper.domain.Position

class MineSweeperIndex2Test : BehaviorSpec({

    given("좌표(1,1)와 상태가 주어졌을 때") {
        val position = Position(1, 1)
        val mineStatus = MineStatus.NOT_MINE
        When("지뢰 찾기 인덱스를 생성하면") {
            val mineSweeperIndex = MineSweeperIndex2(position, mineStatus)
            Then("좌표와 상태가 같다.") {
                mineSweeperIndex.position shouldBe position
                mineSweeperIndex.mineStatus shouldBe mineStatus
            }
        }
    }
})
