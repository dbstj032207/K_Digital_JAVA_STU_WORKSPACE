import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListTest7 {

	public static void main(String[] args) {
		
		ArrayList<Integer> set = new ArrayList<Integer>();
		set.add(9);
		set.add(6);
		set.add(1);
		set.add(3);
		set.add(4);
		
		System.out.println("정렬전:"+set);	// 정렬전:[9, 6, 1, 3, 4]
		Collections.sort(set);
		System.out.println("정렬후:"+set); 	// 정렬후:[1, 3, 4, 6, 9]
		
		System.out.println("=======================");
		
		System.out.println("정렬전:"+set);	// 정렬전:[1, 3, 4, 6, 9]
		Collections.reverse(set);
		System.out.println("정렬후:"+set);	// 정렬후:[9, 6, 4, 3, 1]
		
		
		ArrayList<Person> set2 = new ArrayList<Person>();
		set2.add(new Person("홍길동", 20, "서울"));
		set2.add(new Person("이순신", 44, "전라"));
		set2.add(new Person("강감찬", 33, "전라"));
		
		System.out.println("정렬전:"+set2);
		/*정렬전:[Person [name=홍길동, age=20, address=서울],
		 * Person [name=이순신, age=44, address=전라],
		 * Person [name=강감찬, age=33, address=전라]] 
		 */
		Collections.sort(set2, new PersonAgeSortComparator());	// 나이 순으로 정렬
		System.out.println("정렬후:"+set2);
		/*정렬후:[Person [name=홍길동, age=20, address=서울], 
		 * Person [name=강감찬, age=33, address=전라], 
		 * Person [name=이순신, age=44, address=전라]]
		 */

		for (Person p : set2) {
			if(p.getName().equals("홍길동")) {
				System.out.println(p);
			}
		}	// Person [name=홍길동, age=20, address=서울]
		
	}

}
