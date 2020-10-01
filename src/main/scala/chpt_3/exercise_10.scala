package chpt_3

object exercise_10 {
  def main(args: Array[String]): Unit = {
    val prefix: String = "America/"
    val ids: Array[String] = java.util.TimeZone.getAvailableIDs()
    println(ids.filter(s => s.startsWith(prefix))
      .map(s => s.substring(prefix.length)).mkString("\n"))
  }

}
