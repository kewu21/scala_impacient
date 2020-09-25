package chpt_3

import scala.collection.mutable.ArrayBuffer

object exercise_4 {
  def main(args: Array[String]): Unit = {
    val a = Array(1,2,-1,-2,5,4, 0)
    val b = for (i <- a.indices if a(i) > 0) yield i
    val d = for (i <- a.indices if a(i) <= 0) yield i
    val c: ArrayBuffer[Int] = ArrayBuffer()
    for (i <- b) c.append(a(i))
    for (i <- d) c.append(a(i))
    println(c)
  }

}
