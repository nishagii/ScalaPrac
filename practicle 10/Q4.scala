class Account(private var balance: Double) {

  def deposit(amount: Double): Unit = {
    if (amount > 0) {
      balance += amount
    } else {
      println("Deposit amount must be positive.")
    }
  }

  def withdraw(amount: Double): Unit = {
    if (amount > 0) {
      if (amount <= balance) {
        balance -= amount
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
      } else {
        println("Insufficient funds for transfer.")
      }
    } else {
      println("Transfer amount must be positive.")
    }
  }

  def getBalance: Double = balance

  override def toString: String = f"Account balance: $$${balance}%.2f"
}

object Bank {

  // Function 4.1: List of Accounts with negative balances
  def negativeBalances(accounts: List[Account]): List[Account] = {
    accounts.filter(_.getBalance < 0)
  }

  // Function 4.2: Calculate the sum of all account balances
  def totalBalance(accounts: List[Account]): Double = {
    accounts.map(_.getBalance).sum
  }

  // Function 4.3: Calculate the final balances of all accounts after applying interest
  def applyInterest(accounts: List[Account]): Unit = {
    accounts.foreach { account =>
      val balance = account.getBalance
      val interestRate = if (balance > 0) 0.05 else 0.1
      val newBalance = balance * (1 + interestRate)
      account.deposit(newBalance - balance) // Update balance with interest
    }
  }

  // Example usage
  def main(args: Array[String]): Unit = {
    val account1 = new Account(1000.0)
    val account2 = new Account(-200.0)
    val account3 = new Account(300.0)
    val account4 = new Account(-50.0)

    val bankAccounts = List(account1, account2, account3, account4)

    println("Accounts with negative balances:")
    negativeBalances(bankAccounts).foreach(println)

    println(f"Total balance of all accounts: $$${totalBalance(bankAccounts)}%.2f")

    applyInterest(bankAccounts)

    println("Final balances after applying interest:")
    bankAccounts.foreach(println)
  }
}
