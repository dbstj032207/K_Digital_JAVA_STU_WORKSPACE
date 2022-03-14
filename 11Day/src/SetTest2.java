import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest2 {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("1");
		set.add("2");
		set.add("3");
		set.add("4");
		set.add("5");
//		set.add(10); 	// 잘못된 데이터 저장 감지를 컴파일때 인식 가능
		
		// 1. toString()
		System.out.println(set);
		
		// 2. foreach()
		for (String x : set) {	// Generic 사용 시 형변환 필요없음
			System.out.println(x);
		}
		
		// 3. 일관된 방법인 Iterator 이용
		Iterator<String> ite = set.iterator();
		while(ite.hasNext()) {
			String m = ite.next();
			System.out.println(">>" + m);
		}
		

	}

}
