package testdrvivendevelopment.example.money.abstract

interface Expression {
  fun reduce(ban: Bank, to: String): Money
}
