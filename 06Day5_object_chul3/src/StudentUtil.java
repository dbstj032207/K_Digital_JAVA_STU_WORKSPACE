
public class StudentUtil {

	public void firstName(Student stu) {
		String name = stu.getName();
		char first = name.charAt(0);
		System.out.println("성은\t==========\t" + first);
	}
	
	public void nameLength(Student stu) {
		String name = stu.getName();
		int length = name.length();
		System.out.println("길이는\t==========\t" + length);
	}

	public int nameLength2(Student stu) {
		return stu.getName().length();
	}
}
