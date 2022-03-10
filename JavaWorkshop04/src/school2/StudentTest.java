package school2;

public class StudentTest {

	public static void main(String[] args) {
		
		Student stu1 = new Student("홍길동", 15, 170, 80);
		Student stu2 = new Student("한사람", 13, 180, 70);
		Student stu3 = new Student("임걱정", 16, 175, 65);
		
		Student []stu_arr = new Student[3];
		stu_arr[0] = stu1;
		stu_arr[1] = stu2;
		stu_arr[2] = stu3;
		
		double totalAge = 0.0;
		double totalHeight = 0.0;
		double totalWeight = 0.0;
		System.out.println("이름\t나이\t신장\t몸무게");
		
		int min_age_index = 0;
		int min_height_index = 0;
		int min_weight_index = 0;
		
		int max_age_index = 0;
		int max_height_index = 0;
		int max_weight_index = 0;
		
		int cnt = 0;
		for (Student s : stu_arr) {
			System.out.println(s.studentInfo());
			totalAge += s.getAge();
			totalHeight += s.getHeight();
			totalWeight += s.getWeight();
			
			if(s.getAge() < stu_arr[min_age_index].getAge()) {
				min_age_index = cnt;
			}
			if(s.getAge() > stu_arr[max_age_index].getAge()) {
				max_age_index = cnt;
			}
			
			if(s.getHeight() < stu_arr[min_height_index].getHeight()) {
				min_height_index = cnt;
			}
			if(s.getHeight() > stu_arr[max_height_index].getHeight()) {
				max_height_index = cnt;
			}
			
			if(s.getWeight() < stu_arr[min_weight_index].getWeight()) {
				min_weight_index = cnt;
			}
			if(s.getWeight() > stu_arr[max_weight_index].getWeight()) {
				max_weight_index = cnt;
			}
			cnt++;
		}
		
		
		System.out.println();
		double avgAge = totalAge / stu_arr.length;
		double avgHeight = totalHeight / stu_arr.length;
		double avgWeight = totalWeight / stu_arr.length;
		
		System.out.println("나이의 평균: " + (double)Math.round(avgAge*100)/100);
		System.out.println("신장의 평균: " + (double)Math.round(avgHeight*100)/100);
		System.out.println("몸무게의 평균: " + (double)Math.round(avgWeight*100)/100);
		
		
		System.out.println("나이가 가장 많은 학생: " + stu_arr[max_age_index].getName());
		System.out.println("나이가 가장 적은 학생: " + stu_arr[min_age_index].getName());
		
		System.out.println("신장이 가장 큰 학생: " + stu_arr[max_height_index].getName());
		System.out.println("신장이 가장 작은 학생: " + stu_arr[min_height_index].getName());
		
		System.out.println("몸무게가 가장 많이 나가는 학생: " + stu_arr[max_weight_index].getName());
		System.out.println("몸무게가 가장 적게 나가는 학생: " + stu_arr[min_weight_index].getName());
		
	}

}
