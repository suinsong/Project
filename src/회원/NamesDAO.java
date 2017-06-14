package 회원;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class NamesDAO {

	Connection conn;
	PreparedStatement ps;
	ResultSet rs;

	public Connection getConnect() {
		String url = "jdbc:mysql://localhost/bitdb?useSSL=false";
		String user = "root";
		String passwd = "!BitCom0228";

		try {
			Class.forName("org.gjt.mm.mysql.Driver");
			conn = DriverManager.getConnection(url, user, passwd);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;	}

	// --------------------------------------------------------------------------------
	// create ====INSERT
	public int NamesInsert(NamesVO vo) {
		conn = getConnect();

		String sql = "insert into Names values(?,?,?,?,?,?,?,?,?,?) ";
		int cnt = -1;

		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, vo.get회원번호());
			ps.setString(2, vo.get이름());
			ps.setString(3, vo.getID());
			ps.setString(4, vo.get비밀번호());
			ps.setString(5, vo.get전화번호());
			ps.setString(6, vo.get주소());
			ps.setString(7, vo.get성별());
			ps.setString(8, vo.get출석횟수());
			ps.setString(9, vo.get등록기간());
			ps.setString(10, vo.get등급());

			cnt = ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cnt;
	}

	// -----------------------------------------------------------------------
	// UPDATE
	public int NamesUpdate(NamesVO vo) {
		conn = getConnect();

		String sql = " update Names set ID=?, 비밀번호=?, 전화번호=?, 주소=? where 이름=? ";
		int cnt = -1;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getID());
			ps.setString(2, vo.get비밀번호());
			ps.setString(3, vo.get전화번호());
			ps.setString(4, vo.get주소());
			ps.setString(5, vo.get이름());

			cnt = ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cnt;
	}

	// -----------------------------------------------------------
	// DELETE

	public int NamesDelete(String 이름) {
		conn = getConnect();

		String sql = " delete from Names where 이름=? ";

		int cnt = -1;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, 이름);
			cnt = ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cnt;
	}

	// ----------------------------------------------------------------------
	// SELECT
	// READ : memList

	public List<NamesVO> nList() {
		conn = getConnect();

		String sql = " select * from mtbl ";
		List<NamesVO> list = new ArrayList<NamesVO>();

		int cnt = -1;

		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				int 회원번호 = rs.getInt("회원번호");
				String 이름 = rs.getString("이름");
				String ID = rs.getString("ID");
				String 비밀번호 = rs.getString("비밀번호");
				String 전화번호 = rs.getString("전화번호");
				String 주소 = rs.getString("주소");
				String 성별 = rs.getString("성별");
				String 출석횟수 = rs.getString("출석횟수");
				String 등록기간 = rs.getString("등록기간");
				String 등급 = rs.getString("등급");

				NamesVO vo = new NamesVO(회원번호, 이름, ID, 비밀번호, 전화번호, 주소, 성별, 출석횟수, 등록기간, 등급);
				list.add(vo);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	// ----------------------------------------------------------------------
	// 회원 이름으로 회원리스트찾기1

	public List<NamesVO> nLikeList(String key) {
		conn = getConnect();

		String sql = " select * from Names where 이름 like ? ";
		List<NamesVO> list = new ArrayList<NamesVO>();

		int cnt = -1;

		try {
			ps = conn.prepareStatement(sql);

			ps.setString(1, "%" + key + "%"); // 키가 들어가있는 모든것

			rs = ps.executeQuery();
			while (rs.next()) {
				int 회원번호 = rs.getInt("회원번호");
				String 이름 = rs.getString("이름");
				String ID = rs.getString("ID");
				String 비밀번호 = rs.getString("비밀번호");
				String 전화번호 = rs.getString("전화번호");
				String 주소 = rs.getString("주소");
				String 성별 = rs.getString("성별");
				String 출석횟수 = rs.getString("출석횟수");
				String 등록기간 = rs.getString("등록기간");
				String 등급 = rs.getString("등급");
				NamesVO vo = new NamesVO(회원번호, 이름, ID, 비밀번호, 전화번호, 주소, 성별, 출석횟수, 등록기간, 등급);

				list.add(vo);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	// -----------------------------------------------------------------------
	// 이름으로 회원찾기2

	public NamesVO nByName(String 이름search) {
		conn = getConnect();

		String sql = " select * from mtbl where mname = ? ";

		int cnt = -1;
		NamesVO vo = null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, 이름search);
			rs = ps.executeQuery();
			if (rs.next()) {
				int 회원번호 = rs.getInt("회원번호");
				String 이름 = rs.getString("이름");
				String ID = rs.getString("ID");
				String 비밀번호 = rs.getString("비밀번호");
				String 전화번호 = rs.getString("전화번호");
				String 주소 = rs.getString("주소");
				String 성별 = rs.getString("성별");
				String 출석횟수 = rs.getString("출석횟수");
				String 등록기간 = rs.getString("등록기간");
				String 등급 = rs.getString("등급");
				vo = new NamesVO(회원번호, 이름, ID, 비밀번호, 전화번호, 주소, 성별, 출석횟수, 등록기간, 등급);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vo;
	}

	// ---------------------------------------------------------------------

	public Vector selectAll() {// 관리자가 보는 회원리스트
		conn = getConnect();
		Vector data = new Vector();

		String sql = " SELECT * FROM names ";

		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {

				Vector row = new Vector();
				row.add(rs.getInt("회원번호"));
				row.add(rs.getString("이름"));
				row.add(rs.getString("ID"));
				row.add(rs.getString("비밀번호"));
				row.add(rs.getString("전화번호"));
				row.add(rs.getString("주소"));
				row.add(rs.getString("성별"));
				row.add(rs.getString("출석횟수"));
				row.add(rs.getString("등록기간"));
				row.add(rs.getString("등급"));

				data.add(row);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;

	}

}
