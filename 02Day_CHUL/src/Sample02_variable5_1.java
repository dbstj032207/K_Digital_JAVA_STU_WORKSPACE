
public class Sample02_variable5_1 {

	public static void main(String[] args) {
		
		// 자바는 블록 scope( 자바스크립트는 함수 scope ) 
		{ // a블럭
			int num = 10;	// a블럭안의 로컬변수
			System.out.println(num);	//10
			
		}
		
//		System.out.println(num); 	//블럭 밖에서 인식불가
		
		{ // b블럭
			int num = 20;	// b블럭안의 로컬변수, a에 있지만 블럭이 다르기때문에 선언 가능
			System.out.println(num);	//20
		}
//		System.out.println(num); 	//마찬가지블럭 밖에서 인식불가		
	}

}
