import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Set;

import com.service.OracleMyBatisService;

public class OralceMyBatisMain3 {

	public static void main(String[] args) {
		OracleMyBatisService service= new OracleMyBatisService();
//		int num= service.deptRecordCount();//전체 레코드 갯수 구하기 
//		
//		System.out.println("레코드 갯수는 num==="+ num);

		HashMap map = service.selectByDeptnoHashmap(10);
		System.out.println(map);
		
		Set<String> keys = map.keySet();
		System.out.println(keys);
		for (String key : keys) {
			System.out.print(key + ":");
			System.out.print(map.get(key));
			System.out.println();
		}
		
		System.out.println("======================");
		String loc = (String)map.get("LOC"); 	// 형 변환
		System.out.println(loc);
		
		BigDecimal big = (BigDecimal)map.get("DEPTNO");
		int no = big.intValue();	// 정수 형 변환
		System.out.println(no + 10);	// 제대로 변환되었는지 확인하기 위해 + 10 연산 실행해서 출력

//		List<Dept> list= service.selectAll();
//		for (Dept dept : list) {
//			System.out.println(dept);
//		}
	}

}
