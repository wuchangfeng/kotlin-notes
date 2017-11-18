package kotlin_design_pattern

/**
 * 设计模式之适配器模式-比较简单的一种适配器实现方式。将一个接口转换成客户希望的另一个接口，
 * 适配器模式使接口不兼容的那些类可以一起工作，其别名为包装器(Wrapper)。
 * 适配器模式既可以作为类结构型模式，也可以作为对象结构型模式。
 */
interface Target {
    fun request()
}

interface Adaptee {
    fun ask()
}


class Adapter(val wrapper: Adaptee) : Target {
    override fun request() {
        wrapper.ask()
    }
}

fun main(args: Array<String>) {
}