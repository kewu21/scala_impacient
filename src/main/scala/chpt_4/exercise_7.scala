package chpt_4

import scala.jdk.CollectionConverters._

object exercise_7 {
  def main(args: Array[String]): Unit = {
    val format = "%s | %s"
    val maxLength = java.lang.System.getProperties.asScala.keys.map(_.length).reduce(scala.math.max)
    for ((k, v) <- java.lang.System.getProperties.asScala) {
      println(k.padTo(maxLength, " ").mkString("") + raw"|%s".format(v))
    }
  }

}
