
public class TestStudent {


	public static void main(String[] args) {

		Student stu1 = new Student("홍길동", 20, "서울");
		StudentUtil util = new StudentUtil();
		
		util.setStu(stu1);
		util.firstName();
		// 성은	==========	홍
		util.nameLength();
		// 길이는	==========	3
		
		Student stu2 = new Student("이순신", 20, "서울");
		util.setStu(stu2);
		util.firstName();
		// 성은	==========	이
		util.nameLength();
		// 길이는	==========	3
		
		Student stu3 = util.getStu();
		System.out.println(stu3);
		System.out.println(stu2);

		
	}
	
}
