
public class EnumTest4 {
	
	// public enum 타입 {상수값, 상수값, 상수값3}
	public enum DML {SELECT, INSERT, DELETE}

	public static void check(DML num) {
		
		switch(num) {
		case SELECT: System.out.println("SELECT");break;
		case INSERT: System.out.println("INSERT");break;
		case DELETE: System.out.println("DELETE");break;
		default: System.out.println("default");break;
		}
		
	}

	
	public static void main(String[] args) {
		

		check(DML.SELECT);  //1.SELECT 2:INsERT 3;DELETE
		check(DML.INSERT);
		check(DML.DELETE);
//		check(99); // 의미없는 숫자 지정 불가능
		
	}

}
