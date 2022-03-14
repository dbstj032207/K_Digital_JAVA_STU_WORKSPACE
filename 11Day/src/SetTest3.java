import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest3 {

	public static void main(String[] args) {
		
		
		Set<Person> set = new HashSet<Person>();
		Person kkkk = new Person("유관순", 17, "서울");
		set.add(new Person("홍길동", 20, "서울"));
		set.add(new Person("이순신", 44, "전라"));
		set.add(new Person("이순신", 44, "전라"));		// 내용은 같지만 다른객체
		set.add(kkkk);
		set.add(kkkk);	// 같은 객체
		System.out.println(set);
		/*[Person [name=이순신, age=44, address=전라], 
		 * Person [name=홍길동, age=20, address=서울], 
		 * Person [name=이순신, age=44, address=전라], 
		 * Person [name=유관순, age=17, address=서울]]
		 */
		// 순서 일정x, 같은객체는 중복 삽입 x
		
		for (Person x : set) {
			System.out.println(x.getName());
		}
		
		System.out.println("====================");
		
		Iterator<Person> ite = set.iterator();
		while(ite.hasNext()) {
			Person m = ite.next();
			System.out.println(">>" + m);
		}
		

	}

}
