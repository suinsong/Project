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
import 부위별.부위별;
import 실시간운동기구.실시간운동기구;
import 인바디.인바디정보8;

public class 회원메뉴10 extends JFrame {

	JPanel jp = new JPanel();

	public 회원메뉴10() {

		setTitle("MENU");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Font font = new Font("Gulim", Font.BOLD, 20);
		Color backColor = Color.WHITE;

		JLabel label = new JLabel("회원용 메뉴");

		label.setFont(font);
		label.setHorizontalAlignment(JLabel.CENTER);
		add(label, "North");

		jp.setBackground(backColor);
		jp.setFont(font);

		jp.add(new JLabel("원하시는 버튼을 눌러주십시오"));

		JButton bt1 = new JButton("기본인적사항");
		bt1.setFont(new Font("Gulim", Font.BOLD, 15));
		OkClick1 oc1 = new OkClick1();
		bt1.addActionListener(oc1);
		bt1.setSize(160, 100);
		bt1.setLocation(60, 150);

		JButton bt2 = new JButton("출석관리");
		bt2.setFont(new Font("Gulim", Font.BOLD, 15));
		OkClick2 oc2 = new OkClick2();
		bt2.addActionListener(oc2);
		bt2.setSize(160, 100);
		bt2.setLocation(230, 150);

		JButton bt3 = new JButton("인바디");
		OkClick3 oc3 = new OkClick3();
		bt3.addActionListener(oc3);
		bt3.setFont(new Font("Gulim", Font.BOLD, 15));
		bt3.setSize(160, 100);
		bt3.setLocation(400, 150);

		JButton bt4 = new JButton("추천식단");
		OkClick4 oc4 = new OkClick4();
		bt4.addActionListener(oc4);
		bt4.setFont(new Font("Gulim", Font.BOLD, 15));
		bt4.setSize(160, 100);
		bt4.setLocation(570, 150);

		JButton bt5 = new JButton("부위별운동");
		OkClick5 oc5 = new OkClick5();
		bt5.addActionListener(oc5);
		bt5.setFont(new Font("Gulim", Font.BOLD, 15));
		bt5.setSize(160, 100);
		bt5.setLocation(310, 350);

		JButton bt6 = new JButton("헬스장 이용인원");
		OkClick6 oc6 = new OkClick6();
		bt6.addActionListener(oc6);
		bt6.setFont(new Font("Gulim", Font.BOLD, 15));
		bt6.setSize(200, 100);
		bt6.setLocation(80, 350);

		JButton bt7 = new JButton("운동기구 사용현황");
		OkClick7 oc7 = new OkClick7();
		bt7.addActionListener(oc7);
		bt7.setFont(new Font("Gulim", Font.BOLD, 15));
		bt7.setSize(200, 100);
		bt7.setLocation(500, 350);

		add(bt1);
		add(bt2);
		add(bt3);
		add(bt4);
		add(bt5);
		add(bt6);
		add(bt7);

		add(jp);

		setSize(800, 600);
		setVisible(true);
		setLocationRelativeTo(null);

	}

	class OkClick1 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			new 상세정보11();
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

	class OkClick5 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			new 부위별();
		}
	}

	class OkClick6 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			new 상세정보11();
		}
	}

	class OkClick7 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			new 실시간운동기구();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new 회원메뉴10();
	}

}
