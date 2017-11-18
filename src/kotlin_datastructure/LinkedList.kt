package kotlin_datastructure

/**
 * 链表节点定义
 */
class Node<T>(value : T){
    var value : T = value
    var next : Node<T>? = null
    var previous : Node<T>? = null
}

/**
 * 链表定义
 */
class LinkedList<T>{
    var head : Node<T>?= null
    //取决于head是否为null
    var isEmpty : Boolean = head == null

    fun first() : Node<T>? = head

    fun last() : Node<T>?{
        var node = head
        if (node != null){
            while (node?.next != null){
                node = node?.next
            }
            return node
        }else{
            return null
        }
    }

    fun count():Int {
        var node = head
        if (node != null){
            var counter = 1
            while (node?.next != null){
                node = node?.next
                counter += 1
            }
            return counter
        } else {
            return 0
        }
    }

    fun append(value : T){
        var newNode = Node(value)
        // 获取当前节点的最后一个节点
        var lastNode = this.last()
        if (lastNode != null){
            newNode.previous = lastNode
            lastNode.next = newNode
        }else{
            head = newNode
        }
    }

    fun removeNode(node : Node<T>) : T{
        val prev = node.previous
        val next = node.next

        if (prev != null){
            prev.next = next
        }else{
            head = next
        }
        next?.previous = prev

        node.previous = null
        node.next = null

        return node.value
    }
}

fun main(args: Array<String>) {

}