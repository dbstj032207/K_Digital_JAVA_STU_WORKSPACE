

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		
		// "aa/bb/cc" ==> / 구분자로 값을 반환
		String data = "aa/bb/cc,dd/ee/xx,kk/yy/zz";
		
		// 1. String의 split()
		String [] d = data.split("/");
		for (String s : d) {
			System.out.println(s);
		}
		
		System.out.println("=========================");
		
		// 2. StringTokenizer
		StringTokenizer st = new StringTokenizer(data, "/");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		// 여러개의 구분자로 끊기 가능
		StringTokenizer st2 = new StringTokenizer(data, "/ ,");
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
		

	}

}
