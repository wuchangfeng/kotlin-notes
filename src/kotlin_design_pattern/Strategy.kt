package kotlin_design_pattern

// 构造函数接受一个lambda
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