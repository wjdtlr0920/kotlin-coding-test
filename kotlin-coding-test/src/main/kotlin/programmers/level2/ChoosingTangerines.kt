package programmers.level2

class ChoosingTangerines {
    fun solution(k: Int, tangerine: IntArray): Int = tangerine.groupBy { it }
        .values
        .sortedByDescending { it.size }
        .let {
            var sum = 0
            it.fold(0) { acc, tangerineBundle ->
                if (k > acc) sum++
                acc + tangerineBundle.size
            }
            sum
        }
}
