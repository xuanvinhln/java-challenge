package challenge.concurrent.wait_notify;

public class Account {
	private int balance;
	
	public Account() {
		this.balance = 0;
	}

	public void deposit(int amountOfMoney) {
		this.balance = this.balance + amountOfMoney;
		
		this.checkBalance();
	}
	
	public void withdraw(int amountOfMoney) {
		if (this.balance >= amountOfMoney) {
			this.balance = this.balance - amountOfMoney;
		} else {
			System.out.println("Error: balance < amountOfMoney");
		}
		
		this.checkBalance();
	}
	
	public void checkBalance() {
		System.out.println("Balance: " + this.balance);
	}
	
	public static void main(String[] args) {
		Account an = new Account();
		an.checkBalance();
		an.deposit(10);
		an.withdraw(4);
	}
}
