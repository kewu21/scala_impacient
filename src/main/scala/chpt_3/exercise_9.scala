package chpt_3

import scala.collection.mutable.ArrayBuffer

object exercise_9 {
  def main(args: Array[String]): Unit = {
    val a: ArrayBuffer[Int] = ArrayBuffer(1,2,3,0,-1,12,-9,4,0,-7,6,12)
    val negs = for(i <- a.indices if a(i) < 0) yield i
    val positionToMove = a.indices.diff(negs.drop(1))
    for (i <- positionToMove.indices) a(i) = a(positionToMove(i))
    a.trimEnd(negs.length-1)
    println(a.mkString(" "))
  }
}
