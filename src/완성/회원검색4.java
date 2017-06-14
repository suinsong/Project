package 완성;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 회원검색4 {

	JFrame jFrame = new JFrame();

	public 회원검색4() {
		// 창의 제목을 설정
		jFrame.setTitle("회원검색");

		jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
		jFrame.setLayout(new FlowLayout());

		JLabel jLabel = new JLabel("회원 ID");
		jFrame.add(jLabel);

		JTextField txtBox = new JTextField(10);
		jFrame.add(txtBox);

		JButton btn = new JButton("찾기");
		OkClick1 oc1 = new OkClick1();
		btn.addActionListener(oc1);
		jFrame.add(btn);

		jFrame.setSize(300, 300); // 표시될 창의 크기 설정
		jFrame.setVisible(true); // 창을 표시 하라
		jFrame.setLocationRelativeTo(null);
	}

	class OkClick1 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			new selectByid();
		}
	}

	public static void main(String[] args) {
		new 회원검색4();
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub

	}
}
