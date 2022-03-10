package student;
public class Test01 {

	public static void main(String[] args) {
		Student stu1 = new Student("Kim", 100, 90, 95, 89);
		Student stu2 = new Student("Lee", 60, 70, 99, 98);
		Student stu3 = new Student("Park", 68, 86, 60, 40);
		
		Student []stu_arr = new Student[3];

		stu_arr[0] = stu1;
		stu_arr[1] = stu2;
		stu_arr[2] = stu3;
		
		for (Student s : stu_arr) {
			System.out.println(s.getName() + "\t" + s.getAvg()
										+ "\t" + s.getGrade());
		}
		
		

	}

}
