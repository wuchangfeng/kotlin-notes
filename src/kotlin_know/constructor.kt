package kotlin_know

// 构造方法私有，不让轻易new对象
class Utils private constructor(){
    companion object {
        fun getScore(value: Int): Int{
            return 2 * value
        }
    }
}

fun main(args: Array<String>) {
    Utils.getScore(3)
}