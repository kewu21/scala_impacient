package chpt_5

import scala.beans.BeanProperty


object exercise_5 {
  def main(args: Array[String]): Unit = {
    var s = new Student("name", 1);
    s.name = "new name";
  }
  class Student(@BeanProperty var name: String, @BeanProperty val id: Long) {
  }
}
