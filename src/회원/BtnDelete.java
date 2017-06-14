package 회원;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import 회원.BtnUpdate.updatedone;

public class BtnDelete extends JFrame {

	JPanel jp = new JPanel();
	JButton btn = new JButton();

	JTextField txtid = new JTextField(10);
	JTextField txtpw = new JTextField(20);
	
	NamesDAO dao= new NamesDAO();

	public BtnDelete() {
		int Align = JLabel.RIGHT;
		Color backColor = Color.WHITE;

		setTitle(" 회 원 삭 제 ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel label = new JLabel("회 원 삭 제 창 ");
		Font font = new Font("Gulim", Font.BOLD, 30);

		label.setFont(font);
		label.setHorizontalAlignment(JLabel.CENTER);
		add(label, "North");

		jp.setLayout(new GridLayout(2, 2));
		jp.setBackground(backColor);
		JLabel lbText = new JLabel(" 삭제할 ID : ", Align);
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

		add(jp, "Center");

		JButton bb = new JButton(" 삭 제 완 료 ");
		bb.addActionListener(new Deletedone());
		add(bb, "South");

		setSize(150, 150);
		setLocationRelativeTo(null);
		setVisible(true);
		pack();

	}

	
	class Deletedone implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			dao.NamesDelete(getName());
		}
		
		
	}
	
	
	
	
	public void main(String[] args) {

		new BtnDelete();
	}

}
