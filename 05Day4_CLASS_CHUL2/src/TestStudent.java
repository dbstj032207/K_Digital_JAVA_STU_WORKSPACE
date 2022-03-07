
public class TestStudent {

	public static void main(String[] args) {
		
		Student stu1 = new Student();	
		
		System.out.println(stu1.name + "\t" + stu1.age + "\t" + stu1.address);
		// AAA 100 BBB
		
		Student stu2 = new Student();	
		
		System.out.println(stu2.name + "\t" + stu2.age + "\t" + stu2.address);
		// AAA 100 BBB
		
		System.out.println(stu1 == stu2); // false
		// 안의 값은 같지만 두 객체의 주소가 다르기 때문
		
		stu2.name = "이순신";
		stu2.age = 30;
		stu2.address = "경기";
			
		System.out.println(stu2.name + "\t" + stu2.age + "\t" + stu2.address);
		// 이순신 30 경기
		System.out.println(stu1.name + "\t" + stu1.age + "\t" + stu1.address);
		// AAA 100 BBB
	}

}
