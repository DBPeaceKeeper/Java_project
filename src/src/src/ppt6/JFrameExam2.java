package src.ppt6;

import javax.swing.JFrame;

public class JFrameExam2 extends JFrame {
	
	public JFrameExam2() {
		//부모의 생성자 호출(타이틀 설정)
		super("");
		setTitle("JFrame 상속");
		
		//위치, 크기 설정
		setBounds(340,312,600,400);
		
		// 윈도우(JFrame)이 닫힐 때의 동작 정의.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		JFrameExam2 frame = new JFrameExam2();
		System.out.println("End");
	}

}
