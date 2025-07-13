package testdrvivendevelopment.example.money.abstract

class Bank {
  fun reduce(source: Expression, to: String): Money {
    return source.reduce(to)
  }
}
