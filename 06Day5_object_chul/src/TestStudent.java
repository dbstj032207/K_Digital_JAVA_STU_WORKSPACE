
public class TestStudent {


	public static void main(String[] args) {

		Student stu = new Student("홍길동", 20, "서울");
		StudentUtil util = new StudentUtil();	// 도움클래스 객체 생성
		
		char c = util.firstName(stu.getName());
		System.out.println("성은 " + c);
		
		int length = util.nameLength(stu.getName());
		System.out.println("이름의 길이는 " + length);
		
		String name = stu.getName();
		System.out.println(util.firstName(name) + "\t" +
				util.nameLength(name));
		
		
		Student stu2 = new Student("박혁거세", 40, "경기");
		
		String name2 = stu2.getName();
		System.out.println(util.firstName(name2) + "\t" +
				util.nameLength(name2));
		

					
	}

	
	
	
}
