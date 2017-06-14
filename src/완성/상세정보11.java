package 완성;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import 회원.NamesDTO;

public class 상세정보11 extends JFrame {

	JPanel jp = new JPanel();
	JButton btn = new JButton();

	JLabel laname = new JLabel();
	JLabel laid = new JLabel();
	JLabel latel = new JLabel();
	JLabel laaddr = new JLabel();
	JLabel lagender = new JLabel();
	JLabel laattend = new JLabel();
	JLabel laenroll = new JLabel();

	
	NamesDTO dto = new NamesDTO();
	
	/*
	 * 
	 * JTextField txtname = new JTextField(10); 
	 * JTextField txtid = new JTextField(20); 
	 * JTextField txtaddr = new JTextField(20); 
	 * TextField  txttel = new JTextField(20);
	 * JTextField txtdate = new JTextField(20);
	 * JTextField txtgender = new JTextField(20);
	 */

	public 상세정보11() {

		int Align = JLabel.RIGHT;
		Color backColor = Color.WHITE;

		setTitle(" 상 세 정 보 ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel label = new JLabel("상 세 정 보");
		Font font = new Font("Gulim", Font.BOLD, 20);

		label.setFont(font);
		label.setHorizontalAlignment(JLabel.CENTER);
		add(label, "North");

		jp.setLayout(new GridLayout(8, 3));
		jp.setBackground(backColor);

		JLabel lbText = new JLabel("이름", Align);
		jp.add(lbText);

		Font txtFont = new Font("Gulim", Font.PLAIN, 20);
		jp.add(laname);
		jp.add(new JLabel());

		lbText = new JLabel("ID", Align);
		jp.add(lbText);
		jp.add(laid);
		jp.add(new JLabel());

		lbText = new JLabel("전화번호", Align);
		jp.add(lbText);
		laaddr.setFont(txtFont);
		jp.add(latel);
		jp.add(new JLabel());

		lbText = new JLabel("주소", Align);
		jp.add(lbText);
		jp.add(laaddr);
		jp.add(new JLabel());

		lbText = new JLabel("성별", Align);
		jp.add(lbText);
		jp.add(lagender);
		jp.add(new JLabel());

		lbText = new JLabel("출석횟수", Align);
		jp.add(lbText);
		jp.add(laattend);
		jp.add(new JLabel());

		lbText = new JLabel("등록기간", Align);
		jp.add(lbText);
		jp.add(laenroll);
		jp.add(new JLabel());

		jp.add(new JLabel());
		jp.add(new JLabel());

		add(jp, "Center");

		// 화면중앙에 띄우기
		setLocationRelativeTo(null);
		setSize(800, 600);
		// pack();
		setVisible(true);
		setLocationRelativeTo(null);

	}

	public static void main(String[] args) {
		new 상세정보11();

	}
}
