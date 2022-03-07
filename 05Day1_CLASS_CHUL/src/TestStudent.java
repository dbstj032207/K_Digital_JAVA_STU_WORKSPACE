
public class TestStudent {

	public static void main(String[] args) {
		
		Student stu = new Student();	// 1. 객체생성
		System.out.println(stu);
		// 2. 초기값 확인
		System.out.println(stu.name + "\t" + stu.age + "\t" + stu.address);
		
		// 3. 실제 학생 1명의 데이터 저장
		stu.name = "홍길동";
		stu.age = 20;
		stu.address = "서울";

		// 4. 확인
		System.out.println(stu.name + "\t" + stu.age + "\t" + stu.address);
		
		
		Student stu2 = new Student();
		
		// 2번학생의 데이터 저장
		stu2.name = "이순신";
		stu2.age = 44;
		stu2.address = "전라";
		
		System.out.println(stu2.name + "\t" + stu2.age + "\t" + stu2.address);
		
		
		
		Student stu3 = new Student();
		
		// 3번학생의 데이터 저장
		stu3.name = "유관순";
		stu3.age = 19;
		stu3.address = "경기";
		
		System.out.println(stu3.name + "\t" + stu3.age + "\t" + stu3.address);
	}

}
