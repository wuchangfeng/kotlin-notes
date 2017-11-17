package kotlin_design_pattern

interface Currency{
    val code: String
}

class Euro(override val code: String = "EUR"): Currency

class US(override val code: String = "USD"): Currency

enum class Country{
    US,Spain,UK,Greece
}

class CurrencyFactory{
    fun currencyForCountry(country: Country): Currency?{
        when(country){
            Country.Spain, Country.Greece -> return Euro()
            Country.US          -> return US()
            else                          -> return null
        }
    }
}

fun main(args: Array<String>) {
    val noCurrencyCode = "No Currency Code Available"

    // 第一个问号是 currencyForCountry 函数返回的可能为 null
    val greeceCode = CurrencyFactory().currencyForCountry(Country.Greece)?.code ?: noCurrencyCode
    println("Greece currency: $greeceCode")

    val usCode = CurrencyFactory().currencyForCountry(Country.US)?.code ?: noCurrencyCode
    println("US currency: $usCode")

    val ukCode = CurrencyFactory().currencyForCountry(Country.UK)?.code ?: noCurrencyCode
    println("UK currency: $ukCode")
}