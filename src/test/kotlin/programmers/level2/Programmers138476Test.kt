package programmers.level2

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class Programmers138476Test : StringSpec({
    "6, [1, 3, 2, 5, 4, 5, 2, 3]을 입력 받을 경우 3이 나와야 한다." {
        Programmers138476().solution(6, intArrayOf(1, 3, 2, 5, 4, 5, 2, 3)) shouldBe 3
    }

    "4, [1, 3, 2, 5, 4, 5, 2, 3]을 입력 받을 경우 2이 나와야 한다." {
        Programmers138476().solution(4, intArrayOf(1, 3, 2, 5, 4, 5, 2, 3)) shouldBe 2
    }

    "2, [1, 1, 1, 1, 2, 2, 2, 3]을 입력 받을 경우 1이 나와야 한다." {
        Programmers138476().solution(2, intArrayOf(1, 1, 1, 1, 2, 2, 2, 3)) shouldBe 1
    }
})
