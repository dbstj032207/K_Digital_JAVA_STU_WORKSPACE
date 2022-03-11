import com.dao.*;
import com.service.DBService;


public class DBMain {
	public static void main(String[] args) {
		
		DBService sercive = new DBService();
		
		// OracleDAO 사용
		sercive.setDAO(new OracleDAO());
		
		// MySQLDAO 사용
		sercive.setDAO(new MySQLDAO());
		
	}
	
}
