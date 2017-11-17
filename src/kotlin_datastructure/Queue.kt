package kotlin_datastructure

class Queue<T>(list:MutableList<T>): Iterator<T>{

    var itCounter: Int = 0

    var items:MutableList<T> = list

    fun isEmpty():Boolean = this.items.isEmpty()

    fun count():Int = this.items.count()

    override fun toString(): String = this.items.toString()

    fun enqueue(element: T){
        this.items.add(element)
    }

    fun dequeue():T?{
        if (this.isEmpty()){return null}
        else{return this.items.removeAt(0)}
    }

    fun peek():T?{
        return this.items[0]
    }

    override fun hasNext(): Boolean {
        val hasNext = itCounter < count()
        if (!hasNext) itCounter = 0
        return hasNext
    }

    override fun next(): T {
        if (hasNext()){
            val topPos: Int = (count() - 1) - itCounter
            itCounter++
            return this.items[topPos]
        }else{
            throw NoSuchElementException("no such element")
        }
    }
}

fun main(args: Array<String>) {
    var initialValue =  mutableListOf<Int>(10)
    var queue = Queue<Int>(initialValue)
    println(queue)
    queue.enqueue(22)
    println(queue)
    queue.enqueue(55)
    println(queue)
    queue.enqueue(77)
    println(queue)
    queue.dequeue()
    println(queue)
    queue.dequeue()
    println(queue)
    queue.dequeue()
    println(queue)
    // in 的内部实现需要hasNext和Next
    for (item in queue) println("Item in queue : " + item)
}