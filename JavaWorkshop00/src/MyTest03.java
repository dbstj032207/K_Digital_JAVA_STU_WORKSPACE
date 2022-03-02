
public class MyTest03 {
	public static void main(String[] args) {
		
		int n = 10;
		int n2 = 20;
		
		// 값 변경 코드 구현	
		int temp = n;	// n값을 임시저장할 변수 선언
		n = n2;
		n2 = temp;
		
		System.out.println("n 값은 " +  n);
		System.out.println("n2값은 " +  n2);
				
	}

}


