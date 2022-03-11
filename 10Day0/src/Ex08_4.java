
public class Ex08_4 {

	public static void main(String[] args) {
		
		String str = "Hello" + 1 + 2 + 3;
		String str2 = 1 + 2 + 3 + "Hello";
		String str3 = 1 + 2 + "Hello" + 3;
		
		System.out.println(str);	// Hello123
		System.out.println(str2); 	// 6Hello
		System.out.println(str3);	// 3Hello3

	}

}
