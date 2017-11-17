package kotlin_know

// lateinit 和 lazy 是 Kotlin 中的两种不同的延迟初始化技术。

/*
lateinit 只用于 var，而 lazy 只用于 val

*lazy 应用于单例模式(if-null-then-init-else-return)，而且当且仅当变量被第一次调用的时候，委托方法才会执行。

*lateinit 则用于只能生命周期流程中进行获取或者初始化的变量，比如 Android 的 onCreate()
 */

// http://ebnbin.com/2017/06/16/kotlin_variable_to_be_lazy_or_to_be_late/  推荐这篇文章