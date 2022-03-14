import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class MapTest3 {

	public static void main(String[] args) {
		
		HashMap <String, String> map = new HashMap<>();
		map.put("one","홍길동");
		map.put("two","이순신");
		map.put("three","유관순");
		map.put("one","강감찬");
		map.put("one", null);
		map.put(null, null);
		map.put(null, "aaa");

		
		System.out.println(map.get("one")); 	// null
		System.out.println(map.get("two")); 	// 이순신
		System.out.println(map.get("three"));	// 유관순
		System.out.println(map.get("four"));	// null
		System.out.println(map.get(null)); 		// aaa
	}

}
