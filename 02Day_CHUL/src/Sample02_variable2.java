
public class Sample02_variable2 {

	public static void main(String[] args) {
		String name = "홍길동"; 	// 이름은 문자열
		int age = 20;		// 나이는 정수형
		String address = "서울";	// 주소는 길이가 긴 문자열
		char gender = '남';	// 성별은 '남' or '여'의 문자
		boolean isMarried = false;	// 결혼 여부는 불리언 값
		float height = 185.63F;		// 키는 Float 실수형
		double weight = 78.25;		// 몸무게는 double 실수형
		
		System.out.printf("이름은 %s, 나이는 %d, 주소는 %s입니다.", name, age, address);
		System.out.println();
		System.out.println("이름은 " + name + ", 나이는 " + age + ", 주소는 " + address + "입니다.");
		
		System.out.println(name + " " + age + " " + address + " 성별(" + gender + ") " + 
							"결혼여부 (" + isMarried + ") 키(" + height + ") 체중(" + weight + ")" );
		
	}

}
