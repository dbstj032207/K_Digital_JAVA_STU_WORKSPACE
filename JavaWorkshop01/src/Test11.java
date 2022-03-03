import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("주소를 입력하시오.");
		
		String str = scan.nextLine();
		
		System.out.println(str);
		System.out.println("문자 갯수(공백포함): " + str.length());
		System.out.println("단어 갯수: " + str.split(" ").length);

		String s = "aaa/bbb/ccc";	
		System.out.println("단어 갯수: " + s.split("/").length);
		
	}

}
