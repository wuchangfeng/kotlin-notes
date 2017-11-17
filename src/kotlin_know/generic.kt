package kotlin_know

// kotlin中泛型知识
class Box<T:Any>(t:T){
    var value = t
}
fun main(args: Array<String>) {
    val box = Box(3)
    println(box.value)//3
}