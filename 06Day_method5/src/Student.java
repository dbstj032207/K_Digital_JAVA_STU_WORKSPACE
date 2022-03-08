
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
	
	// 클래스 내의 함수안에서 다른 함수를 호출하는 경우
	public String getData() {
//		return this.name + "\t" + this.age + "\t" + this.address;
		return getName() + "\t" + getAge() + "\t" + getAddress();
	}
	
	
	
	

}
