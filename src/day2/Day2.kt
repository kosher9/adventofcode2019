package day2

import java.io.File

fun main() {

    val fileContent = File("src/day2/day2.txt").readText()
    var arrayCont = mutableListOf<Int>()
    var s = StringBuilder()
    fileContent.forEach {
        if (!it.equals(',', false)) {
            s.append(it.toString())
        } else if (it.toInt() == 99){
            fileContent
        } else {
            arrayCont.add(s.toString().toInt())
            s.clear()
        }
    }
    println(arrayCont)
    val newFileName = "src/day2/day2_nf.txt"
    var newFile = File(newFileName)
    for (number in arrayCont) {
        newFile.printWriter().use { out ->
            out.write(number.toString())
        }
    }
    /*val x = "Salut"
    val byte = x.toByteArray(Charsets.UTF_8)
    println(byte)
    println(byte[0])
    println(byte.toString(Charsets.UTF_8))*/

    /*val s = 4
    val e = s.toByte()
    println(e)
    val stream = File("src/day3/day2.txt").inputStream()
    val buff = Charsets.UTF_8.encode()
    val bytes = ByteArray(6)
    stream.read(bytes)
    stream.close()
    val d = bytes.iterator()
    while (d.hasNext()){
        println(d.nextByte())
    }
    println("////////////////////////////////")
    for (i in bytes.indices){
        println(bytes[i])
    }

    val list = mutableListOf<Int>()
    File("src/day3/day2.txt").forEachLine {
        it.split(",").forEach {char ->
            list.add(char.toInt())
        }
    }
    println(list)*/
}