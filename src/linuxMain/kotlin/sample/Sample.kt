package sample

fun hello(): String = "Hello, Kotlin/Native!"
fun hi(a: String): String = "Hi, $a"
fun plus1(x: Int): Int = x + 1

fun main(args: Array<String>) {
    println(hello())
    println(hi(args.elementAtOrNull(0) ?: "dummy"))

    val x = (args.elementAtOrNull(1) ?: "1").toInt()
    println("$x + 1 = ${plus1(x)}")
}
