import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class MapTest7 {

	public static void main(String[] args) {
		
		HashMap<String,Person> map = new HashMap<>();
		map.put("one", new Person("홍길동1", 20, "서울"));
		map.put("two", new Person("홍길동2", 30, "전라"));
		map.put("three", new Person("홍길동3", 40, "서울"));

		HashMap<String,Person> map2 = new HashMap<>();

		map2.put("one", new Person("이순신1", 200, "서울2"));
		map2.put("two", new Person("이순신2", 300, "전라2"));
		map2.put("three", new Person("이순신3", 400, "서울2"));

		
		ArrayList <HashMap<String,Person>> list = 
				new ArrayList <HashMap<String,Person>>();
		list.add(map);
		list.add(map2);
		
		// 데이터 출력하기
		for (HashMap<String, Person> hashMap : list) {
			Set <String> keys = hashMap.keySet();
			for (String key : keys) {
				Person p = hashMap.get(key);
				System.out.println(p.getName() + "\t" + p.getAge());
			}
		}

	}

}
