package testdrvivendevelopment.example.money

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFails
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class MoneyTest {

  @Test
  fun testMultiplication() {
    val five = Dollar(5)
    assertEquals(Dollar(10), five.times(2))
    assertEquals(Dollar(15), five.times(3))
  }

  @Test
  fun testEquality() {
    assertTrue(Dollar(5).equals(Dollar(5)))
    assertFalse(Dollar(5).equals(Dollar(6)))
  }
}
