
public class Sample02_variable3_char2 {

	public static void main(String[] args) {
		char c = 'A';	// 65
		char c1 = 'a'; 	// 97
		System.out.println(c + 1);	// 65 + 1
		System.out.println(c1 + 1);	// 97 + 1
		char c2 = (char)65;		// 65 -> 'A'
		System.out.println(c2);	
		char c3 = (char)(c+1);	// 65 + 1 = 66 -> 'B'
		System.out.println(c3);
	}

}
