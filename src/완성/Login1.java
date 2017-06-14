package 완성;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import 회원.NamesDTO;

public class Login1 extends JFrame {

	static ImageView2 admin;

	JFrame jFr = new JFrame();
	JPanel jPa = new JPanel();
	String[] mText = { "ID", "PW" };
	
	
	JTextField[] c = new JTextField[mText.length];
	JLabel jLa = new JLabel();

	public Login1() {
		jFr.setTitle("로그인");

		jPa.setLayout(null);

		JButton btn = new JButton("확인");
		btn.setSize(200, 50);
		btn.setLocation(430, 330);
		OkClick oc = new OkClick();
		btn.addActionListener(oc);
		jPa.add(btn);

		for (int i = 0; i < mText.length; i++) {
			jLa = new JLabel(mText[i]); // 레이블 생성
			jLa.setHorizontalAlignment(JLabel.RIGHT);
			jLa.setSize(100, 20);
			jLa.setLocation(100, 52 * (i + 3));
			jPa.add(jLa);

			c[i] = new JTextField(20);
			c[i].setSize(300, 50);
			c[i].setLocation(250, 49 * (i + 3));
			jPa.add(c[i]);

		}

		jFr.add(jPa);
		jFr.setSize(800, 500);
		jFr.setVisible(true);
		jFr.setLocationRelativeTo(null);

	}

	int ck=0;
	class OkClick implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			NamesDTO dto = new NamesDTO();
			if (dto.get등급() == "1") {

				JOptionPane.showMessageDialog(jFr, "관리자님 입실 완료되었습니다. " + "\n" + "00 헬스 클럽에 오신 것을 환영합니다");
				new ImageView2();

			} else if(ck==0) {
				JOptionPane.showMessageDialog(jFr, "입실이 완료되었습니다. " + "\n" + "00 헬스 클럽에 오신 것을 환영합니다");
				ck=1;
				new 회원메뉴10();
			}else{
				JOptionPane.showMessageDialog(jFr, "퇴실이 완료되었습니다. " +"\n" + "00 헬스 클럽을 이용해 주셔서 감사합니다"); 
				ck=0; 
				 
			}
		}
	}

			/*
			 * if (ck == 0) { JOptionPane.showMessageDialog(jFr, "입실이 완료되었습니다. "
			 * + "\n" + "00 헬스 클럽에 오신 것을 환영합니다"); ck = 1;
			 * 
			 * } else { JOptionPane.showMessageDialog(jFr, "퇴실이 완료되었습니다. " +
			 * "\n" + "00 헬스 클럽을 이용해 주셔서 감사합니다"); } new ImageView(); }
			 */

	public static void main(String[] args) {
		new Login1();

	}
}
