
public class IFTest {

	public static void main(String[] args) {

		// 1. 단일 if문
		System.out.println("문장1");
		int num = 0;

		if (3 != 3) { // 조건이 true인 경우 블럭안의 코드 실행
			num = 10;
			System.out.println("문장2");
		} // 조건이 false인 경우 블럭 밖에서 부터 실행

		System.out.println(num);
		System.out.println("문장3");
		
		System.out.println("=============== 구분선 ===============");
		
		// 2. 단일 if문
		int num2 = 100;
		int result = num2 % 2;
		String mesg = "홀수";
		if (result == 0)  mesg = "짝수";		// 한줄이 명령인 경우 { } 생략 가능
		
		System.out.println(mesg);
		
		System.out.println("=============== 구분선 ===============");
		
		// 3. 단일 if문(대소문자 판단)
		char c = 'a';
		String mesg2 = "대문자";
		if ((c >= 'a') && (c <= 'z')) mesg2 = "소문자";
		System.out.println(mesg2);
		System.out.println("============= main 종료 ===============");
		
		
	}

}
