// ------------------------------------------
// 나의 GUI 프로그램
// ------------------------------------------
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyApp extends JFrame{
	// 멤버 필드 --------------------------------------------
	private final String	ING_PATH="C:\\Users\\3P022\\eclipse-workspace\\3일차\\Img\\";
	private JTextField		msgTXF;
	private JButton			leftBTN,rightBTN,okBTN,saveBTN;
	private ActionListener	actionLST;
	private Container		con;
	private ArrayList<String>	arr;
	
	// 생성자 -----------------------------------------------
	public MyApp() {
		
		// Listener 생성
		actionLST = new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				String command = e.getActionCommand();
				System.out.println("Command : " + command);
				
			
				if(command.equals("RIGHT")) {
					// content 배경색 노란색
					con.setBackground(Color.yellow);
					arr.add("LEFT");
				}else if(command.equals("LEFT")) {
					// content 배경색 핑크색
					con.setBackground(Color.pink);
					arr.add("RIGHT");
				}else if(command.equals("OK")) {
					// JText필드 위의 글자를 읽어서 OK버튼위에 출력하기
					//okBTN.setText(msgTXF.getText());
					arr.add("OK");	
				}
			}
		};
		// component 생성
		msgTXF = new JTextField();
		msgTXF.setText("Enter messege");
		msgTXF.setBackground(Color.LIGHT_GRAY);
		
		leftBTN = new JButton("LEFT");
		leftBTN.addActionListener(actionLST);
		
		rightBTN = new JButton("RIGHT");
		rightBTN.addActionListener(actionLST);
		
		okBTN = new JButton("OK");
		okBTN.addActionListener(actionLST);
		
		saveBTN = new JButton(new ImageIcon(ING_PATH + "저장.png"));
		saveBTN.setRolloverIcon(new ImageIcon(ING_PATH + "돈돼지.png"));
		saveBTN.setBorderPainted(false);
		saveBTN.setContentAreaFilled(false);
		
		// Content 구성
		con = this.getContentPane();
		con.setLayout(new BorderLayout(30,30));
		
		con.add(msgTXF, BorderLayout.NORTH);
		con.add(leftBTN,BorderLayout.EAST);
		con.add(rightBTN,BorderLayout.WEST);
		con.add(okBTN,BorderLayout.SOUTH);
		con.add(saveBTN,BorderLayout.CENTER);
		// JFrame 설정
		this.setTitle("MY APP");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300,300);
		this.setVisible(true);
	}
	// 멤버 메소드 -------------------------------------------

	private ActionListener ActionListener() {
		// TODO Auto-generated method stub
		return null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			MyApp app = new MyApp();
	}

}
