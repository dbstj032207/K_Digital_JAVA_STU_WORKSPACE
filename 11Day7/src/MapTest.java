import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		
		Map map = new HashMap();
		map.put("one", "홍길동");
		map.put("two", new Date());
		map.put(1, "강감찬");
		
		System.out.println(map.get("one")); 	// 홍길동
		System.out.println(map.get("two")); 	// Mon Mar 14 16:06:38 KST 2022
		System.out.println(map.get(1)); 	// 강감찬
		System.out.println(map.get(3.14));	// null
		System.out.println(map.size()); 	// 3
	}

}
