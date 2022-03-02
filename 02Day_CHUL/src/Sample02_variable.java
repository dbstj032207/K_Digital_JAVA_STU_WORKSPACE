
public class Sample02_variable {

	public static void main(String[] args) {
		
		// 1) 변수 선언
		String name; 	// 이름은 문자열
		int age;		// 나이는 정수형
		String address;	// 주소는 길이가 긴 문자열
		char gender;	// 성별은 '남' or '여'의 문자
		boolean isMarried;	// 결혼 여부는 불리언 값
		float height;		// 키는 Float 실수형
		double weight;		// 몸무게는 double 실수형
		
//		System.out.println(name);	// err: name이 초기화가 되지 않아 사용 불가

		// 2) 변수 초기화
		name = "홍길동";
		age = 20;
		address = "서울";
		gender = '남';		//주의
		isMarried = false;
		height = 185.63F;	//주의
//		height = 3.14;	//F를 명시하지 않으면 오류
		weight = 78.25;
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(address);
		System.out.println(gender);
		System.out.println(isMarried);
		System.out.println(height);
		System.out.println(weight);
	}

}
