
public class StudentUtil {
	
	// 하나의 클래스에 다른 클래스가 멤버변수로 포함 (has a 관계) 
	// 메인에서 생성한 stu를 가지게 됨
	Student stu;	

	// 생성자
	public StudentUtil(Student stu) {
		super();
		this.stu = stu;
	}
	

	public StudentUtil() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// set, get
	public Student getStu() {
		this.stu.setAddress("제주");
		return this.stu;
	}


	public void setStu(Student stu) {
		this.stu = stu;
	}


	public void firstName() {
		String name = this.stu.getName();
		char first = name.charAt(0);
		System.out.println("성은\t==========\t" + first);
	}
	

	public void nameLength() {
		String name = this.stu.getName();
		int length = name.length();
		System.out.println("길이는\t==========\t" + length);
	}

	


	@Override
	public String toString() {
		return "StudentUtil [stu=" + stu + "]";
	}
	
	
}
