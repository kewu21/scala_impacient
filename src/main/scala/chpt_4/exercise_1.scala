package chpt_4

object exercise_1 {
  def main(args: Array[String]): Unit = {
    val prices_1: Map[String, Double] = Map("pc" -> 10.0, "ipad" -> 20, "watch" -> 30.5)
    val prices_2 = prices_1.map((k: (String, Double)) => (k._1, k._2 * 0.9))
    println(prices_2.mkString(" "))
  }
}
