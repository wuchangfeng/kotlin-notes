package kotlin_know

// Kotlin 提供了一个 this 表达式，主要就是一个带标签的 this，用于在内部类、扩展中获取正确的类对象实例。
// 在类的成员中，this 指的是该类的当前对象。
// 在扩展函数或者带接收者的函数字面值中， this 表示在点左侧传递的 接收者 参数

class A { // 外部类标签 @A
    inner class B { // 内部类标签 @B
        fun Int.foo() { // 扩展函数的标签 @foo

            val a = this@A // A's this
            val b = this@B // B's this
            val c = this // foo() 的接受者，一个 Int
            val c1 = this@foo // 同上

            val funLit = lambda@ fun String.() {
                val d = this // funLit 的接受者
            }

            val funLit2 = { s: String ->
                // foo()'s receiver, since enclosing lambda expression
                // doesn't have any receiver
                val d1 = this
            }
        }
    }
}