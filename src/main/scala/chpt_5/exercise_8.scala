package chpt_5

object exercise_8 {
  def main(args: Array[String]): Unit = {
    var c1 = new Car("GTI", "VW")
    var c2 = new Car("GTI", "VW", 2019)
    var c3 = new Car("GTI", "VW", license = "CoolPlate")
    var c4 = new Car("GTI", "VW", 2019, "CoolPlate")
  }
  class Car(val model: String, val manufacturer: String, val year: Int = -1, var license: String = "") {
  }

}
