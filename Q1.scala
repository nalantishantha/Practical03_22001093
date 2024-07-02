object Q1 {
  def reverseString(s: String): String = {
    if (s.isEmpty) ""
    else reverseString(s.tail) + s.head
  }

  def main(args: Array[String]): Unit = {
    print("Please enter a string:")
    val originalStr = scala.io.StdIn.readLine()
    val reversedStr = reverseString(originalStr)
    println(reversedStr) 
  }
}
