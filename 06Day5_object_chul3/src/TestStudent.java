
public class TestStudent {


	public static void main(String[] args) {

		Student stu1 = new Student("홍길동", 20, "서울");
		StudentUtil util = new StudentUtil();	// 도움클래스 객체 생성
		
		util.firstName(stu1);
		util.nameLength(stu1);
		
		
		Student stu2 = new Student("이순신", 40, "서울");
		
		util.firstName(stu2);
		util.nameLength(stu2);
		


					
	}

	
	
	
}
