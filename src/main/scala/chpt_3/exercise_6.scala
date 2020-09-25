package chpt_3

object exercise_6 {
  def main(args: Array[String]): Unit = {
    val a: Array[Int] = Array(1,2,3,4,5)

    println(a.sortWith(_>_).mkString(" "))
  }
}
