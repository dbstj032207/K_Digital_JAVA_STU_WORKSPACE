
public class Sample06_circle_operator {

	public static void main(String[] args) {
		String name = "Hello";
		System.out.println(name.length());
		
		String name2 = null;
//		System.out.println(name2.length());	// err: NullPointerException
		
		System.out.println((4<2) && name2.length() == 4);	// false
		// 앞의 결과가 이미 false이기 때문에 뒤는 아예 실행을 하지 않음

		System.out.println((4>2) || name2.length() == 4);	// true
		// 앞의 결과가 이미 true이기 때문에 뒤는 아예 실행을 하지 않음
	}

}
