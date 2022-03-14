import java.util.Date;

public class GenericTest {

	public static void main(String[] args) {
		
		Box b = new Box();
		b.setValue("Hello");
		String str = (String)b.getValue();
		System.out.println(str);
		
		Box b2 = new Box();
		b2.setValue(new Date());
		Date d = (Date)b2.getValue();
		System.out.println(d);
		

	}

}
