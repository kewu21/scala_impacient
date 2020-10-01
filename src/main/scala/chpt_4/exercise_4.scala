package chpt_4

import java.io.File
import java.util.Scanner

import scala.collection.mutable

object exercise_4 {
  def main(args: Array[String]): Unit = {
    val in = new Scanner(new File("README.md"))
    val counter: mutable.SortedMap[String, Int] = mutable.SortedMap()
    while (in.hasNext()) {
      val word = in.next
      counter(word) = counter.getOrElse(word, 0) + 1
    }
    println(counter.mkString(" \n"))
  }

}
