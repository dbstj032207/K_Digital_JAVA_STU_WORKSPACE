import java.util.Scanner;

public class Test14 {

	public static void main(String[] args) {
		
		String mesg = "100/200";
		String [] data = mesg.split("/");
		
		int sum = 0;
		for (String s : data) {
			sum += Integer.parseInt(s);
		}
		
		int avg = sum / data.length;
		
		System.out.println("정수값 합계: " + sum);
		System.out.println("정수값 평균: " + avg);
		
	}

}
