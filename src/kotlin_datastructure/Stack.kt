package kotlin_datastructure

class Stack<T : Comparable<T>>(list : MutableList<T>) : Iterator<T> {
    var itCounter: Int = 0

    var items: MutableList<T> = list

    //根据传入的list取得判断
    fun isEmpty(): Boolean = this.items.isEmpty()

    fun count(): Int = this.items.count()

    //add
    fun push(element: T) {
        val position = this.count()
        this.items.add(position, element)
    }

    override fun toString(): String {
        return this.items.toString()
    }

    fun pop(): T? {
        if (this.isEmpty()) {
            return null
        } else {
            val item = this.items.count() - 1
            return this.items.removeAt(item)
        }
    }

    fun peek(): T? {
        if (isEmpty()) {
            return null
        } else {
            return this.items[this.items.count() - 1]
        }


    }

    override fun hasNext(): Boolean {
        val hasNext = itCounter < count()
        if (!hasNext) itCounter = 0
        return hasNext
    }

    override fun next(): T {
        if (hasNext()){
            val topPos : Int = (count() - 1) - itCounter
            itCounter++
            return this.items[topPos]
        }else{
            throw NoSuchElementException("No such element")
        }
    }
}

fun main(args: Array<String>) {
    //初始化容量为10的list
    var initialValue =  mutableListOf<Int>(10)
    //构建容量为10并且数据类型为Int的stack
    var stack = Stack<Int>(initialValue)
    println(stack)
    stack.push(22)
    println(stack)
    stack.push(55)
    println(stack)
    stack.push(77)
    println(stack)
    stack.pop()
    println(stack)

    for (item in stack) println("Item in stack : " + item)
}