
public class ArrayTest {

	public static void main(String[] args) {
		// 1. 배열선언
		int num [] ;
		
		// 2. 배열 생성(객체 생성)
		num = new int[3];	// int를 저장할 3개의 방 생성 후 num이 참조함
		
		System.out.println(num);	// num은 배열의 주소를 가지고 있음
		System.out.println(num[0]); // 배열의 첫번째 값 출력 ( 기본값 0 )
		System.out.println(num[2]); // 배열의 세번째 값 출력 ( 기본값 0 )
									// 0 ~ 2까지 3개의 방
		
		// 3. 배열 초기화
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
//		num[3] = 40;	// err: 생성된 배열의 크기 이상으로 넣으려고 할때 에러 발생
		
		System.out.println(num[0]);	// 10
		System.out.println(num[1]); // 20
		System.out.println(num[2]); // 30
		
		System.out.println("배열의크기(길이)"+ num.length); 	// 3: 0 ~ 2
		
		for (int i = 0; i < 3; i++) {
			System.out.println(num[i]);
		}
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		
		///// 실습
		// int [] 방 4개 생성
		// 각방에 100, 200, 300, 400 저장
		// for문 이용 각방의 데이터 출력
		int test_array[];
		test_array = new int[4];
		for (int i = 0; i < test_array.length; i++) {
			test_array[i] = (i+1)*100;
		}
		for (int i = 0; i < test_array.length; i++) {
			System.out.println(test_array[i]);
		}
		
		// 배열 값의 합계 구하기
		int sum = 0;
		for (int i = 0; i < test_array.length; i++) {
			sum += test_array[i];
		}
		System.out.println(sum);
		
		// for each
		// 
		int sum2 = 0;
		for (int i : test_array) {
			System.out.println(i);
			sum2 += i;
		}
		System.out.println(sum2);
	}

}
