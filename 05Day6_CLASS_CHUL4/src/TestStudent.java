
public class TestStudent {

	public static void main(String[] args) {
			
		Student stu1 = new Student("홍길동", 20, "서울", "010");	
		
		Student stu2 = new Student();
		
		stu2.name = "이순신";
		stu2.age = 40;
		stu2.address = "경기";
		stu2.phone = "011";
		
		System.out.println(stu1.name + "\t" + stu1.age + "\t" + 
							stu1.address + "\t" + stu1.phone);
		// 홍길동	20	서울	010
		System.out.println(stu2.name + "\t" + stu2.age + "\t" + 
							stu2.address + "\t" + stu2.phone);
		// 이순신	40	경기	011
		
		Student stu3 = new Student("aaa", 10, "bbb");
		System.out.println(stu3.name + "\t" + stu3.age + "\t" + 
							stu3.address + "\t" + stu3.phone);
		// aaa	10	bbb	010
		
		
	}

}
