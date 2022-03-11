import java.util.Calendar;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		
		// 날짜 데이터
		// 1. java.util.Date // 날짜 표현시에 주로사용
		
		Date d = new Date();
		System.out.println("d = " + d);
		System.out.println("d.toString()==" + d.toString());
		Date d2 = new Date(2019, 06, 18);	// 사용은 되지만, 옛날방식이라 권장하지 않음
		System.out.println("d2 = " + d2);
		
		// 2. java.util.Calendar
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		System.out.println(c.toString());
		System.out.println("년도: " + c.get(Calendar.YEAR));
		
		int month = c.get(Calendar.MONTH) + 1;
		// 0 => 1월
		System.out.println("월 : " + month);

		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println("일 : " + day);
		
		int week = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(week + "요일");
		// 1 => 일요일
		
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int minutes = c.get(Calendar.MINUTE);
		int seconds = c.get(Calendar.SECOND);
		System.out.println(hour + "h\t" + minutes + "m\t" + seconds + "m");
		
		// 특정 날짜 설정하기
		Calendar cal2 = Calendar.getInstance();
		cal2.set(2014,  11, 24);
		Date now = cal2.getTime();
		System.out.println(now);
		
		// 날짜 변경
		System.out.println("= 1일 후 =");
		cal2.add(Calendar.DATE, 1);
		System.out.println(cal2.getTime());
		System.out.println("= 6달 전 =");
		cal2.add(Calendar.MONTH, -6);
		System.out.println(cal2.getTime());
		
	}

}
