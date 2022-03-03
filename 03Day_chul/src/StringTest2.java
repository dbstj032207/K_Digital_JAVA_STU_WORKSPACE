
public class StringTest2 {

	public static void main(String[] args) {
		
		// 공백이 포함된 문자열
		String t="  hEllo   ";
		System.out.println(t.length());			// 공백이 포함된 길이
		System.out.println(t.trim().length());	// 공백을 제외한 길이

		String xyz = "helloworld";
		
		String q = xyz.substring(3);	// index 3부터 끝까지
		String q2 = xyz.substring(3,7);	// index 3부터 7 전까지
		System.out.println(q);
		System.out.println(q2);
		
		String s ="hello";		
		char x = s.charAt(0);	// index 0번 추출
		System.out.println(x);	// 'h'
		System.out.println(s.charAt(1));	// index 1번 추출 'e'
		
		String x2 = s.concat("world");	// 문자열 붙이기
		System.out.println(x2);	// "helloworld"
		System.out.println(s); // 원본 글자(바뀌지 않음)
		
		int x3=s.length();	// 문자열의 길이
		System.out.println(x3);		// 5
		
		String aaa ="Hello";	// 두가지의 대소문자가 다름
		String aaa2 ="hello";
		//System.out.println(aaa == aaa2);	// 주소비교
		boolean result  =aaa.equals(aaa2);	
		System.out.println(result); 	// false
		boolean result2  =aaa.equalsIgnoreCase(aaa2);	// 대소문자 무시하고 비교	
		System.out.println(result2);	// true

		boolean kkk = s.contains("h");	// "hello"에 "h"가 있는지 판단 
		System.out.println(kkk);	// true
		boolean kkk2 = s.contains("hx"); // "hello"에 "hx"가 있는지 판단 
		System.out.println(kkk2);	// false

	}

}
