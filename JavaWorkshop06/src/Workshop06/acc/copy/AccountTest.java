package Workshop06.acc.copy;


public class AccountTest {

	public static void main(String[] args) throws AccountException {
		Account account = new Account("441-0290-1203", 500000, 7.3);
		System.out.println("계좌정보: " + account.getAccount() + " " + account.getBalance() + " " + account.getInterestRate());
		

		account.deposit(-10);

		

		account.withdraw(600000);

		
		System.out.println("이자: " + account.calculateinterestRate());
		
	}

}
