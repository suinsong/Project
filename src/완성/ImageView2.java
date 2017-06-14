package 완성;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import 회원.NamesList5;


public class ImageView2 extends JFrame {

	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();

	public ImageView2() {

		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JFrame frame = new JFrame("project");

		Container contentPane = frame.getContentPane();

		ImageIcon img1 = new ImageIcon("C//Users//송수인//Desktop//4.jpg");
		JLabel ImgBox1 = new JLabel(img1);

		JButton btn1 = new JButton("회원등록");
		btn1.addActionListener(new BtnInsert());

		JButton btn2 = new JButton("회원검색");
		btn2.addActionListener(new BtnSearch());

		JButton btn3 = new JButton("회원관리");
		btn3.addActionListener(new BtnMan());

		panel1.setLayout(new BoxLayout(panel1, BoxLayout.X_AXIS));
		panel1.add(btn1, "North");
		panel1.add(btn2, " Center");
		panel1.add(btn3, "South");

		
		
		contentPane.add(panel1, BorderLayout.SOUTH);

		panel2.add(ImgBox1);
		contentPane.add(panel2, BorderLayout.NORTH);

		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);

	}

	class BtnSearch implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			회원검색4 등록검색관리 = new 회원검색4();
			등록검색관리.setVisible(true);
		}

	}

	class BtnMan implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			new NamesList5();
		}

	}

	class BtnInsert implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			회원가입3 등록검색관리 = new 회원가입3();
			등록검색관리.setVisible(true);
		}
	}

	public static void main(String[] args) {
		new ImageView2();

	}

}
