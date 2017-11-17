package kotlin_know

// 一个类带有的主构造函数
open class Person constructor(firstName:String){

    // 次构造函数
    //constructor(parent:Person){
    //}

    init {
        // 初始化构造内容
    }

    open fun v(){}
    fun nv() {}
}

//继承
class Man : Person(firstName="dad"){
    override fun v() {
        super.v()
    }
}

fun main(args: Array<String>) {
    // 获取类的实例，咩有new关键字
    val man = Person("yes")
}
