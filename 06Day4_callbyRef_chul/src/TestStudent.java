
public class TestStudent {

	private static void changeAge(Student n) {
		
		System.out.println("changeAge 에서 stu===" + n);
		n.setAge(100);
		
	}
	public static void main(String[] args) {

		Student stu = new Student("홍길동", 20, "서울");
		System.out.println("변경전 나이:" + stu.getAge());
		
		changeAge(stu);		//call by reference
		System.out.println("변경후 나이:" + stu.getAge());
		
					
	}

	
	
	
}
