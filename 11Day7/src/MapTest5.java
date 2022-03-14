import java.util.HashMap;
import java.util.Set;

public class MapTest5 {

	public static void main(String[] args) {
		
		HashMap <String, Person> map = new HashMap<>();
		map.put("one", new Person("홍길동", 20, "서울"));
		map.put("two",new Person("이순신", 30, "전라"));
		map.put("three",new Person("유관순", 40, "서울"));

		System.out.println(map.get("one").getName()); 	// 홍길동
		Person one = map.get("one");
		System.out.println(one.getName()); 	// 홍길동
		
		System.out.println("====================");

		Set <String> keys = map.keySet();
		for (String key : keys) {	// key 하나 얻기
			System.out.println(map.get(key).getName());
		}
		
	}

}
