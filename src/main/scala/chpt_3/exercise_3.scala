package chpt_3

object exercise_3 {
  def main(args: Array[String]): Unit = {
    val a = Array(1,2,3,4,5)
    val b = for (i <- a.indices) yield {
      if (i%2 == 1) a(i-1)
      else if(i+1 == a.length) a(i)
      else a(i+1)
    }
    println(b)
  }
}
