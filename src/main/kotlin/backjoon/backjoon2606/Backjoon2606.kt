package backjoon.backjoon2606

/**
 * https://www.acmicpc.net/problem/1260
 *
 * 문제
 * 신종 바이러스인 웜 바이러스는 네트워크를 통해 전파된다. 한 컴퓨터가 웜 바이러스에 걸리면 그 컴퓨터와 네트워크 상에서 연결되어 있는 모든 컴퓨터는 웜 바이러스에 걸리게 된다.
 *
 * 예를 들어 7대의 컴퓨터가 <그림 1>과 같이 네트워크 상에서 연결되어 있다고 하자.
 * 1번 컴퓨터가 웜 바이러스에 걸리면 웜 바이러스는 2번과 5번 컴퓨터를 거쳐 3번과 6번 컴퓨터까지 전파되어 2, 3, 5, 6 네 대의 컴퓨터는 웜 바이러스에 걸리게 된다.
 * 하지만 4번과 7번 컴퓨터는 1번 컴퓨터와 네트워크상에서 연결되어 있지 않기 때문에 영향을 받지 않는다.
 *
 * 어느 날 1번 컴퓨터가 웜 바이러스에 걸렸다. 컴퓨터의 수와 네트워크 상에서 서로 연결되어 있는 정보가 주어질 때, 1번 컴퓨터를 통해 웜 바이러스에 걸리게 되는 컴퓨터의 수를 출력하는 프로그램을 작성하시오.
 *
 * */

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Stack

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val totalCount = br.readLine().toInt()
    val branchCount = br.readLine().toInt()

    val array = Array(totalCount + 1) { mutableListOf<Int>() }

    repeat(branchCount) {
        val mm = br.readLine().split(" ")
        val start = mm[0].toInt()
        val end = mm[1].toInt()
        array[start] = (array[start] + end).toMutableList()
        array[end] = (array[end] + start).toMutableList()
    }

    println(dfs(array))
}

private fun dfs(array: Array<MutableList<Int>>): Int {

    var infectedComputers = listOf<Int>()

    val stack = Stack<Int>()
    stack.push(1)

    while (stack.isNotEmpty()) {
        val index = stack.pop()
        if (index in infectedComputers) continue

        infectedComputers = infectedComputers + index

        array[index].forEach {
            stack.push(it)
        }
    }

    return infectedComputers.size - 1
}
