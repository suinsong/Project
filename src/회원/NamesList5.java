package 회원;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import 회원.BtnUpdate.updatedone;

public class NamesList5 extends JFrame {// 관리자가 보는 회원 리스트

	static NamesList5 nList;
	NamesDAO dao;
	JTable jtable;
	JPanel jp = new JPanel();

	public NamesList5() {
		createUI();
	}

	public void createUI() {

		setTitle(" 회 원 목 록 ");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setDefaultLookAndFeelDecorated(true);

		dao = new NamesDAO();
		DefaultTableModel model = new DefaultTableModel(dao.selectAll(), getColumnTitle());
		jtable = new JTable(model);

		JScrollPane pane = new JScrollPane(jtable);

		JButton btnUpdate = new JButton("수정");
		btnUpdate.addActionListener(new BtnUpdate());

		JButton btnDelete = new JButton("삭제");
		btnDelete.addActionListener(new BtnDelete());

		JButton btnClose = new JButton("닫기");
		btnClose.addActionListener(new BtnClose());

		jp.add(btnUpdate);
		jp.add(btnDelete);
		jp.add(btnClose);

		add(pane);
		add(jp, "South");

		setSize(800, 600);
		setLocationRelativeTo(null); // 창을 화면 중앙에 표시
		setVisible(true);
		// pack();

	}

	public Vector getColumnTitle() {
		Vector colName = new Vector();
		colName.add("회원번호");
		colName.add("이름");
		colName.add("ID");
		colName.add("PW");
		colName.add("전화번호");
		colName.add("주소");
		colName.add("성별");
		colName.add("출석횟수");
		colName.add("등록기간");
		colName.add("등급");
		return colName;
	}

	// DB가 변경되었을때 화면 Table을 갱신하기 위한 method
	public void jtableRefresh() {
		dao = new NamesDAO();
		DefaultTableModel model = new DefaultTableModel(dao.selectAll(), getColumnTitle());
		jtable.setModel(model);
	}

	class BtnUpdate implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			
		}

	}

	class BtnDelete implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			new BtnDelete();

		}

	}

	class BtnClose implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			dispose();

		}
	}


	
	public static void main(String[] args) {
		nList = new NamesList5();
	}

}