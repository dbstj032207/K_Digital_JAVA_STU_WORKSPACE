
public class IFTest2 {

	public static void main(String[] args) {

		// 2. 단일 if-else문
		System.out.println("문장1");
		int num = 0;

		if (3 == 3) { // 조건이 true인 경우 블럭안의 코드 실행
			num = 3;
			System.out.println("참");
			System.out.println(num);
		} else {
			System.out.println("거짓");
		}

		System.out.println(num);
		System.out.println("문장3");
		
		System.out.println("=============== 구분선 ===============");
		
		// 2. if-else문
		int num2 = 100;
		int result = num2 % 2;
		String mesg = "";
		if (result == 0)  {
			mesg = "짝수";	
		} else {
			mesg = "홀수";
		}
		
		System.out.println(mesg);
		
		System.out.println("=============== 구분선 ===============");
		
		// 3. 단일 if문(대소문자 판단)
		char c = 'A';
		String mesg2 = "";
		if ((c >= 'a') && (c <= 'z')) {
			mesg2 = "소문자";
		} else {
			mesg2 = "대문자";
		}			
		System.out.println(mesg2);
		
		System.out.println("============= main 종료 ===============");
		
		
	}

}
