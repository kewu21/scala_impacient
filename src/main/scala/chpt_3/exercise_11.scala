package chpt_3

import java.awt.datatransfer._

import scala.jdk.CollectionConverters._
import scala.collection.mutable

object exercise_11 {
  def main(args: Array[String]): Unit = {
    val flavors = SystemFlavorMap.getDefaultFlavorMap.asInstanceOf[SystemFlavorMap]
    val flavorNatives: mutable.Buffer[String] = flavors.getNativesForFlavor(DataFlavor.imageFlavor).asScala
    println(flavorNatives.mkString("\n"))
  }

}
