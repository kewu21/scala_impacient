package chpt_4

import java.io.File
import java.util.Scanner

object exercise_3 {
  def main(args: Array[String]): Unit = {
    val in = new Scanner(new File("README.md"))
    var counter: Map[String, Int] = Map()
    while (in.hasNext()) {
      val word = in.next
      counter += (word -> (counter.getOrElse(word, 0)+1))
    }
    println(counter.mkString(" "))
  }
}
