
public class Sample02_variable3_char {

	public static void main(String[] args) {
		char c = 'A';
		int num = (int)c;	// 'A'의 아스키코드 값은 65 이기때문에 65로 변환되어 정수형으로 저장 ( 명시적 형 변환 )
		System.out.println(num);
		System.out.println(c + 1); 	// 자동으로 char -> int 형 변환( 묵시적 형 변환 ) + 1 계산 후 출력
		System.out.println((char)(c + 1)); 	// 자동으로 char -> int 형 변환( 묵시적 형 변환 ) + 1 계산  
											// = 66 -> char로 다시 변환( 명시적 형 변환 )
		char c2 = '홍';
		char c3 = '\uD64D';
		System.out.println(c + " " + c2 + " " + c3);
		
		//Escape 문자
		System.out.println("aaa\tbbb");		// 탭
		
		System.out.println(c + "\t" + c2 + "\t" + c3 );
		
		System.out.println("aaa\nbbb");		// 줄 바꿈
		System.out.println("aaa\'bbb");		// ' 출력
		System.out.println("aaa\"bbb");		// " 출력
		System.out.println("aaa\\bbb");		// \ 출력

	}

}
