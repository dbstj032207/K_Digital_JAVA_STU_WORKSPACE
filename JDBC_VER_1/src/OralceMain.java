import java.sql.SQLException;
import java.util.ArrayList;

import com.dto.Dept;
import com.exception.RecordNotFoundException;
import com.service.OracleService;

public class OralceMain {

	public static void main(String[] args) {
		
		OracleService service = new OracleService();
		
		
		Dept xx = new Dept(99, "영업", "서울");
		int num = service.insert(xx);
		System.out.println("in main num = " + num);
		
		Dept xx2 = new Dept(99, "제경", "부산");
		try {
			int num3 = service.update(xx2);
			System.out.println("in main updatenum = " + num3);
		} catch (RecordNotFoundException e1) {
			System.out.println(e1.getMessage());
			e1.printStackTrace();
		}
		
		int num2 = service.delete(99);
		System.out.println("in main deleteenum = " + num2);
		
		try {
//			System.out.println(service.select());
			ArrayList<Dept> list = service.select();
			for (Dept dept : list) {
				System.out.println(dept);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("============================");
		
		try {
			System.out.println(service.selectDeptno(40));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
