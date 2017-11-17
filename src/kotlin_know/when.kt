package kotlin_know

// when 替代了 switch
fun whenFun(a:Int){
    when(a){
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> { // 注意这块,防止意外的数据
            print("x is neither 1 nor 2")
        }
    }
}

fun main(args: Array<String>) {
    whenFun(3)
}