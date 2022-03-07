import java.util.Arrays;

public class ArrayTest6 {

	public static void main(String[] args) {
		
		int [] num2 = {10, 20, 30, 40, 50};

		// 배열관련 유틸리티 클래스
		
		
		
		// 1. 배열복사
		System.out.println("============= 1. 배열복사 ==============");
		int [] xxx = Arrays.copyOf(num2, num2.length);	// 배열의 길이만큼(전체) 복사
		for (int i : xxx) {
			System.out.println(i);
		}
		
		int [] xxx2 = Arrays.copyOf(num2, 2);	// 2개의 값만 복사
		for (int i : xxx2) {
			System.out.println(i);
		}

		// 2. 채워넣기
		System.out.println("============= 2. 채워넣기 ==============");
		Arrays.fill(num2,  100);
		for (int i : xxx2) {
			System.out.println("###" + i);
		}


		//3. 값비교
		int [] a = {10,20};
		int [] b = {10,20};
				
		System.out.println(a==b);//false
		System.out.println(Arrays.equals(a, b));

		
		// 4. 정렬
		int [] xyz = {9,4,3,12,55,63,2,3,190};
		Arrays.sort(xyz);
		for (int i : xyz) {
			System.out.println("***"+i);
		}
		
		// 5. 검색
		String [] kkk = {"xMan","Alex","XMan", "Bob","Curl"};
		int idx= Arrays.binarySearch(kkk, "Bob");
		System.out.println("idx==="+ idx);

		
	}

}
