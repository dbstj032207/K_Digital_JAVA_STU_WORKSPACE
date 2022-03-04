import java.util.Scanner;

public class WhileTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("끝내려면 종료 입력");
		while( true ) {	// 강제 무한 반복
			String data = scan.next();
			if(data.equals("종료")) { // 문자열의 내용비교 equals 사용
				break;
			}
			System.out.println("입력한 값은: " + data);
		}
		System.out.println("종료됨");
	} // end main 

} // end class
