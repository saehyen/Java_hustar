import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class MyFrame extends JFrame implements ActionListener{
	public MyFrame() {
		// 타이틀 지정
		this.setTitle(" 300X300 프레임");
		// 크기 지정
		this.setSize(300,300);
		// 전체화면
		
		//this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		// 창을 끄면 종료
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		
		c.setBackground(Color.black);
//		c.setLayout(new GridLayout());
//		c.setLayout(new BorderLayout());
//		c.setLayout(new CardLayout());
		c.setLayout(new FlowLayout(FlowLayout.CENTER));
		
//		c.add(new JButton("OK"));
//		c.add(new JButton("Cancel"));
//		c.add(new JButton("Ignore"));
		
		
		
		c.setLayout(new BorderLayout(30,20));
		c.add(new JButton("add"), BorderLayout.NORTH);
		c.add(new JButton("sub"), BorderLayout.SOUTH);
		c.add(new JButton("mul"), BorderLayout.EAST);
		c.add(new JButton("div"), BorderLayout.WEST);
		
		
		//보이게 하는 기능
		
		this.setVisible(true);
		
	}
	class MyActionListenner implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			System.out.println("클릭");
		}
	}
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
	
	}
}

