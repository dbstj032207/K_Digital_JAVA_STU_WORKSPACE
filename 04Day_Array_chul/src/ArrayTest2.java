
public class ArrayTest2 {

	public static void main(String[] args) {
		// 배열선언과 동시에 생성
		int num [] = new int[3];	

		// 배열 초기화
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		
		// 다시 생성 -> 기존의 배열은 삭제
		num = new int[4];
		
		// 배열 초기화
		num[0] = 1;
		num[1] = 2;
		num[2] = 3;
		num[3] = 4;
		
		System.out.println(num[0]);	// 1
		System.out.println(num[1]); // 2
		System.out.println(num[2]); // 3
		System.out.println(num[3]); // 4
		
		String name[] = new String[3];
		
		System.out.println(name[0]); // null(초기값)
		
		name[0] = "홍길동";
		name[1] = "이순신";
		name[2] = "유관순";
		
		for (String s : name) {
			System.out.println(s);
		}
	}

}
