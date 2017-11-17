package kotlin_know

import kotlin.reflect.KProperty

//有一些常见的属性类型，虽然我们可以在每次需要的时候手动实现它们，
//但是如果能够为大家把他们只实现一次并放入一个库会更好。例如包括：
//延迟属性（lazy properties）: 其值只在首次访问时计算；
//可观察属性（observable properties）: 监听器会收到有关此属性变更的通知；
//把多个属性储存在一个映射（map）中，而不是每个存在单独的字段中。

class Example {
    var p: String by Delegate()
}

class Delegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "$thisRef, thank you for delegating '${property.name}' to me!"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("$value has been assigned to '${property.name} in $thisRef.'")
    }
}

fun main(args: Array<String>) {
    var e = Example()
    println(e.p)
    e.p = "New"
    println(e.p)
}