package 회원;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BtnUpdate extends JFrame {

	JPanel jp = new JPanel();
	JButton btn = new JButton();

	JTextField txtid = new JTextField(10);
	JTextField txtpw = new JTextField(20);
	JTextField txtaddr = new JTextField(20);
	JTextField txttel = new JTextField(20);

	public BtnUpdate() {
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
		bb.addActionListener(new updatedone());
		add(bb, "South");

		setSize(300, 300);
		setLocationRelativeTo(null);
		setVisible(true);
		pack();

	}

	class updatedone implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {

		}
	}

	public void main(String[] args) {

		new BtnUpdate();
	}

}
