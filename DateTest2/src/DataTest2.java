import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataTest2 {

	public static void main(String[] args) throws Exception {
		
		Date d = new Date();
		System.out.println(d);
		
		SimpleDateFormat sdf = 
				new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss");
		
		// Date --> String
		String mesg = sdf.format(d);
		System.out.println(mesg);
		
		SimpleDateFormat sdf2 =
				new SimpleDateFormat("yyyy년 MM월 dd일");
		
		// String --> Date
		Date d2 = sdf2.parse("2020년 10월 16일");
		System.out.println(d2);

	}

}
