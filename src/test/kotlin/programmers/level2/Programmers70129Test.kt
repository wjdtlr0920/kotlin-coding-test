package programmers.level2

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class Programmers70129Test : StringSpec({
    "`110010101001`을 입력 받을 경우 [3, 8]이 나와야 한다." {
        Programmers70129().solution("110010101001") shouldBe intArrayOf(3, 8)
    }

    "`01110`을 입력 받을 경우 [3, 3]이 나와야 한다." {
        Programmers70129().solution("01110") shouldBe intArrayOf(3, 3)
    }

    "`1111111`을 입력 받을 경우 [4, 1]이 나와야 한다." {
        Programmers70129().solution("1111111") shouldBe intArrayOf(4, 1)
    }
})
