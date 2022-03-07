
public class TestStudent {

	public static void main(String[] args) {
		
		Student stu1 = new Student();	// 1. 객체생성
		// 모델클래스의 멤버변수가 생성되면서 자동으로 타입의 초기값으로 설정됨, 기본생성자 호출 사용
		
		// 2. 초기값 확인
		System.out.println(stu1.name + "\t" + stu1.age + "\t" + stu1.address);
		// test		20		경기
		
		
		// 3. 실제 학생 1명의 데이터 저장
		stu1.name = "홍길동";
		stu1.age = 20;
		stu1.address = "서울";

		// 4. 확인
		System.out.println("===================================");
		System.out.println(stu1.name + "\t" + stu1.age + "\t" + stu1.address);
		
	}

}
