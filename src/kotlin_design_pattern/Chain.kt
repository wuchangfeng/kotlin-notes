package kotlin_design_pattern

/**
 * 设计模式之责任链模式
 */
// 责任接口
interface MessageChain{
    fun addLines(inputHeader: String): String
}

// AuthenticationHeader 处理器
class AuthenticationHeader(val token: String?,var next: MessageChain?= null) : MessageChain{
    override fun addLines(inputHeader: String): String {
        token ?: throw IllegalStateException("token should be not null")
        return "$inputHeader Authorization: Bearer $token\n"
                .let{next?.addLines(it)?:it}
    }
}

// ContentTypeHeader 处理器
class ContentTypeHeader(val contentType: String, var next: MessageChain? = null) : MessageChain {

    override fun addLines(inputHeader: String): String
            = "$inputHeader ContentType: $contentType\n".let { next?.addLines(it) ?: it }
}

// BodyPayload处理器
class BodyPayload(val body: String, var next: MessageChain? = null) : MessageChain {

    override fun addLines(inputHeader: String): String
            = "$inputHeader $body\n".let { next?.addLines(it) ?: it }}

// 责任链赋予函数
fun messageChainWithAuthorization(authenticationHeader: AuthenticationHeader, contentTypeHeader: ContentTypeHeader, messageBody: BodyPayload): MessageChain {
    authenticationHeader.next = contentTypeHeader
    contentTypeHeader.next = messageBody
    return authenticationHeader
}

fun main(args: Array<String>) {
    val authenticationHeader = AuthenticationHeader("123456")
    val contentTypeHeader = ContentTypeHeader("json")
    val messageBody = BodyPayload("{\"username\"=\"dbacinski\"}")

    val messageChainWithAuthorization = messageChainWithAuthorization(authenticationHeader, contentTypeHeader, messageBody)
    val messageWithAuthentication = messageChainWithAuthorization.addLines("Message with Authentication:\n")
    println(messageWithAuthentication)
}



