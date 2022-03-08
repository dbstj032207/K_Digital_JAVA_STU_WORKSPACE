import com.yyy.Student;

public class TestStudent {

	public static void main(String[] args) {
		
		// 1. 패키지 직접 명시
		com.xxx.Student s = new com.xxx.Student();
		System.out.println(s.name);
		s.a();
		
		// 2. import -> com.yyy의 Student 사용
		Student ss = new Student();
		System.out.println(ss.name);

	}

}
