package chpt_5

object exercise_7 {
  def main(args: Array[String]): Unit = {
    var p = new Person("James May")
    println(p.firstName + "," + p.lastName)
  }
  class Person(fullName: String) {
    val firstName: String = fullName.split(' ')(0)
    val lastName: String = fullName.split(' ')(1)
  }

}
