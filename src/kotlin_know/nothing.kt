package kotlin_know

data class person(val name: String?)

fun fail(message: String): Nothing {
    throw IllegalArgumentException(message)
}

fun main(args: Array<String>) {
    var person = person(null)
//
//    val s = person.name ?: throw IllegalArgumentException("Name required")
    val s = person.name ?: fail("Name required")
    println(s)     // 在此已知“s”已初始化
}