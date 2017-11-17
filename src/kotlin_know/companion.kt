package kotlin_know

class MyClass{
    companion object Factory{
        fun create(): MyClass = MyClass()
    }
}

/**
 * @JvmStatic 注解只能用在伴生对象里，修饰伴生对象内的属性和函数，
 * 用来告诉编译器将属性和函数编译为真正的 JVM 静态成员。
 * 需要注意到，如果在伴生对象声明里使用 @JvmStatic 注解，
 * 那么没有加该注解的属性和函数将不会被编译为静态成员：
 */
class Person2(val name: String){
    companion object {
        @JvmStatic val anonymous2 = Person2("Anonymous")
        fun say() = println("Hello")
    }
}

fun main(args: Array<String>) {
    Person2.anonymous2
    Person2.say()
}
