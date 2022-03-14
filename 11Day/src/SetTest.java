import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		Set set = new HashSet();
		set.add("1");
		set.add("2");
		set.add(3);
//		set.add("4");
//		set.add("1");
//		set.add(3.15);
//		set.add(new Date());
		
		System.out.println("길이: " + set.size());
		System.out.println("포함여부: " + set.contains("1"));
		System.out.println("empty냐: " + set.isEmpty());
		
		System.out.println(set.toString());
		Object [] xxx = set.toArray();
		for (Object o : xxx) {
			System.out.println(o);
		}
		
		set.clear();
		System.out.println(set);
		
	}

}
