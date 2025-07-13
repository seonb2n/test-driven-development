package testdrvivendevelopment.example.money

class Dollar(private val amount: Int) {

  fun times(multiplier: Int): Dollar {
    return Dollar(this.amount * multiplier)
  }

  override fun equals(other: Any?): Boolean {
    return this.amount == (other as Dollar).amount
  }
}
