package programmers.level2

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12949
 *
 * 행렬의 곱셈
 * 문제 설명
 * 2차원 행렬 arr1과 arr2를 입력받아, arr1에 arr2를 곱한 결과를 반환하는 함수, solution을 완성해주세요.
 *
 * 제한 조건
 * 행렬 arr1, arr2의 행과 열의 길이는 2 이상 100 이하입니다.
 * 행렬 arr1, arr2의 원소는 -10 이상 20 이하인 자연수입니다.
 * 곱할 수 있는 배열만 주어집니다.
 *
 * 입출력 예
 * arr1	arr2	return
 * [[1, 4], [3, 2], [4, 1]]	[[3, 3], [3, 3]]	[[15, 15], [15, 15], [15, 15]]
 * [[2, 3, 2], [4, 2, 4], [3, 1, 4]]	[[5, 4, 3], [2, 4, 1], [3, 1, 1]]	[[22, 22, 11], [36, 28, 18], [29, 20, 14]]
 * [[1, 2, 3], [4, 5, 6]]	[[1, 4], [2, 5], [3, 6]]	[[14, 32], [32, 77]]
 * */
class Programmers12949 {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {

        return Array(arr1.size) {
            IntArray(arr2[0].size) { iIndex ->
                arr2.foldIndexed(0) { jIndex, acc, j ->
                    acc + (arr1[it][jIndex] * arr2[jIndex][iIndex])
                }
            }
        }
    }
}

fun main() {
    println(
        Programmers12949().solution(
            arrayOf(
                intArrayOf(1, 4),
                intArrayOf(3, 2),
                intArrayOf(4, 1)
            ),
            arrayOf(
                intArrayOf(3, 3),
                intArrayOf(3, 3)
            )
        ).joinToString { it.toList().toString() }
    ) // [[15, 15], [15, 15], [15, 15]]

    println(
        Programmers12949().solution(
            arrayOf(
                intArrayOf(2, 3, 2),
                intArrayOf(4, 2, 4),
                intArrayOf(3, 1, 4)
            ),
            arrayOf(
                intArrayOf(5, 4, 3),
                intArrayOf(2, 4, 1),
                intArrayOf(3, 1, 1)
            )
        ).joinToString { it.toList().toString() }
    ) // [[22, 22, 11], [36, 28, 18], [29, 20, 14]]

    println(
        Programmers12949().solution(
            arrayOf(
                intArrayOf(1, 2, 3),
                intArrayOf(4, 5, 6),
            ),
            arrayOf(
                intArrayOf(1, 4),
                intArrayOf(2, 5),
                intArrayOf(3, 6)
            )
        ).joinToString { it.toList().toString() }
    ) // [[14, 32], [32, 77]]
}
