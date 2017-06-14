package time;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class TimeList7 extends JFrame {

	static TimeList7 tList; // 빈 객체 생성
	TimeDAO dao; // 빈 객체 생성
	JTable jtable;

	public TimeList7() {
		createUI();
	}

	public void createUI() {

		setTitle(" 출 석 현 황 ");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setDefaultLookAndFeelDecorated(true);

		dao = new TimeDAO();
		DefaultTableModel model = new DefaultTableModel(dao.timeall(), getColumnTitle());
		jtable = new JTable(model);

		JScrollPane pane = new JScrollPane(jtable);

		JPanel jpanel = new JPanel();
		JButton btnClose = new JButton("닫기");
		btnClose.addActionListener(new BtnClose());

		jpanel.add(btnClose);

		add(pane);
		add(jpanel, "South");

		setSize(800, 400);
		setLocationRelativeTo(null); // 창을 화면 중앙에 표시
		setVisible(true);
		// pack();

	}

	public Vector getColumnTitle() {
		Vector colName = new Vector();
		colName.add("날짜");
		colName.add("IN");
		colName.add("OUT");
		colName.add("1일 운동시간");
		colName.add("누적 운동 시간");
		colName.add("출석횟수");

		return colName;
	}

	// DB가 변경되었을때 화면 Table을 갱신하기 위한 method
	public void jtableRefresh() {
		dao = new TimeDAO();
		DefaultTableModel model = new DefaultTableModel(dao.timeall(), getColumnTitle());
		jtable.setModel(model);
	}

	public static void main(String[] args) {
		tList = new TimeList7(); // mList변수를 초기화 시켜 놓는다
	}

	class BtnClose implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			dispose();
			
		}
	}
}