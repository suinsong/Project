package 인바디;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.mysql.fabric.xmlrpc.base.Member;

public class 인바디정보8 extends JFrame {

	static 인바디정보8 iList; // 빈 객체 생성
	MemberDAO dao; // 빈 객체 생성
	JTable jtable;

	public 인바디정보8() {
		createUI();
	}

	// 화면을 그리는 메서드 별도 생성
	public void createUI() {
		setTitle("인바디");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setDefaultLookAndFeelDecorated(true);

		dao = new MemberDAO(); // DAO 초기화, 생성
		
		DefaultTableModel model 
			= new DefaultTableModel(dao.selectAll(), getColumnTitle()){
			public boolean isCellEditable(int row, int column){
				return false;
			}
		};
			
		jtable = new JTable(model);
		jtable.addMouseListener(new TableMouseClick());

		JScrollPane pane = new JScrollPane(jtable);

		JPanel jpanel = new JPanel();
		
		add(pane);
		add(jpanel, "South");

		setSize(800, 600);
		setLocationRelativeTo(null); // 창을 화면 중앙에 표시
		setVisible(true);

	}

	public Vector getColumnTitle() {
		Vector colName = new Vector();
		colName.add("회원번호");
		colName.add("이름");
		colName.add("키");
		colName.add("체중");
		colName.add("골격근량");
		colName.add("근육량");
		colName.add("체지방량");
		colName.add("남");
		colName.add("여");
		colName.add("BMI");
		colName.add("체지방률");

		return colName;
	}

	// DB가 변경되었을때 화면 Table을 갱신하기 위한 method
	public void jtableRefresh() {
		dao = new MemberDAO();
		DefaultTableModel model = new DefaultTableModel(dao.selectAll(), getColumnTitle());
		jtable.setModel(model); // Table 갱신하는 method
	}

	public static void main(String[] args) {
		iList = new 인바디정보8(); // mList변수를 초기화 시켜 놓는다
	}

	class TableMouseClick implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub

		}

	}
}

