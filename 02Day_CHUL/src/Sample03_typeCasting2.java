
public class Sample03_typeCasting2 {

	public static void main(String[] args) {
		
		// 데이터 타입 변경(명시적으로 형변환 시킨다)
		// 큰타입 => 작은 타입에 저장시는 반드시 명시적으로 적어주어야함
		int n = 10;
		short n2 = (short)n;
		
		short x = 10;
		short x2 = 20;
		short x3 = (short)(x + x2); // 주의
//		short x4 = (short)x + x2;	// 에러: x만 형변환시키면 결국 short + short는 int형 반환
	}

}
