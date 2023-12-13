package programmers.level2

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class Programmers12953Test : StringSpec({
    "[2,6,8,14]을 입력 받을 경우 168이 나와야 한다." {
        Programmers12953().solution(intArrayOf(2,6,8,14)) shouldBe 168
    }
    "[1,2,3]을 입력 받을 경우 6이 나와야 한다." {
        Programmers12953().solution(intArrayOf(1,2,3)) shouldBe 6
    }
})
