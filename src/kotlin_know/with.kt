package kotlin_know

/* 在 java 中
TextView text=(TextView)findViewById(R.id.tv_text)
text.setText("hahaha")
text.setTextSize(23)
*/

/*
with(tv_text){
text="hahaha"
textSize=23
}
 */

//上面两段代码实现的功能是一样的，kotlin的代码更加简洁。
//with函数中的参数是一个对象，我们可以带方法中直接引用对象的公有属性或者公有方法，而不用使用方法名。
//如果一段代码你需要多次使用一个对象，那么你就可以使用with函数。

fun main(args: Array<String>) {
    // fun <T, R> with(receiver: T, f: T.() -> R): R = receiver.f()
    with(ArrayList<String>()) {
        add("testWith")
        add("testWith")
        add("testWith")
        println("this = " + this)
    }.let { println(it) }
}