package day1_s

import java.io.File

fun main() {
    var result: Int = 0
    File("src/day2/day1_s.txt").forEachLine {
        var a = it.toInt()
        do {
            a = (a / 3) - 2
                result += a
                println("a = $a")
                println("result: $result")
        } while (a > 6)
    }
    println(" final result : $result")
    //5088280
}