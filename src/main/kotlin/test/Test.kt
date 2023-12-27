package test

fun main() {
    val list1 = listOf(1, 2, 3, 4)
    val list2 = listOf(3, 4, 5, 6)
    println("합집합: ${list1 union  list2}")
    println("차집합: ${list1 subtract list2}")
    println("교집합: ${list1 intersect list2}")
}
