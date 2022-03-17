import java.util.List;

import com.dto.Dept;
import com.service.OracleMyBatisService;

public class OralceMyBatisMain {

	public static void main(String[] args) {
		
		OracleMyBatisService service = new OracleMyBatisService();
		
		int num = service.insert(new Dept(99, "개발", "강남"));	// 반드시 commit
		System.out.println("in main insert 개수: " + num);
		
		List <Dept> list = service.selectAll();
		for (Dept dept : list) {
			System.out.println(dept);
		}
		
		System.out.println("==========================");
		
		Dept dept = service.selectByDeptno();
		System.out.println(dept);

	}

}
