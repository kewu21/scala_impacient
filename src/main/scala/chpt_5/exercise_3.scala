package chpt_5

object exercise_3 {
  class Time(hrs: Int, mins: Int) {
    def before(other: Time): Boolean = {
      if (other.hrs < hrs) {
        true
      } else if (other.hrs == hrs) {
        other.mins < mins
      } else {
        false
      }
    }
  }
}
