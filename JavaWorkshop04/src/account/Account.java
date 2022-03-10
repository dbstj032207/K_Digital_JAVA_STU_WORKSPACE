package account;

public class Account {
	private String account;
	private int balance;
	private double interestRate;
	
	public Account() {}

	public Account(String account, int balance, double interestRate) { 
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	
	
	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	

	public double calculateinterestRate() {
		return balance * interestRate / 100;
	}
	
	public void deposit(int d) {
		balance = balance + d;
	}
	
	public void withdraw(int w) {
		if(balance >= w) {
			balance = balance - w;
		}else {
			System.out.println("출금 할 수 없습니다.");
		}
	}
	
	
	
}
