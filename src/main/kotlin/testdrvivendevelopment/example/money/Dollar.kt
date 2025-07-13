package testdrvivendevelopment.example.money

import testdrvivendevelopment.example.money.abstract.Money

class Dollar(amount: Int) : Money(amount) {
  fun times(multiplier: Int): Dollar {
    return Dollar(this.amount * multiplier)
  }
}
