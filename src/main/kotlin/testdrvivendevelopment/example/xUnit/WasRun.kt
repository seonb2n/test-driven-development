package testdrvivendevelopment.example.xUnit


class WasRun(name: String, var wasRun: Boolean = false, var wasSetUp: Boolean = false, var log: String = "setUp ") : TestCase(name) {
  fun testMethod() {
    this.wasSetUp = true
    this.log += "testMethod "
  }

  override fun setUp() {
    this.wasRun = true
    this.log = "setUp "
  }

  override fun tearDown() {
    this.log += "tearDown "
  }
}
