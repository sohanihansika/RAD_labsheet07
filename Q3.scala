package lab7

import scala.io.StdIn
object Q3 {
  def main(args: Array[String]): Unit = {
    print("Enter integers list separated by commas: ")
    val InputString = StdIn.readLine()
    val InputList = InputString.split(",").map(_.trim.toInt).toList

    val Output = filterPrime(InputList)
    println("\n" + Output)

  }

  def filterPrime(numbers: List[Int]): List[Int] = {
    numbers.filter(ChrckPrime)
  }

  def ChrckPrime(number: Int): Boolean = {
    if (number <= 1) {
      false
    } else if (number == 2) {
      true
    } else {
      !(2 to Math.sqrt(number).toInt).exists(i => number % i == 0)
    }
  }


}
