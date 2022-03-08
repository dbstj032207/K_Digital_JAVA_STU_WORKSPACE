
public class Student {
	
	private String name = "test";
	private int age ;
	private String address;
	
	// 생성자
	public Student(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// get, set 함수
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
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
	public void print() {
		System.out.println(toString());
	}
	
	
	
	

}
