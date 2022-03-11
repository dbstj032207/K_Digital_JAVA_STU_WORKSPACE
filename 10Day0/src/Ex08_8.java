
public class Ex08_8 {

	public static void main(String[] args) {
		
		// 1. 기본형을 Wrapper로 변경
		int num = 10;
		Integer x = new Integer(num);
		
		// 1.5버전 이전은 에러 발생
		int sum = x + 1; 	// 1.5버전 이후 객체 x를 자동으로 int로 변형, 오토 언박싱
		// int sum = x.intValue() + 1; 	// 1.5버전 이전에선 이렇게 변형 해주어야함
		
		System.out.println(x);
		System.out.println(sum);
		
		// 2. Wrapper을 기본형으로 변경
		int x2 = x.intValue();
		System.out.println(x2);
		
		// 1.5버전 이전은 에러 발생
		Integer x3 = 10;	// 1.5버전 이후 10을 자동으로 Integer객체로 변형, 오토 박싱

		System.out.println(x3 + num);
		
		// 자동 박싱
		Object i[] = new Object[3];
		// object와 기본형 원래는 err
		i[0] = 10;	// 오토 박싱 10 -> Integer클래스 10
		
		
	}

}
