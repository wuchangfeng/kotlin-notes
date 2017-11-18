package kotlin_design_pattern

/**
 * 设计模式之状态模式-在很多情况下，一个对象的行为取决于一个或多个动态变化的属性，
 * 这样的属性叫做状态，这样的对象叫做有状态的(stateful)对象，
 * 这样的对象状态是从事先定义好的一系列值中取出的。
 * 当一个这样的对象与外部事件产生互动时，其内部状态就会改变，
 * 从而使得系统的行为也随之发生变化。
 * 允许一个对象在其内部状态改变时改变它的行为，对象看起来似乎修改了它的类
 */
sealed class AuthorizationState

// 状态一
class Unauthorized : AuthorizationState()

// 状态二
class Authorized(val userName: String) : AuthorizationState()


class AuthorizationPresenter {

    private var state: AuthorizationState = Unauthorized()

    fun loginUser(userLogin: String) {
        state = Authorized(userLogin)
    }

    fun logoutUser() {
        state = Unauthorized()
    }

    val isAuthorized: Boolean
        get() = when (state) {
            is Authorized -> true
            is Unauthorized -> false
        }

    val userLogin: String
        get() = when (state) {
            is Authorized -> (state as Authorized).userName
            is Unauthorized -> "Unknown"
        }

    override fun toString() = "User '$userLogin' is logged in: $isAuthorized"
}

fun main(args: Array<String>) {

    val authorization = AuthorizationPresenter()
    // 对象的行为 依据 对象的属性 而变化
    authorization.loginUser("admin")
    println(authorization)

    authorization.logoutUser()
    println(authorization)
}