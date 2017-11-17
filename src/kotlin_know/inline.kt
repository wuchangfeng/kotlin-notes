package kotlin_know

// 注意这个 Any 必须要有
inline fun <reified T:Any> getClass() = T::class

fun main(s: Array<String>) {
    println(getClass<Int>())    //class kotlin.Int
    println(getClass<String>()) //class kotlin.String
}