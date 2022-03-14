import java.util.Enumeration;
import java.util.Properties;

public class MapTest8 {

	public static void main(String[] args) {
		
		Properties props = System.getProperties();
		Enumeration<?> enu = props.propertyNames();
		while (enu.hasMoreElements()) {
			String key = (String) enu.nextElement();
			String value = props.getProperty(key);
			System.out.println(key + "=" + value);
		}
	}
}
