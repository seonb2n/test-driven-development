package testdrvivendevelopment.example.xUnit

import kotlin.reflect.full.memberFunctions
import kotlin.reflect.jvm.isAccessible

open class TestCase(val name: String) {

  open fun setUp() {}

  open fun tearDown() {}

  fun run(): TestResult {
    val result = TestResult()
    result.testStarted()
    this.setUp()
    try {
      val method = this::class.memberFunctions.find { it.name == this.name }
      method?.let {
        it.isAccessible = true
        it.call(this)
      }
    } catch (e : Exception) {
      result.testFailed()
    }
    this.tearDown()
    return result
  }

}
