
public class WhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 0;	// 초기식
		while(n < 10) {	// 조건 검사
			if(n == 5) break; // 조건 충족시 해당 블록을 찾아가 다시 실행
			System.out.println("hello " + n);
			n++;	// 증감식
		}
		System.out.println("while 빠져나옴 n = " + n);
		System.out.println("===================");
		
		/*
		hello 0
		hello 1
		hello 2
		hello 3
		hello 4
		while 빠져나옴 n = 5
		===================
		*/ 
		
		int n2 = 0;	// 초기식
		do {
//			if(n2 == 2) continue; // 조건 충족시 해당 블록을 찾아가 다시 실행
			System.out.println("world " + n2);
			n2++;	// 증감식
		}
		while(n2 < 5) ;	// 조건 검사

		System.out.println("do-while 빠져나옴 n2 = " + n2);
		System.out.println("===================");
		
		/*
		world 0
		world 1
		world 2
		world 3
		world 4
		do-while 빠져나옴 n2 = 5
		===================
		*/
	}

}
