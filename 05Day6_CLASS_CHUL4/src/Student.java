
public class Student {
	
	
	
	String name;
	int age;
	String address;
	String phone = "010";
	
	public Student() {}
	
	public Student(String name, int age, String address) {
		super();
		System.out.println("3개 짜리 생성자 호출 =========================");
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public Student(String name, int age, String address, String phone) {
		super();
		System.out.println("4개 짜리 생성자 호출 =========================");
		this.name = name;
		if(age > 0) {	// 나이는 음수값을 가질 수 없기때문에 조건 생성
			this.age = age;
		}
		this.address = address;
		this.phone = phone;
	}
	
	
	
}

	
	
	
	
	

