package chpt_3

import scala.collection.mutable.ArrayBuffer

object exercise_8 {
  def main(args: Array[String]): Unit = {
    val a: ArrayBuffer[Int] = ArrayBuffer(1,2,3,0,-1,12,-9,4,0,-7,6,12)
    val negs = for(i <- a.indices if a(i) < 0) yield i
    for (i <- negs.tail.reverse)  a.remove(i)
    println(a.mkString(" "))
  }

}
