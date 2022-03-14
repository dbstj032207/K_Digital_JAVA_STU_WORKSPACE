package Workshop06.token;

import java.util.StringTokenizer;

public class StringTokenTest {

	public static void main(String[] args) {
		
		String str = "4,2,3,6,7";
		
		StringTokenizer stz = new StringTokenizer(str, ",");
		
		int sum = 0;
		while(stz.hasMoreTokens()) {
			sum += Integer.parseInt(stz.nextToken());
		}
		
		System.out.println(sum);
	}

}
