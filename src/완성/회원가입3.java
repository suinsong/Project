package 완성;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import assssss.MemberDTO;
import 회원.NamesDAO;
import 회원.NamesDTO;
import 회원.NamesList5;

public class 회원가입3 extends JFrame {

	NamesList5 mList;
	static 회원가입3 mForm;

	JPanel jp = new JPanel();
	JButton btn = new JButton();

	JTextField txtname = new JTextField(10);
	JTextField txtid = new JTextField(20);
	JPasswordField txtpw1 = new JPasswordField(20);
	JPasswordField txtpw2 = new JPasswordField(20);
	JTextField txtaddr = new JTextField(20);
	JTextField txttel = new JTextField(20);
	JTextField txtgender = new JTextField(20);
	JRadioButton rBtn1 = new JRadioButton("남자");
	JRadioButton rBtn2 = new JRadioButton("여자");
	
	public Object NamesDAO;

	public 회원가입3() {

		int Align = JLabel.RIGHT;
		Color backColor = Color.WHITE;

		setTitle(" 회 원 가 입 ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel label = new JLabel("회 원 가 입 창");
		Font font = new Font("Gulim", Font.BOLD, 30);

		label.setFont(font);
		label.setHorizontalAlignment(JLabel.CENTER);
		add(label, "North");

		jp.setLayout(new GridLayout(8, 3));
		jp.setBackground(backColor);

		JLabel lbText = new JLabel("이름", Align);
		jp.add(lbText);

		Font txtFont = new Font("Gulim", Font.PLAIN, 20);
		txtname.setFont(txtFont);
		jp.add(txtname);
		jp.add(new JLabel());

		lbText = new JLabel("ID", Align);
		jp.add(lbText);
		txtaddr.setFont(txtFont);
		jp.add(txtid);
		jp.add(new JLabel());

		lbText = new JLabel("PASSWORD", Align);
		jp.add(lbText);
		jp.add(txtpw1);
		jp.add(new JLabel());

		lbText = new JLabel("PASSWORD 확인 ", Align);
		jp.add(lbText);
		jp.add(txtpw2);
		jp.add(new JLabel());

		lbText = new JLabel("전화번호", Align);
		jp.add(lbText);
		jp.add(txttel);
		jp.add(new JLabel());

		lbText = new JLabel("주소", Align);
		jp.add(lbText);
		jp.add(txtaddr);
		jp.add(new JLabel());

		lbText = new JLabel("성별", Align);
		jp.add(lbText);
		JPanel bGrp = new JPanel();

		rBtn1.setBackground(backColor);
		rBtn2.setBackground(backColor);

		ButtonGroup rGrp = new ButtonGroup();
		rGrp.add(rBtn1);
		rGrp.add(rBtn2);

	
		bGrp.add(rBtn1);
		bGrp.add(rBtn2);
		bGrp.setBackground(backColor);

		jp.add(bGrp);
		jp.add(new JLabel());

		JButton btnJoin = new JButton("가입");
		btnJoin.addActionListener(new JoinAction());

		jp.add(new JLabel());
		jp.add(btnJoin);
		jp.add(new JLabel());

		add(jp, "Center");

		setLocationRelativeTo(null);
		setSize(800, 600);
		pack();
		setVisible(true);

	}

	class JoinAction implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {

			// 이름을 입력하지 않았으면
			if (txtname.getText().isEmpty()) {
				JOptionPane.showMessageDialog(jp, "이름은 필수항목입니다");
				txtname.requestFocus(true);
				return;
			}

			if (txtid.getText().isEmpty()) {
				JOptionPane.showMessageDialog(txtid, "회원ID는 필수항목입니다");
				txtid.requestFocus(true);
				return;
			}

			String strpw1 = new String(txtpw1.getPassword()); // 알수없는 값
			String strpw2 = new String(txtpw2.getPassword()); //

			if (txtpw1.getText().isEmpty()) {

				JOptionPane.showMessageDialog(jp, "비밀번호를 입력하세요");
				txtpw1.requestFocus(true);
				return;
			}
			if (txtpw2.getText().isEmpty()) {

				JOptionPane.showMessageDialog(jp, "비밀번호 확인을 입력하세요");
				txtpw2.requestFocus(true);
				return;
			}
			// 비밀번호입력과 확인 값이 서로 다르면
			if (!txtpw1.getText().equals(txtpw2.getText())) {

				JOptionPane.showMessageDialog(jp, "비밀번호 값이 다릅니다 확인하세요");
				txtpw1.setText(""); // TextFiel 내용을 삭제
				txtpw2.setText("");
				txtpw1.requestFocus(true);
				return;
			}

			if (txtaddr.getText().isEmpty()) {

				JOptionPane.showMessageDialog(jp, "주소를 입력하세요");
				txtaddr.requestFocus(true);
				return;
			}
			
			if (txttel.getText().isEmpty()) {

				JOptionPane.showMessageDialog(jp, "전화번호를 입력하세요");
				txttel.requestFocus(true);
				return;
			}
			
			// TextField에 입력한 값들을DTO에 복사
			NamesDTO dto = new NamesDTO();
			dto.setID(txtid.getText());
			dto.set이름(txtname.getText());
			// dto.setUserPw(new String(txtPw.getPassword()));
			dto.set비밀번호(strpw1);

			// 2개의 라디오 버튼 상태에 따라서 setUserSex값을 결정
			if (rBtn1.isSelected())
				dto.set성별("남자");// 남자가 선택
			if (rBtn2.isSelected())
				dto.set성별("여자");// 여자가 선택

			dto.set전화번호(txttel.getText());

			NamesDAO dao = new NamesDAO();
			if (dao.insert(dto) > 0) {
				JOptionPane.showMessageDialog(jp, "데이터가 정상적으로 추가 되었습니다");
				mList.jtableRefresh();
				dispose(); // 현재창 닫기
			}

		}

	}

	public static void main(String[] args) {
		new 회원가입3();
	}

}
