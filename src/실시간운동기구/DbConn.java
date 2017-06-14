package 실시간운동기구;

public class DbConn {

	public static String DB_Driver = "org.gjt.mm.mysql.Driver";
	
	public static String DB_URL = "jdbc:mysql://localhost/bitdb?useSSL=false";
	public static String DB_User = "root";
	public static String DB_PASSWD = "!BitCom0228";

	// Message
	// Sub 클래스
	public static class Msg{
		
		public static final String Msg_Driver_Success = "Mysql Driver Loading Success!!";
		public static final String Msg_Conn_Success = "DB Connection Success!!";
		public static final String Msg_DbInsert_Success= "DB 추가 완료";
	}
}
