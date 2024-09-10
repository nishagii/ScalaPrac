class Account(private var balance: Double) {

  def deposit(amount: Double): Unit = {
    if (amount > 0) {
      balance += amount
      println(s"Deposited $$${amount}. New balance: $$${balance}")
    } else {
      println("Deposit amount must be positive.")
    }
  }

  def withdraw(amount: Double): Unit = {
    if (amount > 0) {
      if (amount <= balance) {
        balance -= amount
        println(s"Withdrew $$${amount}. New balance: $$${balance}")
      } else {
        println("Insufficient funds.")
      }
    } else {
      println("Withdrawal amount must be positive.")
    }
  }

  def transfer(amount: Double, toAccount: Account): Unit = {
    if (amount > 0) {
      if (amount <= balance) {
        withdraw(amount) 
        toAccount.deposit(amount) 
        println(s"Transferred $$${amount} to account. New balance: $$${balance}")
      } else {
        println("Insufficient funds for transfer.")
      }
    } else {
      println("Transfer amount must be positive.")
    }
  }

  def getBalance: Double = balance

  override def toString: String = s"Account balance: $$${balance}"
}


object Main extends App {
  val account1 = new Account(1000.0)
  val account2 = new Account(500.0)

  println(account1) 
  println(account2) 
  account1.deposit(200.0)
  account1.withdraw(150.0)
  account1.transfer(100.0, account2)

  println(account1) 
  println(account2) 
}
