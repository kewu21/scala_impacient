package chpt_4

object exercise_8 {
  def main(args: Array[String]): Unit = {
    println(minmax(Array(1,4,6,-1,9,21)))
  }

  def minmax(input: Array[Int]): (Int, Int)  = {
    var max = scala.Int.MinValue
    var min = scala.Int.MaxValue
    for (i <- input) {
      if (i > max) max = i
      if (i < min) min = i
    }
    (min, max)
  }
}
