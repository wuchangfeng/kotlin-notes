package kotlin_know

/**
 * kotlin中元素pair和triple用法,pair一对、一组
 */
fun main(args: Array<String>) {
    val(a,b) = Pair(1,"2")
    println(a)
    println(b)
    println( Pair(1,"2").toList()) //[1, 2]

    val (c, d, e) = Triple(2, "x", listOf(null))
    println(c) // 2
    println(d) // x
    println(e) // [null]

    // pair to map
    val mapOne = mapOf<String,String>(Pair("keyOne","valueOne"),Pair("keyTwo","valueTwo"))
    // 相关API
    println("map里面元素个数 :"+mapOne.size)
    println("map是否为空 ：" + mapOne.isEmpty())
    println("根据键获取value ：" + mapOne.get("keyOne"))
    println("根据键获取value ：" + mapOne.getOrDefault("keyOne","不存在keyOne,这里显示默认的"))
    // 获取所有的key
    for (key in mapOne.keys){
        println("集合的所有key："+key)
    }
    for (value in mapOne.values){
        println("集合所有的value ："+value)
    }
    // 上面mapof初始化的MAP是不可改变的，如果需要改变，可以通过以下方法
    val mapTwo = mapOne.toMutableMap()
    mapTwo["keyOne"] = "更新keyValue"
    mapTwo["keyThree"] = "增加的value"
}