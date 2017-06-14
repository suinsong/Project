package 완성;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class 추천식단9 extends JFrame {

	JPanel jform = new JPanel();
	JFrame jFr = new JFrame();
	
	public 추천식단9(){
			createUI();

		}
	
	public void createUI() {

		JPanel jpanel = new JPanel();
		jpanel.setLayout(new BorderLayout());
		JLabel jtitle = new JLabel("인바디 결과 회원님에게 추천하는 식단");

		// 제목 글자크기 변경
		jtitle.setFont(new Font("Gulim", Font.BOLD, 15));
		jtitle.setHorizontalAlignment(JLabel.CENTER);
		jpanel.add(jtitle);
		add(jpanel, "North");

		
		setTitle("추천식단");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		setSize(500, 500);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new 추천식단9();
	}

}
