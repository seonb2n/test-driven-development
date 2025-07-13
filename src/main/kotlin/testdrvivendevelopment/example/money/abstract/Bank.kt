package testdrvivendevelopment.example.money.abstract

import java.util.Hashtable

class Bank() {
  private val rates = Hashtable<Pair, Int>()

  fun reduce(source: Expression, to: String): Money {
    return source.reduce(this, to)
  }

  fun rate(from: String, to: String): Int {
    if (from == to) return 1
    val rate = rates.getOrDefault(Pair(from, to), 0)
    return rate
  }

  fun addRate(from: String, to: String, rate: Int) {
    rates[Pair(from, to)] = rate
  }
}
