
public class ArrayTest12 {

	public static void main(String[] args) {	// 문자열의 배열 매개변수로 받음
												// Run as
												// Run Configurations...
												// arguments 탭에서 문자열 값 부여
		// TODO Auto-generated method stub
		for (String s : args) {
			System.out.println(s);
		}
		System.out.println("==================");
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}

}
