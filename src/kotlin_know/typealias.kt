package kotlin_know

// 类型别名  将 (T) -> Boolean 简化成 Predicate<T>
typealias Predicate<T> = (T) -> Boolean

fun foo(p: Predicate<Int>) = p(42)

fun main(args: Array<String>) {
    // f 的类型是 (Int) -> Boolean
    val f: (Int) -> Boolean = { it > 0 }
    // foo() 函数的接受类型是 Predicate
    println(foo(f)) // 输出 "true"

    val p: Predicate<Int> = { it > 0 }
    println(listOf(1, -2).filter(p)) // 输出 "[1]"
}