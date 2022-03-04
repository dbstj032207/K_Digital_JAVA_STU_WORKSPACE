
public class ArrayTest3 {

	public static void change(int n) {
		n = 20;
	}
	private static void change2(int[] n) {
		n[2] = 90;
	}
	private static void change3(int i) {
		i = 500;
	}
	public static void main(String[] args) {
		
		int xxx = 10;
		System.out.println("함수 호출전:" + xxx);	// 10
		change(xxx);	// 기본 데이터 (8가지): 매개변수에 복사저장, call by value(값을 넘김)
		System.out.println("함수 호출후:" + xxx);	// 10
		
		System.out.println("==========================");
		
		int [] num = new int[3];
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		
		System.out.println("함수 호출전:" +num[2]);
		change2(num);	// 배열을 넘겨주면 배열의 주소를 넘겨주기때문에
						// 함수안에서 값을 변경하면 원래 배열에도 영향을 미침
						// call by reference(주소를 넘김)
		System.out.println("함수 호출후:" +num[2]);
		
		
		System.out.println("함수 호출전:" +num[0]);
		change3(num[0]);	// 배열의 주소가 아닌 값을 넘겼기 때문에 
							// 함수안에서 값이 바뀌더라도 원래 배열에는 영향 x
							// call by value(값을 넘김)
		System.out.println("함수 호출후:" +num[0]);
	}
	

	

}
