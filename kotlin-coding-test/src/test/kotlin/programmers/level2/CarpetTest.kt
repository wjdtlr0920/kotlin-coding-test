package programmers.level2

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class CarpetTest : StringSpec({
    "brown에 `10`을 yellow에 `2`를 입력 할 경우 [4, 3]이 나와야 한다." {
        Carpet().solution(10, 2) shouldBe intArrayOf(4, 3)
    }

    "brown에 `8`을 yellow에 `1`를 입력 할 경우 [3, 3]이 나와야 한다." {
        Carpet().solution(8, 1) shouldBe intArrayOf(3, 3)
    }

    "brown에 `24`을 yellow에 `24`를 입력 할 경우 [8, 6]이 나와야 한다." {
        Carpet().solution(24, 24) shouldBe intArrayOf(8, 6)
    }

    "brown에 `14`을 yellow에 `4`를 입력 할 경우 [6, 3]이 나와야 한다." {
        Carpet().solution(14, 4) shouldBe intArrayOf(6, 3)
    }

    "brown에 `16`을 yellow에 `9`를 입력 할 경우 [5, 5]이 나와야 한다." {
        Carpet().solution(16, 9) shouldBe intArrayOf(5, 5)
    }
})
