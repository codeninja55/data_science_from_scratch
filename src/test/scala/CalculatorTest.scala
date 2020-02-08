
import org.scalatest.flatspec.AnyFlatSpec

class CalculatorTest extends AnyFlatSpec {

  "Calculator" should "return cube of 3 which is 27" in {
    assert(Calculator.cube(3) === 27)
  }

  "Calculator" should "return cube of 0 equals 0" in {
    assert(Calculator.cube(0) === 0)
  }

  "Calculator" should "return square of 6 equals 36" in {
    assert(Calculator.square(6) === 36 )
  }

  "Calculator" should "cause a ArithmeticException trying to divide by 0" in {
    assertThrows[ArithmeticException] {
      Calculator.divide(10, 0)
    }
  }
}
