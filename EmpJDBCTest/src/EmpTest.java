import java.util.ArrayList;
import java.util.HashMap;

import com.biz.EmpBiz;
import com.entity.EmpDTO;
import com.exception.DataNotFoundException;

public class EmpTest {

	public static void main(String[] args) throws DataNotFoundException {
		
		EmpBiz empBiz = new EmpBiz(); // 생성자 작성
		
		
		empBiz.empInsert(new EmpDTO(30, "kim", "sales", 7902, null, 0.0, 0.1, 10));
		
//		EmpDTO dto = empBiz.selectDetailEmp("7369");
//		System.out.println(dto);
		
		empBiz.empUpdate(new EmpDTO(30, "kim", "AAAAAA", 7902, null, 0.0, 0.1, 10));
		// 30번의 job, sal, update
		// biz, dao insert 활용
		// 30번 레코드가 없는 경우 DataNotFoundEx발생 "30번 사원이 없습니다. " 메세지 출력
		
		empBiz.empDelete("30");
		
		HashMap<String, String> map = new HashMap<>();
		map.put("job", "SALESMAN");
		map.put("deptno", "30");
		
		ArrayList<EmpDTO> list2 = empBiz.selectAllEmp2(map);
		for (int i = 0; i < list2.size(); i++) {
		System.out.println(list2.get(i));
		}
		System.out.println("================================");
		
//		ArrayList<EmpDTO> list = empBiz.selectAllEmp();
//		
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
//		System.out.println("================================");
		
		
		
	}

}
