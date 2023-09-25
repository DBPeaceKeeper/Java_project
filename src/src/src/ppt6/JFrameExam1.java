package src.ppt6;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JFrameExam1 {

	private JFrame frame;

	public JFrameExam1() {
		// 1) JFrame 객체 생성
		frame = new JFrame("JFrame 생성");

		// 2) JFrame 위치/크기 설정
		frame.setSize(600, 500);
		frame.setLocation(340,262);
		//frame.setLayout(new FlowLayout());
		frame.setLayout(new GridLayout(4,2));

		for(int i = 1; i <= 8; i++) {
			JButton button = new JButton("Button" + i);
			button.addActionListener(e -> {
					String actionCommand = e.getActionCommand();
					System.out.println(actionCommand);
			});
			frame.add(button);
		}

		// 4) 화면에 출력
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		/*
		 * borderlayout 위치별 버튼 생성
		String[] buttonText = {
				BorderLayout.NORTH,
				BorderLayout.SOUTH,
				BorderLayout.EAST,
				BorderLayout.WEST,
				BorderLayout.CENTER

		};

		JButton[] btn = new JButton[5];
		for(int i = 0; i < buttonText.length; i++) {
			btn[i] = new JButton(buttonText[i]);
			frame.add(btn[i], buttonText[i]);
		}
		 */

		/*
		 * 표
		Object[][] data = {
				{"홍길동", 30, "남자"},
				{"임꺽정", 25, "여자"},
				{"장길산", 27, "남자"},
		};

		String[] columns = {"이름", "나이", "성별"};

		DefaultTableModel tableModel = new DefaultTableModel(data,columns);

		JTable table = new JTable(tableModel);

		table.setEnabled(false);

		JScrollPane scrollPane = new JScrollPane(table);

		frame.add(scrollPane);
		 */

		/*
		 * 콤보박스
		String[] options = {"C", "C++", "Java"};
		JComboBox<String> comboBox = new JComboBox<>(options);
		frame.add(comboBox);
		 */

		/*
		 * 체크박스 
		String[] caption = {"C", "C++", "Java"};
		JCheckBox[] chkbox = new JCheckBox[caption.length];

		for(int i = 0; i < caption.length; i++) {
			chkbox[i] = new JCheckBox(caption[i]);
			frame.add(chkbox[i]);
		}
		 */

		/*
		 * 라디오 버튼
		String[] caption = {"C", "C++", "Java"};
		JRadioButton[] radio = new JRadioButton[caption.length];
		ButtonGroup radioGrp = new ButtonGroup();

		for(int i = 0; i < caption.length ; i++) {
			radio[i] = new JRadioButton(caption[i]);
			radioGrp.add(radio[i]);
			frame.add(radio[i]);
		}
		 */

		/*
		JMenuBar menuBar = new JMenuBar();


		JMenu fileMenu = new JMenu("파일(F)");
		JMenuItem newItem = new JMenuItem("새로만들기(N)");
		JMenuItem windowItem = new JMenuItem("새창(W)");
		JMenuItem openItem = new JMenuItem("열기(O)");
		JMenuItem saveItem = new JMenuItem("저장(S)");

		fileMenu.add(newItem);
		fileMenu.add(windowItem);
		fileMenu.add(openItem);
		fileMenu.addSeparator(); //구분선
		fileMenu.add(saveItem);

		JMenu editMenu = new JMenu("편집(E)");
		JMenu formatMenu = new JMenu("서식(O)");
		JMenu viewMenu = new JMenu("보기(V)");
		JMenu helpMenu = new JMenu("도움말(H)");

		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(formatMenu);
		menuBar.add(viewMenu);
		menuBar.add(helpMenu);

		frame.setJMenuBar(menuBar);



		JLabel label = new JLabel("JLabel");
		JTextField textField = new JTextField("JTextField");
		JButton button = new JButton("JButton");
		JTextArea textArea = new JTextArea("JTextArea");

		frame.add(label);
		frame.add(textField);
		frame.add(button);
		frame.add(textArea);


		// 루트노드
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("192.168.1.1");

		// 루트노드에 하위노드 추가
		DefaultMutableTreeNode ipsLog = new DefaultMutableTreeNode("DBMS 침입탐지 로그");
		DefaultMutableTreeNode searchLog = new DefaultMutableTreeNode("로그 조회");

		root.add(ipsLog);
		root.add(searchLog);

		ipsLog.add(new DefaultMutableTreeNode("기본 탐지 정책"));
		ipsLog.add(new DefaultMutableTreeNode("사용자 정의 정책"));

		searchLog.add(new DefaultMutableTreeNode("서비스 로그"));
		searchLog.add(new DefaultMutableTreeNode("기타"));

		JTree tree = new JTree(root);
		JScrollPane scrollPane = new JScrollPane(tree);

		frame.add(scrollPane);
		 */

	}

	public static void main(String[] args) {
		JFrameExam1 frame = new JFrameExam1();
		System.out.println("main end");
	}
}
