package kotlin_design_pattern

import kotlin.properties.Delegates

/**
 * 设计模式之观察者模式-比较简单，但是需要用Kotlin的特性来实现，也就是委托模式
 */
class Userr {
    var name: String by Delegates.observable("初始值"){
        property, oldValue, newValue ->
        println("旧值：$oldValue -> 新值： $newValue")
    }
}

fun main(args: Array<String>) {
    val user = Userr()
    user.name = "第一次赋值"
    user.name = "第二次赋值"
}
