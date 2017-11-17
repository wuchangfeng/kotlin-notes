package kotlin_know

fun main(args: Array<String>) {
    val list: MutableList<String> = mutableListOf("A", "B", "C")
    val change: Any
    /**
     * 在let中，用it表示引用对象，并可调用其方法，it不可省略。
    返回值是语句块的最后一行，若最后一行语句无返回值，则整个let语句块也无返回值
     */
    change = list.let {
        it.add("D")
        it.add("E")
        //it.size // 返回值
        "Hello"
    }

    println("list = $list")
    println("change = $change")
}

/*
list = [A, B, C, D, E]
change = Hello
 */