package programmers.backjoon

class Test {
    fun solution(elements: IntArray): Int {
        elements
        return 0
    }

    enum class Score(val value: Int) {
        ONE(1), TWO(2), THREE(3)
    }

    fun backjoon2456(array: Array<Array<Int>>) : String {

        val schoolPresidents: List<MutableList<Pair<Int, Score>>> = List(3) { mutableListOf() }

        array.forEach {
            it.forEachIndexed { index, i ->
                schoolPresidents[index].add(index + 1 to Score.entries.first { score -> score.value == i } )
            }
        }

        val isAllSame = schoolPresidents.all {
            it.count { it.second == Score.THREE } == schoolPresidents[0].count { it.second == Score.THREE } &&
                    it.count { it.second == Score.TWO } == schoolPresidents[0].count { it.second == Score.TWO }
        }

        val maxValue = schoolPresidents.maxOf { it.sumOf { it.second.value } }
        val maxScoreSchoolPresidents = schoolPresidents.filter { it.sumOf { it.second.value } == maxValue }

        val schoolPresidentNumber = when {
            isAllSame -> "0"
            else -> maxScoreSchoolPresidents.first { it.sumOf { it.second.value } == maxValue }[0].first
        }

        return "$schoolPresidentNumber $maxValue"
    }
}

fun main() {
    val answer = Test().backjoon2456(
        arrayOf(
            arrayOf(3, 1, 2),
            arrayOf(2, 3, 1),
            arrayOf(3, 1, 2),
            arrayOf(1, 2, 3),
            arrayOf(3, 1, 2),
            arrayOf(1, 2, 3)
        )
    )
    println(answer)

    val answer2 = Test().backjoon2456(
        arrayOf(
            arrayOf(1, 2, 3),
            arrayOf(3, 1, 2),
            arrayOf(2, 3, 1),
            arrayOf(1, 2, 3),
            arrayOf(3, 1, 2),
            arrayOf(2, 3, 1)
        )
    )
    println(answer2)
}











