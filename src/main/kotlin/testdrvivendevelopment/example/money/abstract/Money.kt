package testdrvivendevelopment.example.money.abstract

open class Money(val amount: Int, protected val currency: String): Expression {
  override fun equals(other: Any?): Boolean {
    val money: Money = other as Money
    return this.amount == money.amount && this.currency == money.currency
  }

  fun times(multiplier: Int): Money {
    return Money(amount * multiplier, currency)
  }

  fun plus(addend: Money): Sum {
    return Sum(this, addend)
  }

  fun currency(): String {
    return this.currency
  }

  override fun reduce(to: String): Money {
    return this
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
