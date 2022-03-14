import java.util.Comparator;

public class PersonAgeSortComparator implements Comparator <Person>{

	@Override
	public int compare(Person o1, Person o2) {
		int num = -1;
		if(o1.getAge() > o2.getAge()) {
			num = 0; 
		}
		return num;
	}
	
	
}
