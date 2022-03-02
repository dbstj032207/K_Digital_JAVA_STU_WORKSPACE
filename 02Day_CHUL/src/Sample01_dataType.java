import java.util.Date;
// 묵시적으로 import java.lang.* 코드가 삽입 됨
// 나머지는 명시적르로 코드작성 해야 함

public class Sample01_dataType {

	public static void main(String[] args) {

		long num = 100L;	// long형 저장시 값뒤에 L명시
//		byte num2 = 300; // 에러
		float num3 = 3.14F;		// 실수형 float사용시 F명시 주의
		System.out.println("\uD64D");	// iso8859형에서의 "홍"(문자열)
		System.out.println("홍");		// 위와 동일
		System.out.println(100);	// 정수
		System.out.println(3.14);	// 실수, 3.14D와 동일
		System.out.println(3.14F);	// 실수, f와 동일
		System.out.println(3.14D);	// 실수, d와 동일
		System.out.println('\uD64D');	// iso8859형에서의 '홍'(문자)
		System.out.println('홍');	 	// 위와 동일
		
		System.out.println(true);
		System.out.println(false);
//		System.out.println(null);	// null 값, 가리키지 않는 것
		System.out.println(new Date());
		// 날짜 api 객체 사용
		// import java.util.Date;
		Date d = new Date();
		// d는 참조변수
		System.out.println(d); 		// 위와 동일
	}

}
