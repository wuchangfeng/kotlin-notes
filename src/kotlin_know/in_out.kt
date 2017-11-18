package kotlin_know

//kotlin中逆变和协变

/**
我们可以标注 Source 的类型参数 T 来确保它仅从 Source<T>
成员中返回（生产），并从不被消费。 为此，我们提供 out 修饰符：
*/
abstract class Source<out T> {
    abstract fun nextT(): T
}

fun demo1(strs: Source<String>) {
    val objects: Source<Any> = strs // 这个没问题，因为 T 是一个 out-参数
    // ……
}
/**
Kotlin 又补充了一个型变注释：in。它使得一个类型参数逆变：
只可以被消费而不可以被生产。逆变类的一个很好的例子是 Comparable：
*/
abstract class Comparable<in T> {
    abstract fun compareTo(other: T): Int
}

fun demo2(x: Comparable<Number>) {
    x.compareTo(1.0) // 1.0 拥有类型 Double，它是 Number 的子类型
    // 因此，我们可以将 x 赋给类型为 Comparable <Double> 的变量
    val y: Comparable<Double> = x // OK！
}