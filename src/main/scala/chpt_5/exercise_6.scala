package chpt_5

object exercise_6 {
  def main(args: Array[String]): Unit = {
    var p = new Person("name", -1);
    println(p.age)
  }
  class Person(name: String, var age: Int){
    if (age < 0) age = 0;
  }
}
