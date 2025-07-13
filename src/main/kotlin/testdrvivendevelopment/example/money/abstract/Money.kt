package testdrvivendevelopment.example.money.abstract

open class Money(val amount: Int, protected val currency: String): Expression {
  override fun equals(other: Any?): Boolean {
    val money: Money = other as Money
    return this.amount == money.amount && this.currency == money.currency
  }

  fun times(multiplier: Int): Expression {
    return Money(amount * multiplier, currency)
  }

  override fun plus(addend: Expression): Expression {
    return Sum(this, addend)
  }

  fun currency(): String {
    return this.currency
  }

  override fun reduce(bank: Bank, to: String): Money {
    val rate = bank.rate(currency, to)
    return Money(amount / rate, to)
  }

  companion object {
    fun dollar(amount: Int): Money {
      return Money(amount, "USD")
    }

    fun franc(amount: Int): Money {
      return Money(amount, "CHF")
    }
  }
}
