package programmers.level2

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class NumberOfConsecutiveSubsequenceSumsTest : StringSpec({
    "[7,9,1,1,4]을 입력 받을 경우 18이 나와야 한다." {
        NumberOfConsecutiveSubsequenceSums().solution(intArrayOf(7,9,1,1,4)) shouldBe 18
    }
})
