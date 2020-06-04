package day1

import java.io.File

fun main(){
    var result: Int = 0
    File("src/day1/txtday1").forEachLine {
        val a = (it.toInt() / 3) - 2
        result+=a
    }
    println(result)
}