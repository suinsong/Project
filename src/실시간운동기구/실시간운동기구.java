package 실시간운동기구;

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

public class 실시간운동기구 extends JFrame {

	static 실시간운동기구 tList; // 빈 객체 생성
	hDAO dao; // 빈 객체 생성
	JTable jtable;

	public 실시간운동기구() {
		createUI();
	}

	// 화면을 그리는 메서드 별도 생성
	public void createUI() {
		setTitle("운동기구 사용현황");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setDefaultLookAndFeelDecorated(true);

		dao = new hDAO(); // DAO 초기화, 생성
		
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

		setLocationRelativeTo(null);
		setVisible(true);
		pack();
	}

	public Vector getColumnTitle() {
		Vector colName = new Vector();
		colName.add("운동기구");
		colName.add("사용여부");

		return colName;
	}

	public void jtableRefresh() {
		dao = new hDAO();
		DefaultTableModel model = new DefaultTableModel(dao.selectAll(), getColumnTitle());
		jtable.setModel(model); // Table 갱신하는 method
	}

	public static void main(String[] args) {
		tList = new 실시간운동기구(); 
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

