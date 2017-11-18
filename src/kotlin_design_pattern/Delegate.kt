package kotlin_design_pattern

import kotlin.reflect.KProperty

/**
 * 设计模式之委托模式
 */
//普通类
class Example{
    //p属性委托给了Delegate()
    var p: String by Delegate()
}

//委托类，也就是真正干事的类
class Delegate{
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "$thisRef, 这里委托了 ${property.name} 属性"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("$thisRef 的 ${property.name} 属性赋值为 $value")
    }
}

fun main(args: Array<String>) {
    val e = Example()
    println(e.p)

    e.p = "Runoob"
    println(e.p)
}