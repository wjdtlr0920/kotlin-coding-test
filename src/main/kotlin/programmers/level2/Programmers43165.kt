package programmers.level2

import java.util.*

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/43165
 *
 * 타겟 넘버
 *
 * 문제 설명
 * n개의 음이 아닌 정수들이 있습니다. 이 정수들을 순서를 바꾸지 않고 적절히 더하거나 빼서 타겟 넘버를 만들려고 합니다. 예를 들어 [1, 1, 1, 1, 1]로 숫자 3을 만들려면 다음 다섯 방법을 쓸 수 있습니다.
 *
 * -1+1+1+1+1 = 3
 * +1-1+1+1+1 = 3
 * +1+1-1+1+1 = 3
 * +1+1+1-1+1 = 3
 * +1+1+1+1-1 = 3
 * 사용할 수 있는 숫자가 담긴 배열 numbers, 타겟 넘버 target이 매개변수로 주어질 때 숫자를 적절히 더하고 빼서 타겟 넘버를 만드는 방법의 수를 return 하도록 solution 함수를 작성해주세요.
 *
 * 제한사항
 * 주어지는 숫자의 개수는 2개 이상 20개 이하입니다.
 * 각 숫자는 1 이상 50 이하인 자연수입니다.
 * 타겟 넘버는 1 이상 1000 이하인 자연수입니다.
 * */
class TargetNumber {
    fun solution(numbers: IntArray, target: Int): Int {
        val stack = Stack<Pair<Int, Int>>()
        stack.push(0 to 0)

        var count = 0

        while (stack.isNotEmpty()) {
            val value = stack.pop()
            if (value.first == 0 || value.first % numbers.size != 0) {
                stack.push(value.first + 1 to value.second + numbers[value.first])
                stack.push(value.first + 1 to value.second - numbers[value.first])
            } else if (value.second == target) {
                count++
            }
        }

        return count
    }
}

fun main() {
    println(TargetNumber().solution(intArrayOf(1, 1, 1, 1, 1), 3)) //5
    println(TargetNumber().solution(intArrayOf(4, 1, 2, 1), 4)) //2
}
