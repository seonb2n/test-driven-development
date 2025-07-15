package testdrvivendevelopment.example.xUnit


class WasRun(name: String, var wasRun: Boolean = false) : TestCase(name) {
  fun testMethod() {
    this.wasRun = true
  }
}
