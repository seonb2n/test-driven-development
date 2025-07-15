package testdrvivendevelopment.example.xUnit

import kotlin.reflect.full.memberFunctions
import kotlin.reflect.jvm.isAccessible

open class TestCase(val name: String) {

  fun run() {
    val method = this::class.memberFunctions.find { it.name == this.name }
    method?.let {
      it.isAccessible = true
      it.call(this)
    }
  }

}
