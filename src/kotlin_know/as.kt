package kotlin_know

// kotlin中的指定类型和转换 注意as的用法
/*
Java
if (object instanceof Car) {
}
Car car = (Car) object;
Kotlin
if (object is Car) {
}
var car = object as Car
*/

fun main(args: Array<String>) {
    // 不安全的强制转换
    val y: Int = 10
    //val x: String = y as String
    //println(x::class) // Exception in thread "main" java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
    // 防止 y 为 null的情况
    //val x1: String? = y as String?

    // 安全的强制转换
    val x2: String? = y as? String
    println(x2)
}