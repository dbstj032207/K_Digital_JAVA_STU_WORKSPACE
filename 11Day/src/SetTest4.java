import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest4 {
	
	private static void change(int m) {
		m = 10;
	}
	
	private static void change(int[] m2) {
		m2[0] = 100;
		
	}
	
	private static void chage3(HashSet<String> set) {
		set.remove("홍길동");
		
	}


	public static void main(String[] args) {
		
		int m = 9;
		System.out.println("변경전:" + m);
		change(m);	// m 값을 9에서 10으로 변경
		System.out.println("변경후:" + m);
		
		
		int [] m2 = {9, 8, 7};
		System.out.println("변경전:" + m2[0]);
		change(m2[0]); 	// m2[0] 값을 9에서 10으로 변경
		change(m2);		// m2[0]를 찾아가서 9 => 100
		System.out.println("변경후:" + m2[0]);
		
		HashSet<String> set = new HashSet<String>();
		set.add("홍길동");
		set.add("이순신");
		set.add("유관순");
		System.out.println("변경전:" + set);
		chage3(set);
		System.out.println("변경후:" + set);

	}

	
	

	

}
