import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import com.dto.Dept;
import com.exception.RecordNotFoundException;
import com.service.OracleMyBatisService;

public class OralceMyBatisMain6 {

	public static void main(String[] args) {
		OracleMyBatisService service= new OracleMyBatisService();
		

		List<Dept> deptlist3 = service.selectTopN(0, 2); // 시작 레코드 번호, 개수
		for (Dept dept : deptlist3) {
			System.out.println(">>>" + dept);
		}
	}

}
