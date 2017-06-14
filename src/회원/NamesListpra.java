package 회원;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
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

public class NamesListpra extends JFrame {// 관리자가 보는 회원 리스트

	static NamesListpra nList;
	NamesDAO dao;
	JTable jtable;
	JPanel jp = new JPanel();

	public NamesListpra() {
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
		btnUpdate.addActionListener(new Update());

		JButton btnDelete = new JButton("삭제");
		btnDelete.addActionListener(new Delete());

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

	class Update implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			new BtnUpdate();

		}

	}

	class Delete implements ActionListener {

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

	public void updateGui() {
		JFrame frame = new JFrame("수정 할 정보 입력");
		JPanel jp = new JPanel();
		JButton btn = new JButton();

		JTextField txtid = new JTextField(10);
		JTextField txtpw = new JTextField(20);
		JTextField txtaddr = new JTextField(20);
		JTextField txttel = new JTextField(20);
		int Align = JLabel.RIGHT;
		Color backColor = Color.WHITE;

		setTitle(" 회 원 수 정 ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel label = new JLabel("회 원 수 정 창 ");
		Font font = new Font("Gulim", Font.BOLD, 30);

		label.setFont(font);
		label.setHorizontalAlignment(JLabel.CENTER);
		add(label, "North");

		jp.setLayout(new GridLayout(5, 4));
		jp.setBackground(backColor);
		JLabel lbText = new JLabel("ID", Align);
		jp.add(lbText);

		Font txtFont = new Font("Gulim", Font.PLAIN, 20);
		txtid.setFont(txtFont);
		jp.add(txtid);
		jp.add(new JLabel());

		lbText = new JLabel("비밀번호", Align);
		jp.add(lbText);
		txtpw.setFont(txtFont);
		jp.add(txtpw);
		jp.add(new JLabel());

		lbText = new JLabel("전화번호", Align);
		jp.add(lbText);
		txttel.setFont(txtFont);
		jp.add(txttel);
		jp.add(new JLabel());

		lbText = new JLabel("주소", Align);
		jp.add(lbText);
		txtaddr.setFont(txtFont);
		jp.add(txtaddr);
		jp.add(new JLabel());

		add(jp, "Center");

		JButton bb = new JButton("수정완료");
		add(bb, "South");

		setSize(300, 300);
		setLocationRelativeTo(null);
		setVisible(true);
		pack();

	}

	public static void main(String[] args) {
		nList = new NamesListpra();
	}

}