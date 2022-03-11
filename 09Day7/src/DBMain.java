import com.dao.*;
import com.service.DBService;


public class DBMain {
	public static void main(String[] args) {
		
//		OracleDAO dao = new OracleDAO();
//		dao.connectOracle();
		
//		MySQLDAO dao = new MySQLDAO();
//		dao.connectMySQL(); 	// 접속 변경 시 함수 새로 생성 후 함수호출해야함
		
		DBService sercive = new DBService();
		
//		sercive.setDAO(new MySQLDAO());	// OracleDAO로 접속하려고할때 함수 변경 필요
		
		sercive.setDAO(new OracleDAO());
		
	}
	
}
