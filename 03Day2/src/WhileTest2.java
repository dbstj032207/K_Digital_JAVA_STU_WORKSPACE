
public class WhileTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 1;	// 증가값
		int sum = 0;	//누적된 합계
		
		while(num <= 10) {	// 1 ~ 10
			sum += num;
			System.out.println("sum = " + sum + ", num = " + num);
			num++;	// 증감식
		}
		System.out.println("누적합계:  " + sum);
		System.out.println("===================");
		
		num = 1;
		sum = 0;
		//짝수인 경우만 덧셈하기
		while(num <= 10) {	// 1 ~ 10
			if(num % 2 == 0) {
				sum += num;
				System.out.println("sum = " + sum + ", num = " + num);
				
			}
			
			num++;	// 증감식	
		}
		
		System.out.println("누적합계:  " + sum);
		System.out.println("===================");
		
		num = 1;
		sum = 0;
		//3의 배수인 경우만 덧셈하기
		while(num <= 10) {	// 1 ~ 10
			if(num % 3 == 0) {
				sum += num;
				System.out.println("sum = " + sum + ", num = " + num);
				
			}
			
			num++;	// 증감식	
		}
		
		System.out.println("누적합계:  " + sum);
		System.out.println("===================");
		
	}

}
