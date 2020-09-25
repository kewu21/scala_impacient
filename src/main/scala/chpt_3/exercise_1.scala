package chpt_3

import scala.util._

object exercise_1 {
  def main(args: Array[String]): Unit = {
    val a = for (_ <- 0 to 10) yield Random.between(0, 10)
    println(a)
  }
}
