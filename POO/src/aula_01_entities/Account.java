package aula_02_entities;

public class Account {

	private int account;
	private String holder;
	private double balance;
	
	public Account(int account, String holder, double balance) {
		this.account = account;
		this.holder = holder;
		this.balance = balance;
	}
	
	public Account() {
		
	}

	public double getAccount() {
		return account;
	}

	public void setAccount(int account) {
		this.account = account;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withDraw(double amount) {
		balance -= amount + 5.00;
	}
	
	public String toString() {
		return "Account: " 
			+ account 
			+ ", Holder: " 
			+ holder 
			+ ", Balance: $ " 
			+ String.format("%.2f", balance);
	}
	
}
