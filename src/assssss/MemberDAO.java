package assssss;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class MemberDAO {

	Connection conn = null;
	PreparedStatement pSt = null;

	public MemberDAO() {
		try {
			// 드라이버 로딩
			Class.forName("org.gjt.mm.mysql.Driver");

			// 연결 설정
			conn = DriverManager.getConnection("jdbc:mysql://localhost/bitdb?useSSL=false", "root", "!BitCom0228");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// CRUD 중 insert(creat)
	public int insert(MemberDTO dto) {

		int ret = 0;
		String sql = " INSERT INTO names " + " ( userid, username, userpw, usersex, usertel,useraddr ) "
				+ " values( ?,?, md5(?),?,?,? ); ";

		try {
			pSt = conn.prepareStatement(sql);
			pSt.setString(1, dto.getMemname());
			pSt.setString(2, dto.getMemid());
			pSt.setString(3, dto.getMempw1());
			pSt.setString(4, dto.getMemaddr());
			pSt.setString(5, dto.getMemtel());
			pSt.setString(6, dto.getMemgender());
			
			ret = pSt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} // sql을 서버에 전송해주고

		return ret;
	}
	public Vector selectAll() {

		Vector dbList = new Vector();
		String sql = " SELECT * FROM names ";
		try {
			pSt = conn.prepareStatement(sql);
			ResultSet rs = pSt.executeQuery();

			while (rs.next()) {
				Vector d = new Vector();
				d.add(rs.getInt("id"));
				d.add(rs.getString("username"));
				d.add(rs.getString("userid"));
				d.add(rs.getString("userpw"));
				d.add(rs.getString("useraddr"));
				d.add(rs.getString("usertel"));
				d.add(rs.getString("usergender"));
				d.add(rs.getString("userattend"));
				d.add(rs.getString("userenroll"));

				dbList.add(d);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return dbList;

	}
	
}
