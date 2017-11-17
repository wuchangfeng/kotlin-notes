package kotlin_design_pattern

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