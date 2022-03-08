
public class StudentUtil {

	public char firstName(Student stu) {
		String name = stu.getName();
		char first = name.charAt(0);
		return first;
	}
	
	public int nameLength(Student stu) {
		String name = stu.getName();
		int length = name.length();
		return length;
	}

	public int nameLength2(Student stu) {
		return stu.getName().length();
	}
}
