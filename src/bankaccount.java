/**
 * A bank account has a balance that can be changed by deposits and withdrawals.
 * @author supre
 *
 */
public class bankaccount {
	/**
	 * constructs a bank 
	 */
	public bankaccount(double initialBalance) {
		balance = initialBalance;
	}

	public double getBalance()
	{
		return balance;	
	}
	public void deposit(double amount) {
		double newBalance = balance + amount;
		balance = newBalance;
	}
	public void withdraw(double amount) {
		double newBalance = balance - amount;
		balance = newBalance;
	}
	private double balance;
}
