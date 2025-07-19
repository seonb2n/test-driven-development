package testdrvivendevelopment.example.xUnit

class TestResult(var runCount: Int = 0, var failureCount: Int = 0) {

  fun testStarted() {
    this.runCount++
  }

  fun testFailed() {
    this.failureCount++
  }

  fun summary(): String {
    return "$runCount run, $failureCount failed"
  }
}
