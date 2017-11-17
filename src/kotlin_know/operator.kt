package kotlin_know

//kotlin不支持自定义操作符，只能对现有操作符进行重载

data class OperatorOverride(var name: String, var age: Int) {
    // 重载 +a = a.unaryPlus()
    operator fun unaryPlus() : OperatorOverride{
        age = age.plus(100)
        return  this
    }

    // 重载 a++ =  a.inc()
    operator fun inc() : OperatorOverride {
        age += 10
        return  this
    }

    // 重载 a+b = a.plus(b)
    operator fun plus(oo: OperatorOverride): OperatorOverride {
        age += oo.age
        return  this
    }
    // 重载 equals
    override fun equals(other: Any?): Boolean {
        if (other is OperatorOverride) {
            return this.age > other.age
        }
        return false
    }
}

fun main(args: Array<String>) {

    var oo : OperatorOverride = OperatorOverride("zhang", 10)
    println("----------------------------------")
    println("原oo = ${oo}")
    +oo
    println("新oo = ${oo}")
    println("----------------------------------")
    println("----------------------------------")
    println("原oo = ${oo}")
    oo++
    println("新oo = ${oo}")
    println("----------------------------------")
    println("----------------------------------")
    val  o : OperatorOverride = OperatorOverride("zhao", 43)
    println("原oo = ${oo}")
    println("新oo = ${oo + o}")
    println("----------------------------------")
    println("----------------------------------")
    println(oo.equals(o)) // oo的age为120,o的age为43,故返回true
    println("----------------------------------")
}