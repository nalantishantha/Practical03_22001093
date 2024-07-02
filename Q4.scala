import scala.io.StdIn.readLine

object Q4 {
  def main(args: Array[String]): Unit = {
    print("Enter numbers separated by spaces:")
    val input = readLine()
    val numbers = input.split(" ").map(_.toInt).toList

    println(s"The sum of even numbers in the list is: ${sumOfEvenNumbers(numbers)}")
  }

  def sumOfEvenNumbers(numbers: List[Int]): Int = {
    numbers.filter(_ % 2 == 0).sum
  }
}
