package kotlin_algorithm

/**
 * kotlin 中冒泡排序
 */
class bubbleSort {
    init {
        val a = intArrayOf(49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5, 4, 62, 99, 98, 54, 56, 17, 18, 23, 34, 15, 35, 25, 53, 51)
        var temp = 0
        for (i in 0 until a.size - 1) {
            for (j in 0 until a.size - 1 - i) {
                if (a[j] > a[j + 1]) {
                    temp = a[j]
                    a[j] = a[j + 1]
                    a[j + 1] = temp
                }
            }
        }
        for (i in a.indices)
            print(a[i])
    }
}

fun main(args: Array<String>) {
    val bubbleSort = bubbleSort()
}