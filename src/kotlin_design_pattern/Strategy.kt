package kotlin_design_pattern

/**
 * 设计模式之策略模式-策略模式(Strategy Pattern)：定义一系列算法，将每一个算法封装起来，
 * 并让它们可以相互替换。策略模式让算法独立于使用它的客户而变化，也称为政策模式(Policy)。
 * 主要还是避免硬编码以及过多的if-else、switch语句
 */
class Printer(val stringFormatterStrategy: (String) -> String){
    fun printString(string: String){
        println(stringFormatterStrategy.invoke(string))
    }
}

val lowerCaseFormatter: (String) ->String = {it.toLowerCase()}

val upperCaseFormater = {it: String -> it.toUpperCase()}

fun main(args: Array<String>) {

    // 获取一个Printer对象
    val lowerCasePrinter = Printer(lowerCaseFormatter)

    lowerCasePrinter.printString("LOREM ipsum DOLOR sit amet")

    val upperCasePrinter = Printer(upperCaseFormater)
    upperCasePrinter.printString("LOREM ipsum DOLOR sit amet")

    val prefixPrinter = Printer({ "Prefix: " + it })
    prefixPrinter.printString("LOREM ipsum DOLOR sit amet")
}