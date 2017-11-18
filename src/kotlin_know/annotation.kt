package kotlin_know

// 类似于Java中的元注解声明
@Target(AnnotationTarget.CLASS, AnnotationTarget.FUNCTION,
        AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.EXPRESSION)
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
annotation class Fancy

//注解的用法
@Fancy class Foo{
    @Fancy fun baz(@Fancy foo: Int): Int{
        return (@Fancy 1)
    }
}

// 如果注解用作另一个注解的参数，则其名称不以 @ 字符为前缀：
annotation class ReplaceWith(val expression: String)

annotation class Deprecated(
        val message: String,
        val replaceWith: ReplaceWith = ReplaceWith(""))

//@Deprecated("This function is deprecated, use === instead", ReplaceWith("this === other"))