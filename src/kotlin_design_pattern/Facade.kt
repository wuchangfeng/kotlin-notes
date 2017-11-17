package kotlin_design_pattern

/**
 * 设计模式之外观模式，屏蔽复杂系统的内部实现
 */
class ComplexSystemStore(val filePath: String){

    // 初始化块
    init {
        println("reading data from file: $filePath")
    }


    val store = HashMap<String,String>()

    // 存储函数
    fun store(key: String, payload: String){
        store.put(key,payload)
    }

    // 读取函数
    fun read(key: String): String = store[key] ?: ""

    // 提交函数
    fun commit() = println("Stroring cached data: $store to file: $filePath")
}


data class User(val login: String)

class UserRepository{
    val systemPreferences = ComplexSystemStore("/data/default.prefs")

    fun save(user: User){
        systemPreferences.store("USER_KEY",user.login)
        systemPreferences.commit()
    }

    fun findFirst(): User = User(systemPreferences.read("USER_KEY"))
}

fun main(args: Array<String>) {
    val userRepository = UserRepository()
    // 获取一个user对象，包含login属性
    val user = User("dbacinski")
    userRepository.save(user)
    val resultUser = userRepository.findFirst()
    println("Found stored user: $resultUser")
}