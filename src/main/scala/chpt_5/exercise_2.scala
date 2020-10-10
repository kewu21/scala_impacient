package chpt_5

object exercise_2 {
  def main(args: Array[String]): Unit = {

  }

  class BankAccount() {
    private var _balance = 0;

    def balance = _balance

    def deposit(amount: Int): Int = {
      balance += amount
      balance
    }

    def withdraw(amount: Int): Int = {
      if (balance >= amount) {
        balance -= amount
        balance
      } else {
        throw new Exception("no sufficient balance.")
      }
    }
  }
}
