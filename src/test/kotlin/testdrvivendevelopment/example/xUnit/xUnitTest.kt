package testdrvivendevelopment.example.xUnit

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse

class xUnitTest {

  lateinit var test: WasRun

  @BeforeEach
  fun setUp() {
    this.test = WasRun(name = "testMethod")
  }

  @Test
  fun testWasRun() {
    println(test.wasRun)
    test.testMethod()
    println(test.wasRun)
  }

  @Test
  fun testRunning() {
    this.test.run()
    assertTrue(test.wasRun)
  }

  @Test
  fun testSetUp() {
    this.test.run()
    assertTrue(test.wasSetUp)
  }

  @Test
  fun testTemplateMethod() {
    this.test.run()
    assertEquals("setUp testMethod tearDown ", test.log)
  }
}
