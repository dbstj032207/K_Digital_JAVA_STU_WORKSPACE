
public class Sample02_variable5_3 { // class 시작

	String name;
	char gneder;
	int age;
	boolean married;
	double height;

	public static void main(String[] args) { // main 시작
		
		// 1.클래스 객체 생성 후 test 변수 참조
		// 한줄 출력으로 println 이용 이름, 나이, 성별, 결혼여브 ,키를 한줄로 출력
		Sample02_variable5_3 test = new Sample02_variable5_3();
		System.out.println("이름: " + test.name + 
							", 나이: " + test.age +
							", 성별 : " + test.gneder +
							", 결혼여부: " + test.married +
							", 키: " + test.height);
		test.name = "홍길동";
		System.out.println("========================================");
		System.out.println("이름: " + test.name + 
				", 나이: " + test.age +
				", 성별 : " + test.gneder +
				", 결혼여부: " + test.married +
				", 키: " + test.height);
				

	} // main 끝

} // class 끝
