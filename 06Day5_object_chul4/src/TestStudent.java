
public class TestStudent {


	public static void main(String[] args) {

		Student stu = new Student("홍길동", 20, "서울");
		StudentUtil util = new StudentUtil(stu);
		
		util.firstName();
		// 성은	==========	홍
		util.nameLength();
		// 길이는	==========	3

		System.out.println(util);	// toString 호출
		// StudentUtil [stu=Student [name=홍길동, age=20, address=서울]]
		
		
		StudentUtil util2 = new StudentUtil(new Student("이순신", 20, "서울"));
		util2.firstName();
		util2.nameLength();

		System.out.println(util2);
		
	}
	
}
