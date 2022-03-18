import java.util.List;

import com.dto.Dept;
import com.service.OracleMyBatisService;

public class OralceMyBatisMain3 {

	public static void main(String[] args) {
		OracleMyBatisService service= new OracleMyBatisService();
		int num= service.deptRecordCount();//전체 레코드 갯수 구하기 
		
		System.out.println("레코드 갯수는 num==="+ num);
		
		
		
		
		
		List<Dept> list= service.selectAll();
		for (Dept dept : list) {
			System.out.println(dept);
		}
	}

}
