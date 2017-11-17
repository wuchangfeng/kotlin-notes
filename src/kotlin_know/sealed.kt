package kotlin_know

// 密封类
/**
 * 密封类用来表示受限的类继承结构：当一个值为有限集中的类型、而不能有任何其他类型时。在某种意义上，
 * 他们是枚举类的扩展：枚举类型的值集合也是受限的，但每个枚举常量只存在一个实例，而密封类的一个子类可以有可包含状态的多个实例。
 *
 * 要声明一个密封类，需要在类名前面添加 sealed 修饰符。虽然密封类也可以有子类，
 * 但是所有子类都必须在与密封类自身相同的文件中声明。（在 Kotlin 1.1 之前， 该规则更加严格：子类必须嵌套在密封类声明的内部）。
 */
sealed class Expr
data class Const(val number: Double) : Expr()
data class Sum(val e1: Expr, val e2: Expr) : Expr()
object NotANumber : Expr()

fun eval(expr: Expr): Double = when(expr) {
    is Const -> expr.number
    is Sum -> eval(expr.e1) + eval(expr.e2)
    NotANumber -> Double.NaN
// 不再需要 `else` 子句，因为我们已经覆盖了所有的情况
}

