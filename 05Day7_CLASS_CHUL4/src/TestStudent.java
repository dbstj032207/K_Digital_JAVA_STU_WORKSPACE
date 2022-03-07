
public class TestStudent {

	public static void main(String[] args) {
		
		Student stu = new Student("aa", 10, "서울");
		stu.setName("홍길동");
		stu.setAddress("제주");
		
		Student stu2 = new Student("이순신", 20, "경기");
		
		stu.print();
		stu2.print();
		
					
	}
	
	
}
