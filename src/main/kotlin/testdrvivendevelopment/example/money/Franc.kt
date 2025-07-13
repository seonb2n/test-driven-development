package testdrvivendevelopment.example.money

import testdrvivendevelopment.example.money.abstract.Money

class Franc(amount: Int) : Money(amount) {
  override fun times(multiplier: Int): Money {
    return Franc(amount * multiplier)
  }
}
