import scala.io.StdIn.readLine

object Q2 {
  def main(args: Array[String]): Unit = {
    print("Enter strings separated by spaces: ")
    val input = readLine()
    val strings = input.split(" ").toList

    println(s"Strings with length greater than 5: ${filterLongStrings(strings)}")
  }

  def filterLongStrings(strings: List[String]): List[String] = {
    strings.filter(_.length > 5)
  }
}
