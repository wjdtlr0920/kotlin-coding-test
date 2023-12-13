package backjoon.backjoon1260

/**
 * https://www.acmicpc.net/problem/1260
 *
 * DFS와 BFS
 *
 * 문제
 * 그래프를 DFS로 탐색한 결과와 BFS로 탐색한 결과를 출력하는 프로그램을 작성하시오.
 * 단, 방문할 수 있는 정점이 여러 개인 경우에는 정점 번호가 작은 것을 먼저 방문하고, 더 이상 방문할 수 있는 점이 없는 경우 종료한다.
 * 정점 번호는 1번부터 N번까지이다.
 * */

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.Queue
import java.util.Stack

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val split = br.readLine().split(" ")
    val n = split[0].toInt() // 정점의 개수
    val m = split[1].toInt() // 간선의 개수
    val v = split[2].toInt() // 시작 정점

    val array = Array(n + 1) { mutableListOf<Int>() }

    repeat(m) {
        val mm = br.readLine().split(" ")
        val start = mm[0].toInt()
        val end = mm[1].toInt()
        array[start] = (array[start] + end).toMutableList()
        array[end] = (array[end] + start).toMutableList()
    }

    println(dfs(v, array).joinToString(separator = " "))
    println(bfs(v, array).joinToString(separator = " "))
}

private fun dfs(v: Int, array: Array<MutableList<Int>>): IntArray {
    val stack = Stack<Int>()
    stack.push(v)

    val ints = mutableListOf<Int>()

    while (stack.isNotEmpty()) {
        val index = stack.pop()
        if (index in ints) continue

        ints.add(index)
        array[index].sortedDescending().forEach {
            stack.push(it)
        }
    }

    return ints.toIntArray()
}

private fun bfs(v: Int, array: Array<MutableList<Int>>): IntArray {
    val queue: Queue<Int> = LinkedList()
    queue.offer(v)

    val ints = mutableListOf<Int>()

    while (queue.isNotEmpty()) {
        val index = queue.poll()
        if (index in ints) continue

        ints.add(index)
        array[index].sorted().forEach {
            queue.offer(it)
        }
    }

    return ints.toIntArray()
}
