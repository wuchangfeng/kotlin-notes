package kotlin_design_pattern

/**
 * 设计模式之单例模式-比较简单，主要通过这个模式学习Kotlin中的语法
 */
object PrinterDDriver{
    init {
        println("Initializing with object: $this")
    }

    fun print() = println("Printing with object: $this")
}

fun main(args: Array<String>) {
    println("start")
    PrinterDDriver.print()
    PrinterDDriver.print()
}