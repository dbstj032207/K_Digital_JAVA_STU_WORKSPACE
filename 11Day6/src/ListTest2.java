import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class ListTest2 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("홍길동");
		list.add("이순신");
		list.add("유관순");
		list.add("강감찬");
		list.add("세종");
//		list.add(100)	// 컴파일 에러

		
		System.out.println(list.size()); // 5
		
		System.out.println(list.get(0));	// 홍길동
		System.out.println(list.get(1));	// 이순신
		System.out.println(list.get(2));	// 유관순
		
		System.out.println("=================================");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("=================================");
		
		for (String string : list) {
			System.out.println(string);
		}
		
		System.out.println("=================================");
		
		Iterator<String> ite = list.iterator();
		while(ite.hasNext()) {
			String m = ite.next();
			System.out.println(">>" + m);
		}
		
		
		
	}

}
