import java.util.Enumeration;
import java.util.Properties;

public class MapTest9 {

	public static void main(String[] args) {
		
		Properties prop = new Properties();
		prop.setProperty("one","홍길동");
		prop.setProperty("two","홍길동2");
		prop.setProperty("three","홍길동3");

		String one = prop.getProperty("one");
		System.out.println(one);
		System.out.println(prop.get("two"));
		System.out.println(prop.get("three"));
		
		Enumeration enu = prop.propertyNames();
		while(enu.hasMoreElements()) {
			String s = (String) enu.nextElement();
			System.out.println(s);
		}
	}

}
