package testdrvivendevelopment.example.xUnit

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import kotlin.test.assertFalse

class xUnitTest {

  @Test
  fun testWasRun() {
    val test = WasRun(name = "testMethod")
    println(test.wasRun)
    test.testMethod()
    println(test.wasRun)
  }

  @Test
  fun testRunning() {
    val test = WasRun(name = "testMethod")
    assertFalse(test.wasRun)
    test.run()
    assertTrue(test.wasRun)
  }
}
