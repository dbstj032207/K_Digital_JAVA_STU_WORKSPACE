
public class Sample05_operator {

	public static void main(String[] args) {
		
		// 1. 산술 연산자
		int n = 10;
		int n2 = 3;
		System.out.println(n + n2);		
		System.out.println(n - n2);
		System.out.println(n * n2);
		System.out.println(n / n2);		// 3
		System.out.println(n / 3.0);	// 3.3333
		System.out.println(n % n2);		// 1(나머지)
		
		// 2. 비교 연산자
		
		int xyz = 5;
		int xyz2 = 3;
		boolean result = xyz == xyz2;	
		System.out.println(result);			// false
		System.out.println(xyz == xyz2);	// false
		System.out.println(xyz != xyz2);	// true
		System.out.println(xyz > xyz2);		// true
		System.out.println(xyz >= xyz2);	// true
		System.out.println(xyz < xyz2);		// false
		System.out.println(xyz <= xyz2);	// false
		
		// 문자열의 비교: java에서 문자열의 값을 비교시 반드시 equals함수 사용 비교
		String s = "홍길동";
		String s2 = "홍길동";
		String s3 = new String("홍길동");
		System.out.println(s == s2);	// 주소비교, 실제 내용비교가 아님
		// "홍길동"이라는 객체가 만들어질때 한번 만들어진 객체를 계속 참조하기 때문에 같은 주소를 참조 true
		System.out.println(s.equals(s2));	// 실제 내용비교 true
		System.out.println(s == s3);	
		// 이 경우에 s3는 새로운 객체를 생성했기때문에 기존의 s1의 주소와 다른 주소의 "홍길동"을 가르킴
		// 따라서 둘의 주소가 다르기때문에 false
		
		// 3. 대입연산자
		int x = 10;
		int x2 = x;
		x2 += x;
		System.out.println(x2);		// 20
		x2 -= x;
		System.out.println(x2);		// 10
		x2 *= x;
		System.out.println(x2);		// 100
		x2 /= x;
		System.out.println(x2);		// 10
		x2 %= x;
		System.out.println(x2);		// 0
		
		//4. 증감 연산자
		int y = 10;
		y = y + 1;
		System.out.println(y); 	// 11
		++y;	// 전치
		System.out.println(y); 	// 12
		
		int z = 10;
		z = z + 1;
		System.out.println(z); 	// 11
		z++;	// 후치
		System.out.println(z); 	// 12
				
		
		int a = 10;
		int b = ++a; // a = 10 -> 11 변경 후 a에 저장, b = 11
		System.out.println(a + "\t" + b); 		// b = 11
		
		int a2 = 10;
		int b2 = a2++; // a2 = 10을 b2에 저장, b2 = 10,  저장 후 a2 = 10 -> 11 변경
		System.out.println(a2 + "\t" + b2); 	// b2 = 10
		
		
		// 5. 논리 연산자
		System.out.println(3 == 4 && 4 > 3);	// false
		
		System.out.println( ! true );		// false
		System.out.println( ! false );		// true
		
		System.out.println(true || true);		// true
		System.out.println(true || false);		// true
		System.out.println(false || true);		// true
		System.out.println(false || false);		// false
		
		System.out.println(true && true);		// true
		System.out.println(true && false);		// false
		System.out.println(false && true);		// false
		System.out.println(false && false);		// false

		// 6. 3항 연산자
		int xxx = (3 == 4)? 100 : 200;
		String xxx2 = (3 != 4)? "A" : "B";
		System.out.println(xxx);	// 200
		System.out.println(xxx2);	// "A"
		
		
	}

}
