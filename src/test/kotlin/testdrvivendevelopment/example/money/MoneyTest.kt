package testdrvivendevelopment.example.money

import testdrvivendevelopment.example.money.abstract.Bank
import testdrvivendevelopment.example.money.abstract.Money
import testdrvivendevelopment.example.money.abstract.Sum
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class MoneyTest {

  @Test
  fun testMultiplication() {
    val five: Money = Money.dollar(5)
    assertEquals(Money.dollar(10), five.times(2))
    assertEquals(Money.dollar(15), five.times(3))
  }

  @Test
  fun testFrancMultiplication() {
    val five: Money = Money.franc(5)
    assertEquals(Money.franc(10), five.times(2))
    assertEquals(Money.franc(15), five.times(3))
  }

  @Test
  fun testEquality() {
    assertTrue(Money.dollar(5).equals(Money.dollar(5)))
    assertFalse(Money.dollar(5).equals(Money.dollar(6)))
    assertFalse(Money.franc(5).equals(Money.dollar((5))))
  }

  @Test
  fun testCurrency() {
    assertEquals("USD", Money.dollar(1).currency())
    assertEquals("CHF", Money.franc(1).currency())
  }

  @Test
  fun testSimpleAddition() {
    val five = Money.dollar(5)
    val sum = five.plus(five)
    val bank = Bank()
    val reduced = bank.reduce(sum, "USD")
    assertEquals(Money.dollar(10), reduced)
  }

  @Test
  fun testPlusReturnsSum() {
    val five = Money.dollar(5)
    val result = five.plus(five)
    val sum: Sum = result as Sum
    assertEquals(five, sum.augend)
    assertEquals(five, sum.addend)
  }

  @Test
  fun testReduceSum() {
    val sum = Sum(Money.dollar(3), Money.dollar(4))
    val bank = Bank()
    val result = bank.reduce(sum, "USD")
    assertEquals(Money.dollar(7), result)
  }

  @Test
  fun testReduceMoney() {
    val bank = Bank()
    val result = bank.reduce(Money.dollar(1), "USD")
    assertEquals(Money.dollar(1), result)
  }
}
