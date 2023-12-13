package programmers.level2

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class Programmers76502Test : StringSpec({
    "`[](){}`을 입력 받을 경우 3이 나와야 한다." {
        Programmers76502().solution("[](){}") shouldBe 3
    }

    "`}]()[{`을 입력 받을 경우 2이 나와야 한다." {
        Programmers76502().solution("}]()[{") shouldBe 2
    }

    "`[)(]`을 입력 받을 경우 0이 나와야 한다." {
        Programmers76502().solution("[)(]") shouldBe 0
    }

    "`}}}`을 입력 받을 경우 0이 나와야 한다." {
        Programmers76502().solution("}}}") shouldBe 0
    }
})
