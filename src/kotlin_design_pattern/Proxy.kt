package kotlin_design_pattern

/**
 * 设计模式之代理模式-比较简单，不想直接交互，需要解耦。
 */
// 通用接口
interface File{
    fun read(name: String)
}

// 被代理类
class NormalFile : File{
    override fun read(name: String) {
        println("Reading file: $name")
    }
}

// 代理类
class SecuredFile : File{
    val normalFile = NormalFile()
    var password: String = ""

    override fun read(name: String) {
        if (password == "secret"){
            println("Password is correct: $password")
            // 去调用被代理类的方法
            normalFile.read(name)
        }else{
            println("error")
        }
    }
}

fun main(args: Array<String>) {
    val securedFile = SecuredFile()
    securedFile.read("readme.md")

    securedFile.password = "secret"
    securedFile.read("readme.md")
}