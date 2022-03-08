
public class TestStudent {


	public static void main(String[] args) {

		Student stu1 = new Student("홍길동", 20, "서울");
		StudentUtil util = new StudentUtil();	// 도움클래스 객체 생성
		

		System.out.println("성은\t==========\t" + util.firstName(stu1));
		
		System.out.println("길이는\t==========\t" + util.nameLength(stu1));
		
		System.out.println("길이는\t==========\t" + util.nameLength2(stu1));
		
		
		Student stu2 = new Student("박혁거세", 40, "경기");
		


					
	}

	
	
	
}
