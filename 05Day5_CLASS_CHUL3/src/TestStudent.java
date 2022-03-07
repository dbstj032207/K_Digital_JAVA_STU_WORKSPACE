
public class TestStudent {

	public static void main(String[] args) {
		
		Student stu1 = new Student();	// 기본 생성자 호출
		
		System.out.println(stu1.name + "\t" + stu1.age + "\t" + stu1.address);
		// null 0 null
		
		Student stu2 = new Student("홍길동");	// 매개변수 1개짜리 생성자 호출
		
		System.out.println(stu2.name + "\t" + stu2.age + "\t" + stu2.address);
		// 홍길동 0 null
		
	}

}
