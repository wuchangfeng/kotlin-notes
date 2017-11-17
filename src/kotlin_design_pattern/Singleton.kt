package kotlin_design_pattern

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