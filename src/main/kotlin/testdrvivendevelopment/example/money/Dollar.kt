package testdrvivendevelopment.example.money

import testdrvivendevelopment.example.money.abstract.Money

class Dollar(amount: Int) : Money(amount) {

  override fun times(multiplier: Int): Money {
    return Dollar(amount * multiplier)
  }
}
