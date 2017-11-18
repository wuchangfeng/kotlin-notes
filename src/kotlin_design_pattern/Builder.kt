package kotlin_design_pattern

/**
 * 设计模式之建造者模式-是为了构建复杂对象，一般情况下，可以用 apply 满足需求：
 */
/**
val dialog = Dialog(context).apply {
    setTitle("DialogA")
    setCancelable(true)
    setCanceledOnTouchOutside(true)
    setContentView(contentView)
}
*/

class Car (val model: String?, val year: Int) {

    //不想公开构造函数
    private constructor(builder: Builder) : this(builder.model, builder.year)

    //内部建造者类
    class Builder {
        var model: String? = null
        var year: Int = -1

        fun build() = Car(this)
    }

    // 本省对象，类似于类的静态方法，可以直接用类名调用build()
    companion object {
        inline fun build(block: Builder.() -> Unit) =
                Builder().apply(block).build()
    }
}

fun main(args: Array<String>) {
    val car = Car.build {
        model = "John one"
        year = 2017
    }
}

