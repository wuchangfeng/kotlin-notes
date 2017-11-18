package kotlin_design_pattern

/**
 * 设计模式之命令模式-：将一个请求封装为一个对象，
 * 从而使我们可用不同的请求对客户进行参数化；对请求排队或者记录请求日志，
 * 以及支持可撤销的操作。命令模式是一种对象行为型模式，
 * 其别名为动作(Action)模式或事务(Transaction)模式。
 */
interface OrderCommand{
    fun execute()
}

class OrderAddCommand(val id: Long): OrderCommand{
    override fun execute() {
        println("adding order with id: $id")
    }
}

class OrderPayCommand(val id: Long): OrderCommand{
    override fun execute() {
        println("paying for order with id: $id")
    }
}

class CommandProcessor{
    private val queue = ArrayList<OrderCommand>()

    // apply的用法
    fun addToQueue(orderCommand: OrderCommand): CommandProcessor
        = apply { queue.add(orderCommand) }

    fun processCommands(): CommandProcessor = apply {
        queue.forEach { it.execute() }
        queue.clear()
    }
}

fun main(args: Array<String>) {
    CommandProcessor()
            .addToQueue(OrderAddCommand(1L))
            .addToQueue(OrderAddCommand(2L))
            .addToQueue(OrderPayCommand(2L))
            .addToQueue(OrderPayCommand(1L))
            .processCommands()
}