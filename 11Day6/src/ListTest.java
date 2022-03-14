import java.util.ArrayList;
import java.util.Date;

public class ListTest {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add("홍길동");
		list.add("이순신");
		list.add(20);
		list.add("홍길동");
		list.add(3.15);
		list.add(new Date());
		
		System.out.println(list);
		// [홍길동, 이순신, 20, 홍길동, 3.15, Mon Mar 14 14:47:56 KST 2022]
		// 중복 서상, 저장된 순서 반영
		
	}

}
