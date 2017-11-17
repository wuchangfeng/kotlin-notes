package kotlin_know
// kotlin中run用法
// run函数和apply函数很像，只不过run函数是使用最后一行的返回，apply返回当前自己的对象。
fun main(args: Array<String>) {
    // fun <T, R> T.run(f: T.() -> R): R = f()
    "testRun".run {
        println("this = " + this)
        "最后一行数据"
    }.let { println(it) }
}

//输出
//this = testRun
//最后一行数据