package school;

public class StudentTest {

	public static void main(String[] args) {
		
		Student stu1 = new Student("홍길동", 15, 171, 81);
		Student stu2 = new Student("한사람", 13, 183, 72);
		Student stu3 = new Student("임걱정", 16, 175, 65);
		
		Student []stu_arr = new Student[3];
		stu_arr[0] = stu1;
		stu_arr[1] = stu2;
		stu_arr[2] = stu3;
		
		double totalAge = 0.0;
		double totalHeight = 0.0;
		double totalWeight = 0.0;
		System.out.println("이름\t나이\t신장\t몸무게");
		for (Student s : stu_arr) {
			totalAge += s.getAge();
			totalHeight += s.getHeight();
			totalWeight += s.getWeight();
			System.out.println(s.getName() + "\t" + s.getAge() + "\t" + s.getHeight() + "\t" + s.getWeight());
			
		}
		
		System.out.println();
		double avgAge = totalAge / stu_arr.length;
		double avgHeight = totalHeight / stu_arr.length;
		double avgWeight = totalWeight / stu_arr.length;
		
		System.out.println("나이의 평균: " + (double)Math.round(avgAge*100)/100);
		System.out.println("신장의 평균: " + (double)Math.round(avgHeight*100)/100);
		System.out.println("몸무게의 평균: " + (double)Math.round(avgWeight*100)/100);
		
		
		
		
	}

}
