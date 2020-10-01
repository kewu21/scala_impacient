package chpt_4

import java.io.File
import java.util.Scanner

import scala.collection.mutable

object exercise_2 {
  def main(args: Array[String]): Unit = {
    val in = new Scanner(new File("README.md"))
    val counter: mutable.Map[String, Int] = mutable.Map().withDefaultValue(0)
    while (in.hasNext()) {
      val word = in.next
      counter(word) = counter(word) + 1
    }
    println(counter.mkString(" "))
  }
}
