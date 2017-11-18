package kotlin_know

interface MyInterface {
    val prop: Int // 抽象的

    val propertyWithImplementation: String
        get() = "foo" // 属性重写

    fun foo() {
        print(prop)
    }
}

class Child : MyInterface {
    override val prop: Int = 29
}

fun main(args: Array<String>) {
    val child = Child()
    println(child.propertyWithImplementation)
}