package 완성;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import 회원.NamesDTO;

public class selectByid {

	static Connection conn;
	static PreparedStatement pSt;

	public selectByid() {
		try {
			Class.forName(Db_Info.DB_DRIVER);
			conn = DriverManager.getConnection(Db_Info.DB_PATH, Db_Info.DB_USER, Db_Info.DB_PASSWD);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public NamesDTO selectByid(int id) {// 이건 회원 찾기용... id로 검색해서 찾음
		String sql = " SELECT * FROM names WHERE id = ?";
		NamesDTO dto = new NamesDTO();
		try {
			pSt = conn.prepareStatement(sql);
			pSt.setInt(1, id);
			ResultSet rs = pSt.executeQuery();
			rs.next();

			dto.set회원번호(rs.getInt("회원번호"));
			dto.setID(rs.getString("이름"));
			dto.set비밀번호(rs.getString("ID"));
			dto.set이름(rs.getString("비밀번호"));
			dto.set전화번호(rs.getString("전화번호"));
			dto.set주소(rs.getString("주소"));
			dto.set성별(rs.getString("성별"));
			dto.set출석횟수(rs.getString("출석횟수"));
			dto.set등록기간(rs.getString("등록기간"));
			dto.set등급(rs.getString("등급"));

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dto;
	}


	static class Db_Info {
		static public final String DB_DRIVER = "org.gjt.mm.mysql.Driver";
		static public String DB_PATH = "jdbc:mysql://localhost/bitdb?useSSL=false";
		static public String DB_USER = "root";
		static public String DB_PASSWD = "!BitCom0228";
	}

}
