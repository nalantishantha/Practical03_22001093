import scala.io.StdIn.readInt
import scala.math.BigDecimal.RoundingMode

object Q3 {
  def main(args: Array[String]): Unit = {
    print("Enter the first number: ")
    val num1 = readInt()
    print("Enter the second number: ")
    val num2 = readInt()

    val mean = calculateMean(num1, num2)
    println(f"The average of $num1 and $num2 is: $mean%.2f")
  }

  def calculateMean(num1: Int, num2: Int): Double = {
    val mean = (num1 + num2) / 2.0
    BigDecimal(mean).setScale(2, RoundingMode.HALF_UP).toDouble
  }
}
