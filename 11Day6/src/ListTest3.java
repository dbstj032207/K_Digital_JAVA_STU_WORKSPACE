import java.util.ArrayList;
import java.util.List;

public class ListTest3 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("홍길동");
		list.add("이순신");
		list.add("유관순");
		list.add("강감찬");
		list.add("세종");

		System.out.println("길이(크기):\t" + list.size());		// 5
		System.out.println("값 포함여부:\t" + list.contains("세종"));	// true
		System.out.println("특정값 위치:\t" + list.indexOf("세종"));		// 4
		System.out.println("값이 없나:\t\t" + list.isEmpty());		// false
		
		System.out.println(list); 	// [홍길동, 이순신, 유관순, 강감찬, 세종]
		
		List<String> sub = list.subList(0, 3); // 0 ~ 2 까지 복사
//		for (String string : list) {
//			System.out.println(string);
//		}
		
		System.out.println("sub>>" + sub);	// sub>>[홍길동, 이순신, 유관순]
		
		Object[] obj = list.toArray();
		for (Object x : obj) {
			System.out.println("***" + x);
		}
		
		/*
		 ***홍길동
		 ***이순신
		 ***유관순
		 ***강감찬
		 ***세종
		 */
		
		list.add(0,"정조");
		System.out.println(list); 	// [정조, 홍길동, 이순신, 유관순, 강감찬, 세종]
		
		list.set(0, "영조"); 	// 
		System.out.println(list); 	// [영조, 홍길동, 이순신, 유관순, 강감찬, 세종]
		
		list.remove(0);
		list.remove("세종");
		System.out.println(list);	// [홍길동, 이순신, 유관순, 강감찬]
		
		
	}

}
