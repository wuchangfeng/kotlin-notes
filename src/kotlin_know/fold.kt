package kotlin_know

fun main(args: Array<String>) {
    val list = listOf<Int>(1,2,3)
    // fold
    // 在一个初始值的基础上从第一项到最后一项通过一个函数累计所有的元素。
    // 初始值就是 4
    var value = list.fold(4){total,next -> total + next}
    println(value)
    //与fold一样，但是没有一个初始值。通过一个函数从第一项到最后一项进行累计。
    var value2 = list.reduce{total,next -> total + next}

}