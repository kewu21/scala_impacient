package chpt_5

class Counter {
  private var value = 0
  def increment() {
    if (value == Int.MaxValue) {
      throw new Exception("value exceeds max int")
    } else {
      value += 1
    }
  }
  def current = value
}

object exercise_1 {

  def main(args: Array[String]): Unit = {

  }
}
