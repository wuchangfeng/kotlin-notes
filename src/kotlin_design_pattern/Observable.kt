package kotlin_design_pattern

import kotlin.properties.Delegates

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
