package testdrvivendevelopment.example.money.abstract

open class Money(protected val amount: Int) {
  override fun equals(other: Any?): Boolean {
    val money: Money = other as Money
    return this.amount == money.amount && this::class == money::class
  }
}
