import java.util.HashMap;
import java.util.List;

import com.dto.Dept;
import com.service.OracleMyBatisService;

public class OralceMyBatisMain5 {

	public static void main(String[] args) {
		OracleMyBatisService service= new OracleMyBatisService();
		
		int deptno = 10;
		HashMap<String, String> map = new HashMap<String, String>();
//		map.put("loc", "NEW YORK");
		map.put("dname", "RESEARCH"); 	// key
		
		List <Dept> list = service.selectDynamicChoose(map);
		

		for (Dept dept : list) {
			System.out.println(dept);
		}
	}

}
