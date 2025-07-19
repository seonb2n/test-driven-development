package testdrvivendevelopment.example.xUnit

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import kotlin.test.assertFalse

class xUnitTest {

  lateinit var test: WasRun

  fun setUp() {
    this.test = WasRun(name = "testMethod")
  }

  @Test
  fun testWasRun() {
    val test = WasRun(name = "testMethod")
    println(test.wasRun)
    test.testMethod()
    println(test.wasRun)
  }

  @Test
  fun testRunning() {
    this.setUp()
    this.test.run()
    assertTrue(test.wasRun)
  }

  @Test
  fun testSetUp() {
    this.setUp()
    this.test.run()
    assertTrue(test.wasSetUp)
  }
}
