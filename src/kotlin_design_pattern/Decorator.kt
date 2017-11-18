package kotlin_design_pattern

/**
 * 设计模式之装饰者模式，跟继承类似，给一个对象添加功能
 */
interface CoffeeMachine{
    fun makeSmallCoffee()
    fun makeLargeCoffee()
}

// 正常的咖啡机
class NormalCoffeeMachine : CoffeeMachine {
    override fun makeSmallCoffee() = println("Normal: Making small coffee")
    override fun makeLargeCoffee() = println("Normal: Making large coffee")
}

// by表示将coffeeMachine存储在EnhancedCoffeeMachine对象实例内部
// 而且编译器将会生成继承自 CoffeeMachine 接口的所有方法, 并将调用转发给 coffeeMachine。
class EnhancedCoffeeMachine(val coffeeMachine: CoffeeMachine) : CoffeeMachine by coffeeMachine{
    // overriding behaviour
    override fun makeLargeCoffee() {
        println("Enhanced: Making large coffee")
        coffeeMachine.makeLargeCoffee()
    }

    // extended behaviour
    fun makeCoffeeWithMilk() {
        println("Enhanced: Making coffee with milk")
        coffeeMachine.makeSmallCoffee()
        println("Enhanced: Adding milk")
    }
}

fun main(args: Array<String>) {
    val normalMachine = NormalCoffeeMachine()
    val enhancedMachine = EnhancedCoffeeMachine(normalMachine)

    // non-overridden behaviour
    enhancedMachine.makeSmallCoffee()
    // overriding behaviour
    enhancedMachine.makeLargeCoffee()
    // extended behaviour
    enhancedMachine.makeCoffeeWithMilk()
}