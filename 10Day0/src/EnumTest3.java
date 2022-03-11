
public class EnumTest3 {
	
	// public enum 타입 {상수값, 상수값, 상수값3}
	public enum Color {BLUE, RED, YELLOW}


	public static void main(String[] args) {
		
		// 타입 .상수값
		Color c = Color.BLUE;
		Color c2 = Color.RED;
		Color c3 = Color.YELLOW;
//		Color c4 = Color.GREEN;
		
		System.out.println(c);
		System.out.println(c2);
		System.out.println(c3);
	
		Color[] xx = Color.values();
		for (Color p : xx) {
//			System.out.println(p);
			System.out.println(p.name() + "\t" + p.ordinal());
		}
		
	}

}
