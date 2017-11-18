package kotlin_design_pattern

/**
 * 设计模式之工厂方法模式
 */
interface Product{
    val name: String
}

class ProductA(override val name: String = "productA") : Product{
    fun Print(){
        println("生成A产品")
    }
}

class ProductB(override val name: String = "productB") : Product{
    fun Print(){
        println("生成B产品")
    }
}

interface Factory {
    fun makeProduct(): Product
}

class FactoryA : Factory {

    override fun makeProduct() = ProductA()
}

class FactoryB : Factory {
    override fun makeProduct() = ProductB()
}

fun main(args: Array<String>) {
    val a = FactoryA()
}