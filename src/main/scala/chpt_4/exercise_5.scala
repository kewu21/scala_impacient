package chpt_4

import java.io.File
import java.util
import java.util.Scanner

import scala.jdk.CollectionConverters._
import scala.collection.mutable

object exercise_5 {
  def main(args: Array[String]): Unit = {
    val in = new Scanner(new File("README.md"))
    val counter: java.util.SortedMap[String, Int] = new util.TreeMap[String, Int]()
    while (in.hasNext()) {
      val word = in.next
      counter.put(word, counter.getOrDefault(word, 0) + 1)
    }
    println(counter.asScala.mkString(" \n"))
  }

}
