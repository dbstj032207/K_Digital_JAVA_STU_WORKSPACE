import java.util.Date;

public class Ex10_2 {

	public static void main(String[] args) {
		
		Box<String> b = new Box<String>();
		b.setValue("Hello");
//		b.setValue(111);	//err
		String str = (String)b.getValue();
		System.out.println(str);
		
		Box<Date> b2 = new Box<Date>();
		b2.setValue(new Date());
		Date d = b2.getValue(); 	// 형 변환 필요 x
		System.out.println(d);
		

	}

}
