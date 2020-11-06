package chpt_5

object exercise_2 {
  def main(args: Array[String]): Unit = {

  }

  class BankAccount() {
    private var _balance = 0;

    def balance = _balance

    def deposit(amount: Int): Int = {
      _balance += amount
      _balance
    }

    def withdraw(amount: Int): Int = {
      if (_balance >= amount) {
        _balance -= amount
        _balance
      } else {
        throw new Exception("no sufficient balance.")
      }
    }
  }
}
