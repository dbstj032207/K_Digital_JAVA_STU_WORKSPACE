
public class Student {
	// 멤버변수
	private String name;
	private int age;
	private String address;
	
	// 생성자
	public Student() {}
	
	public Student(String name, int age, String address) {
//		System.out.println("3개 짜리 생성자 호출 ================");
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public Student(String name, int age) {
		// this() : 같은클래스의 생성자 호출 사용
		this(name, age, "미상");	// 매개변수 3개짜리 생성자를 재 호출 
//		System.out.println("2개 짜리 생성자 호출 ================");
	}
	

	public Student(String name, String address) {
		this(name, 20, address);
	}

	// get, set함수
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	// toString
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
	
	
	
	

}

	
	
	
	
	

