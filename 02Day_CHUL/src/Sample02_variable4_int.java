
public class Sample02_variable4_int {

	public static void main(String[] args) {
		
		byte b = 10;		
		short b2 = 20;		
		int b3 = 30;		
		long b4 = 40L;		
		
		//주민번호저장 (int로 저장하기에 큰 값 -> long 사용)
//		int ssn_int = 8901201234567;
		long ssn = 8901201234567L;
		
		
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);		// -128 ~ 127
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);	// -32768 ~ 32767
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);	// -2147483648 ~ 2147483647
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		// -9223372036854775808 ~ 9223372036854775807


	}

}
