
public class Test01 {

	public static void main(String[] args) {

		int inx = 15;
		if(inx > 10 && inx < 20) {
			System.out.println("true");
		}
		
		// 2. char형 변수 ch1이 공백이 아니거나, 탭이 아닐 때 true인 조건식
		char ch1 = ' ';
		if(ch1 != ' ' || ch1 != '\t' ) {
			System.out.println("true");
		}
		
		char ch2 = 'x';
		if(ch2 == 'x' || ch2 == 'X' ) {
			System.out.println("true");
		}
		
		char ch3 = '0';
		if(ch3 >= '0' || ch3 <= '9' ) {
			System.out.println("true");
		}

		char ch4 = 'a';
		if( ( 'a' <= ch4 && ch4 <= 'z') || ( 'A' <= ch4 && ch4 <= 'Z') ) {
			System.out.println("true");
		}
		
		char year = 400;
		if( year % 400 == 0 || (year % 4 == 0 && year % 100 != 0) ) {
			System.out.println("true");
		}
		
		boolean powerOn = false;
		if(!powerOn) {
			System.out.println("true");
		}

	}

}
