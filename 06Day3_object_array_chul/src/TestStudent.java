
public class TestStudent {

	public static void main(String[] args) {

		Student stu = new Student("홍길동1","서울1");
		Student stu2 = new Student("홍길동2","서울2");
		Student stu3 = new Student("홍길동3","서울3");
		Student stu4 = new Student("홍길동4","서울4");
		Student stu5 = new Student("홍길동5",19,"서울5");
		
		Student[] yy = new Student[5];
		
		yy[0] = stu;
		yy[1] = stu2;
		yy[2] = stu3;
		yy[3] = stu4;
		yy[4] = stu5;
		
		System.out.println(yy[0]);
		
		System.out.println("================================");
		for (int i = 0; i < yy.length; i++) {
			System.out.println(yy[i]);
		}
		yy[0].setName("aaaaaa");
		System.out.println("================================");
		for (Student s : yy) {
			System.out.println(s);
		}
		
		Student[] yy2 = {stu, stu2, stu3, stu4, stu5};
		
		System.out.println("================================");
		for (Student s : yy2) {
			System.out.println(s);
		}
		
					
	}
	
	
}
