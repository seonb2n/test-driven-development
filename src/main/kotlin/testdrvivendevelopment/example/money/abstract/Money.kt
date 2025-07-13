package testdrvivendevelopment.example.money.abstract

import testdrvivendevelopment.example.money.Dollar
import testdrvivendevelopment.example.money.Franc

abstract class Money(protected val amount: Int) {
  override fun equals(other: Any?): Boolean {
    val money: Money = other as Money
    return this.amount == money.amount && this::class == money::class
  }

  abstract fun times(multiplier: Int): Money

  companion object {
    fun dollar(amount: Int): Money {
      return Dollar(amount)
    }

    fun franc(amount: Int): Money {
      return Franc(amount)
    }
  }
}
