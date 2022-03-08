import com.bank.Bank;

public class Test {

	public static void main(String[] args) {
		Bank b = Bank.getBank();
		System.out.println(b);	
		Bank b2 = Bank.getBank();
		System.out.println(b2);
		// 두개의 주소는 같음 
		
		b.setName("kb");
		System.out.println(b.getName());	// kb
		System.out.println(b2.getName());	// kb
	}

}
