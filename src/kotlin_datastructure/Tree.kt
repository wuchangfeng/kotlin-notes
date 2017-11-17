package kotlin_datastructure

class TreeNode<T>(value: T){
    var value: T = value

    var parent:TreeNode<T>?= null

    var children:MutableList<TreeNode<T>> = mutableListOf()

    fun addChild(node:TreeNode<T>){
        children.add(node)
        node.parent = this
    }

    /**
     * https://github.com/bmaslakov/kotlin-algorithm-club/blob/be9300c5d305f2fc3a94a5f8bd8caa29908e31d8/src/main/io/uuddlrlrba/ktalgs/datastructures/tree/Tree.kt#L33
     */
    fun size(): Int{
        return children.fold(1,{size,child -> size + child.size()})
    }

    fun height(): Int {
        return 1 + (children.map { it.size() }.max() ?: 0) //递归遍历获取子树最大的size
    }

    override fun toString(): String {
        var s = "${value}"
        if (!children.isEmpty()){
            s += "{" + children.map { it.toString() } + "}"
        }
        return s
    }
}

fun main(args: Array<String>) {
    val tree = TreeNode<String>( "A")

    val B1Node = TreeNode<String>( "B1")
    val B2Node = TreeNode<String>( "B2")

    val C1Node = TreeNode<String>( "C1")
    val C2Node = TreeNode<String>( "C2")
    val C3Node = TreeNode<String>( "C3")


    tree.addChild(B1Node)
    tree.addChild(B2Node)

    B1Node.addChild(C1Node)
    B2Node.addChild(C2Node)
    B2Node.addChild(C3Node)

    // 默认重写了tostring
    println(tree)
}