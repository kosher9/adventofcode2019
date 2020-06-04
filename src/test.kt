import java.io.File
import kotlin.time.measureTimedValue

fun main(){
    val duration = measureTimedValue {
        val strings= File("src/test.txt").bufferedReader().readLines()
        strings.forEach {
            if (it.contains("ok")){
                println(it)
            }
        }
       /* val x = "Salut"
        val byte = x.toByteArray(Charsets.UTF_8)
        println(byte)
        println(byte[0])
        println(String(byte))*/
    }
    println(duration)
}