package kotlin_know

//kotlin中的内部类
class Outer {
    private val bar: Int = 1
    inner class Inner {
        fun foo() = bar // 如果没有 inner 修饰 无法获取 bar 属性
    }
}


fun main(args: Array<String>) {
//    val demo = Outer.Nested().foo()
    //val demo2 = Outer.Nested().bar
    val demo = Outer().Inner().foo()
}