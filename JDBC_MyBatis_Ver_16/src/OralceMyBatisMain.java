import java.util.HashMap;
import java.util.List;

import com.dto.Dept;
import com.service.OracleMyBatisService;

public class OralceMyBatisMain {

	public static void main(String[] args) {
		
		OracleMyBatisService service = new OracleMyBatisService();
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("deptno1", 10);
		map.put("deptno2", 12);
		
		List<Dept> list= service.multiSelectMap(map);
		for (Dept dept : list) {
			System.out.println(dept);
		}
	}

}
