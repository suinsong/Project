package 인바디;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class MemberDAO {

	Connection conn;
	PreparedStatement pSt;

	public MemberDAO() {
		try {
			Class.forName(Db_Info.DB_DRIVER);
			conn = DriverManager.getConnection(Db_Info.DB_PATH, Db_Info.DB_USER, Db_Info.DB_PASSWD);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			// } catch (IOException e) {

		}
	}

	// Vector를 리턴해주도록 선언
	public Vector selectAll() {
		// method 아래에 변수 선언
		Vector dbList = new Vector(); // 1차원 배열이 일단 생성
		String sql = " SELECT * FROM buyer ";
		try {
			pSt = conn.prepareStatement(sql);
			ResultSet rs = pSt.executeQuery();

			while (rs.next()) {
				Vector d = new Vector();
				d.add(rs.getInt("회원번호"));
				d.add(rs.getString("이름"));
				d.add(rs.getString("키"));
				d.add(rs.getString("체중"));
				d.add(rs.getString("골격근량"));
				d.add(rs.getString("근육량"));
				d.add(rs.getString("체지방량"));
				d.add(rs.getString("남"));
				d.add(rs.getString("여"));
				d.add(rs.getString("BMI"));
				d.add(rs.getString("체지방률"));
				
				// dbList 1차원 배열(백터)에 또하나의 배열을 추가
				dbList.add(d);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// dbList를 호출한 곳으로 보내준다.
		return dbList;

	}

	static class Db_Info {
		static public final String DB_DRIVER = "org.gjt.mm.mysql.Driver";
		static public String DB_PATH = "jdbc:mysql://localhost/bitdb?useSSL=false";
		static public String DB_USER = "root";
		static public String DB_PASSWD = "!BitCom0228";
	}

}

