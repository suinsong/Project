package time;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;


public class TimeDAO {
	static Connection conn;
	static PreparedStatement pSt;

	public TimeDAO() {
		try {
			Class.forName(Db_Info.DB_DRIVER);
			conn = DriverManager.getConnection(Db_Info.DB_PATH, Db_Info.DB_USER, Db_Info.DB_PASSWD);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Vector timeall() {
		Vector dbList = new Vector();
		String sql = " select * from time_table ";
		try {
			pSt = conn.prepareStatement(sql);
			ResultSet rs= pSt.executeQuery();
		
			while(rs.next()){
				Vector d = new Vector();
				d.add(rs.getInt("date"));
				d.add(rs.getString("IN"));
				d.add(rs.getString("OUT"));
				d.add(rs.getString("todaytotal"));
				d.add(rs.getString("totaltime"));
				d.add(rs.getString("totalattned"));
			
				dbList.add(d);
			}
				
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dbList;
	}

	
	public static int insert(TimeDTO dto) {
		int ret = 0;
		String sql = " INSERT INTO time_table ";
		sql += " (date, IN, OUT, todaytotal, totaltime, totalattend ) ";
		sql += " values ( ?,?,?,?,?,?) ";

		try {
			pSt = conn.prepareStatement(sql);
			pSt.setString(1, dto.getDate());
			pSt.setString(2, dto.getIN());
			pSt.setString(3, dto.getOUT());
			pSt.setString(4, dto.getTodaytotal());
			pSt.setString(5, dto.getTotaltime());
			pSt.setString(6, dto.getTotalattend());

			ret = pSt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ret;
	}

	static class Db_Info {
		static public final String DB_DRIVER = "org.gjt.mm.mysql.Driver";
		static public String DB_PATH = "jdbc:mysql://localhost/bitdb?useSSL=false";
		static public String DB_USER = "root";
		static public String DB_PASSWD = "!BitCom0228";
	}

}
