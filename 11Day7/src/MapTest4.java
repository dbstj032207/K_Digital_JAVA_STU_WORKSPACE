import java.util.HashMap;
import java.util.Set;

public class MapTest4 {

	public static void main(String[] args) {
		
		HashMap <String, String> map = new HashMap<>();
		map.put("one","홍길동");
		map.put("two","이순신");
		map.put("three","유관순");

		System.out.println(map.get("one")); 	// 홍길동
		System.out.println(map.get("two")); 	// 이순신
		System.out.println(map.get("three"));	// 유관순
		
		//메서드
		System.out.println("크기:" +map.size()); 	// 크기:3
		System.out.println("키 포함 여부:"
		    +map.containsKey("one"));	// 키 포함 여부:true
		System.out.println("값 포함 여부:"
		    +map.containsValue("유관순"));	// 값 포함 여부:true

		map.replace("three", "강감찬");
		map.remove("two");
		
//		map.clear();
		
		System.out.println(map); 	// {one=홍길동, three=강감찬}
		System.out.println("====================");
		
		// 순회
		// 1. key값만 얻기
		Set <String> keys = map.keySet();
		System.out.println(keys); 	// [one, three]
		
		for (String key : keys) {	// key 하나 얻기
			System.out.println(key + "\t" + map.get(key));	// key에 해당하는 value 값 얻기
			// one	홍길동
			// three	강감찬
		}
		System.out.println("====================");
		
		
		

	}

}
