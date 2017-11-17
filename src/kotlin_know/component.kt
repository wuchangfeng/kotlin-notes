package kotlin_know

//kotlin中的解构

// 讲一个对象解构成多个变量，如下
// val (name, age) = person

fun main(args: Array<String>) {
    val map = mapOf<Int,String>(
            1 to "Hello",
            2 to "world"
    )

    for ((key,value) in map){
        println(key)
    }
}