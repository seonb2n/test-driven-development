package testdrvivendevelopment.example.money.abstract

interface Expression {
  fun reduce(ban: Bank, to: String): Money

  fun plus(addend: Expression): Expression

  fun times(multiplier: Int): Expression
}
