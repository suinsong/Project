package 실시간운동기구;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class hDAO {

	Connection conn;
	PreparedStatement pSt;

	public hDAO() {
		try {
			Class.forName(Db_Info.DB_DRIVER);
			conn = DriverManager.getConnection(Db_Info.DB_PATH, Db_Info.DB_USER, Db_Info.DB_PASSWD);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}

	public hDTO selectByid(int id){
		String sql =  " SELECT * FROM htable WHERE id = ?" ;
		hDTO dto = new hDTO();
		try {
			pSt = conn.prepareStatement(sql);
			pSt.setInt(1, id);
			ResultSet rs = pSt.executeQuery();
			rs.next();
			
			dto.set운동기구(rs.getString("운동기구"));
			dto.set사용여부(rs.getString("사용여부"));

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dto;
	}

	// Vector를 리턴해주도록 선언
	public Vector selectAll() {
		// method 아래에 변수 선언
		Vector dbList = new Vector(); // 1차원 배열이 일단 생성
		String sql = " SELECT * FROM htable ";
		try {
			pSt = conn.prepareStatement(sql);
			ResultSet rs = pSt.executeQuery();

			while (rs.next()) {
				Vector d = new Vector();
				d.add(rs.getString("운동기구")); // int형
				d.add(rs.getString("사용여부")); // String
				
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

