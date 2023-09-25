package src.ppt6;

import java.awt.GridLayout;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LogIn{
		
	private JFrame frame;
	private static HashMap<String, String> users = new HashMap<>();
	
	public LogIn() {
		frame = new JFrame("Login");
		
		frame.setSize(250, 200);
		frame.setLocationRelativeTo(null);
		
		frame.setLayout(new GridLayout(4,1));
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p4 = new JPanel();
		
		JLabel lb1 = new JLabel("Log in");
		JLabel lb2 = new JLabel("ID:       ");
		JLabel lb3 = new JLabel("PW:    ");
		
		JTextField tfID = new JTextField();
		JTextField tfPW = new JTextField();
		tfID.setColumns(10);
		tfPW.setColumns(10);
		
		JButton bt = new JButton("로그인");
		bt.addActionListener(e ->{
			String id = tfID.getText();
			String pw = tfPW.getText();
			if(users.containsKey(id)) {
				if(users.get(id).equals(pw)) {
					System.out.println("로그인 성공");
				}
				else {
					System.out.println("비밀번호가 틀렸습니다.");
				}
			}
			else {
				System.out.println("아이디가 존재하지 않습니다.");
			}
		});
		
		JButton bt2 = new JButton("회원가입");
		bt2.addActionListener(e ->{
			JFrame frame2 = new JFrame("회원가입");
			frame2.setLayout(new GridLayout(4,1));
			frame2.setSize(250,200);
			frame2.setLocationRelativeTo(null);
			
			JPanel p5 = new JPanel();
			JPanel p6 = new JPanel();
			JPanel p7 = new JPanel();
			JPanel p8 = new JPanel();
		
			JLabel lb4 = new JLabel("회원 정보를 입력하세요");
			JLabel lb5 = new JLabel("ID:       ");
			JLabel lb6 = new JLabel("PW:    ");
			
			JButton bt3 = new JButton("확인");
			
			JTextField JoinID = new JTextField();
			JTextField JoinPW = new JTextField();
			JoinID.setColumns(10);
			JoinPW.setColumns(10);

			
			
			p5.add(lb4);
			p6.add(lb5);
			p6.add(JoinID);
			p7.add(lb6);
			p7.add(JoinPW);
			p8.add(bt3);
			
			frame2.add(p5);
			frame2.add(p6);
			frame2.add(p7);
			frame2.add(bt3);
			
			frame2.setVisible(true);
			
			bt3.addActionListener(i -> {
				if(!users.containsKey(JoinID.getText())) {
					users.put(JoinID.getText(), JoinPW.getText());
					frame2.dispose();
				}
				else {
					System.out.println("이미 존재하는 ID입니다.");
				}
			});
			
		});
		
		
		p1.add(lb1);
		p2.add(lb2);
		p2.add(tfID);
		p3.add(lb3);
		p3.add(tfPW);
		p4.add(bt);
		p4.add(bt2);
		
		frame.add(p1);
		frame.add(p2);
		frame.add(p3);
		frame.add(p4);
		
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		users.put("user", "1111");
		users.put("admin","1234");
		
		new LogIn();
	}
	
}
