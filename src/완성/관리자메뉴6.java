package 완성;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import time.TimeList7;
import 인바디.인바디정보8;
import 회원.NamesList5;

public class 관리자메뉴6 extends JFrame {

	JPanel jp = new JPanel();

	public 관리자메뉴6() {

		setTitle(" 관 리 자  메 뉴 " );
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Font font = new Font("Gulim", Font.BOLD, 20);
		Color backColor = Color.WHITE;
		
		JLabel label = new JLabel("관리자용 메뉴");

		label.setFont(font);
		label.setHorizontalAlignment(JLabel.CENTER);
		add(label, "North");

		
		jp.setBackground(backColor);
		jp.setFont(font);

		JButton bt1 = new JButton("기본인적사항");
		bt1.setFont(new Font("Gulim", Font.BOLD, 30));
		bt1.setSize(250, 100);
		bt1.setLocation(100, 150);
		bt1.addActionListener(new OkClick1());

		JButton bt2 = new JButton("출석관리");
		bt2.setFont(new Font("Gulim", Font.BOLD,30));
		bt2.setSize(250, 100);
		bt2.setLocation(450, 150);
		bt2.addActionListener(new OkClick2());

		JButton bt3 = new JButton("인바디");
		bt3.setFont(new Font("Gulim", Font.BOLD, 30));
		bt3.setSize(250, 100);
		bt3.setLocation(100, 350);
		bt3.addActionListener(new OkClick3());

		JButton bt4 = new JButton("추천식단");
		bt4.setFont(new Font("Gulim", Font.BOLD, 30));
		bt4.setSize(250, 100);
		bt4.addActionListener(new OkClick4());

		bt4.setLocation(450, 350);

		add(bt1);
		add(bt2);
		add(bt3);
		add(bt4);

		add(jp);
	
		setSize(800, 600);
		setVisible(true);
		setLocationRelativeTo(null);
		
	}
	
	class OkClick1 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			new NamesList5();
		}
	}

	class OkClick2 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			new TimeList7();
		}
	}

	class OkClick3 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			new 인바디정보8();
		}
	}

	class OkClick4 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
		new 추천식단9();
		}
	}
	
	
	

	public static void main(String[] args) {
		new 관리자메뉴6();
	}

}
