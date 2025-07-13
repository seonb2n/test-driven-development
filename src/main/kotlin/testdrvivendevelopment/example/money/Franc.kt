package testdrvivendevelopment.example.money

import testdrvivendevelopment.example.money.abstract.Money

class Franc(amount: Int) : Money(amount) {
  fun times(multiplier: Int): Franc {
    return Franc(this.amount * multiplier)
  }
}
