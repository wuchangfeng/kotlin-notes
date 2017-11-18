package kotlin_design_pattern

/**
 * 在访问者模式（Visitor Pattern）中，我们使用了一个访问者类，
 * 它改变了元素类的执行算法。通过这种方式，元素的执行算法可以随着访问者改变而改变。
 */
// 定义一个表示元素的接口
interface ReportVisitable {
    // 一个能够接受访问者的方法
    fun accept(visitor: ReportVisitor)
}

// 实体类一
class FixedPriceContract(val costPerYear: Long) : ReportVisitable {
    override fun accept(visitor: ReportVisitor) = visitor.visit(this)
}

// 实体类二
class TimeAndMaterialsContract(val costPerHour: Long, val hours: Long) : ReportVisitable {
    override fun accept(visitor: ReportVisitor) = visitor.visit(this)
}

// 实体类三
class SupportContract(val costPerMonth: Long) : ReportVisitable {
    override fun accept(visitor: ReportVisitor) = visitor.visit(this)
}


// 访问者接口
interface ReportVisitor {
    // 访问方法一
    fun visit(contract: FixedPriceContract)
    // 访问方法二
    fun visit(contract: TimeAndMaterialsContract)
    // 访问方法三
    fun visit(contract: SupportContract)
}

// 实体访问者
class MonthlyCostReportVisitor(var monthlyCost: Long = 0) : ReportVisitor {
    override fun visit(contract: FixedPriceContract) {
        monthlyCost += contract.costPerYear / 12
    }

    override fun visit(contract: TimeAndMaterialsContract) {
        monthlyCost += contract.costPerHour * contract.hours
    }

    override fun visit(contract: SupportContract) {
        monthlyCost += contract.costPerMonth
    }
}

fun main(args: Array<String>) {
    val projectAlpha = FixedPriceContract(costPerYear = 10000)
    val projectBeta = SupportContract(costPerMonth = 500)
    val projectGamma = TimeAndMaterialsContract(hours = 150, costPerHour = 10)
    val projectKappa = TimeAndMaterialsContract(hours = 50, costPerHour = 50)

    // 根据不同的访问者执行不同的计算方法
    val projects = arrayOf(projectAlpha, projectBeta, projectGamma, projectKappa)

    val monthlyCostReportVisitor = MonthlyCostReportVisitor()
    projects.forEach { it.accept(monthlyCostReportVisitor) }
    println("Monthly cost: ${monthlyCostReportVisitor.monthlyCost}")
}