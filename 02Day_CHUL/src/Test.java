import java.math.*;
public class Test {

	public static void main(String[] args) {
		
		double n = 2.0;
		double n2 = 1.1;
		
		System.out.println(n - n2); 	// 0.899999
		
		BigDecimal m = new BigDecimal("2.0");
		BigDecimal m2 = new BigDecimal("1.1");
		
		System.out.println(m.subtract(m2));		//0.9
		

	}
}
