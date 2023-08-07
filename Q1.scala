package lab7

import scala.io.StdIn
object Q1 {
  def main(args: Array[String]): Unit = {
    print("Enter the integers list separated by commas: ")
    val InputString = StdIn.readLine()
    val InputList = InputString.split(",").map(_.trim.toInt).toList

    val Output = filterEvenNumbers(InputList)
    println("\n" + Output)

  }

  def filterEvenNumbers(numbers: List[Int]): List[Int] = {
    numbers.filter(num => num % 2 == 0)
  }


}
