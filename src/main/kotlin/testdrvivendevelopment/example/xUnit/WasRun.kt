package testdrvivendevelopment.example.xUnit


class WasRun(name: String, var wasRun: Boolean = false, var wasSetUp: Boolean = false) : TestCase(name) {
  fun testMethod() {
    this.wasSetUp = true
  }

  override fun setUp() {
    this.wasRun = true
  }
}
