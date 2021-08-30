import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class View {
    JFrame jframe = new JFrame();
    JPanel jpanel = new JPanel();
    JTextField t1 = new JTextField();
    JTextField t2 = new JTextField();
    JTextField t3 = new JTextField();
    JTextField t4 = new JTextField();
    JTextArea ta = new JTextArea();
    JButton btn1, btn2, btn3, btn4, btn5;
    JLabel ㅣ1 = new JLabel("제품명 : ");
    JLabel ㅣ2 = new JLabel("가격 : ");
    JLabel ㅣ3 = new JLabel("남은개수 : ");
    JLabel ㅣ4 = new JLabel("검색내용 : ");

    View() {
        GUI_init();
    }

    public void GUI_init() {
        jframe.setTitle("상품관리");
        jframe.setBounds(50, 50, 480, 450);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setVisible(true);
        jpanel.setLayout(null);
        jframe.add(jpanel);

        t1.setBounds(85, 25, 70, 25);
        jpanel.add(t1);
        ㅣ1.setBounds(37, 21, 70, 30);
        jpanel.add(ㅣ1);

        t2.setBounds(213, 25, 70, 25);
        jpanel.add(t2);
        ㅣ2.setBounds(170, 21, 70, 30);
        jpanel.add(ㅣ2);

        t3.setBounds(352, 25, 80, 25);
        jpanel.add(t3);
        ㅣ3.setBounds(290, 21, 70, 30);
        jpanel.add(ㅣ3);

        t4.setBounds(213, 105, 80, 25);
        jpanel.add(t4);
        ㅣ4.setBounds(150, 100, 70, 30);
        jpanel.add(ㅣ4);

        JScrollPane jsp = new JScrollPane(ta);
        jsp.setBounds(23, 145, 420, 250);
        jpanel.add(jsp);

        jpanel.add(btn1 = new JButton("등록하기"));
        btn1.setBounds(40, 60, 90, 30);

        jpanel.add(btn2 = new JButton("전체보기"));
        btn2.setBounds(145, 60, 90, 30);

        jpanel.add(btn3 = new JButton("수정하기"));
        btn3.setBounds(250, 60, 90, 30);

        jpanel.add(btn4 = new JButton("삭제하기"));
        btn4.setBounds(350, 60, 90, 30);

        jpanel.add(btn5 = new JButton("검색하기"));
        btn5.setBounds(300, 100, 90, 30);

        Controller dao = new Controller();


        // 상품 추가
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                ta.setText("");

                String price = t1.getText();
                String name = t2.getText();
                String num = t3.getText();

                dao.insertitem(new Model(price, name, num));
                ta.setText("");
                ArrayList<Model> arr = new ArrayList<Model>();
                arr = dao.readitem();

                ta.append("\t" + "상품명" + "\t" + "가격" + "\t" + "수량\n");
                ta.append("\t" + "------------------------------------------------------------\n");

                for (int i = 0; i < arr.size(); i++) {
                    ta.append("\t" + arr.get(i).getprice() + " \t " + arr.get(i).getname() + " \t " + arr.get(i).getnum()
                            + "\n");
                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
            }
        }});

        // 상품 목록 출력
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                ta.setText("");
                ArrayList<Model> arr = new ArrayList<Model>();
                arr = dao.readitem();

                ta.append("\t" + "상품명" + "\t" + "가격" + "\t" + "수량\n");
                ta.append("\t" + "------------------------------------------------------------\n");

                for (int i = 0; i < arr.size(); i++) {
                    ta.append("\t" + arr.get(i).getprice() + " \t " + arr.get(i).getname() + " \t " + arr.get(i).getnum()
                            + "\n");
                }
            }
        });

        // 상품 수정
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                ta.setText("");

                String price = t1.getText();
                String name = t2.getText();
                String num = t3.getText();

                dao.updateitem(price, num, name);
                ArrayList<Model> arr = new ArrayList<Model>();
                arr = dao.readitem();

                ta.append("\t" + "상품명" + "\t" + "가격" + "\t" + "수량\n");
                ta.append("\t" + "------------------------------------------------------------\n");

                for (int i = 0; i < arr.size(); i++) {
                    ta.append("\t" + arr.get(i).getprice() + " \t " + arr.get(i).getname() + " \t " + arr.get(i).getnum()
                            + "\n");
                }

                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
            }
        });

        // 상품 삭제
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                ta.setText("");

                String name = t1.getText();
                dao.deleteitem(name);
                ArrayList<Model> arr = new ArrayList<Model>();
                arr = dao.readitem();

                ta.append("\t" + "상품명" + "\t" + "가격" + "\t" + "수량\n");
                ta.append("\t" + "------------------------------------------------------------\n");

                for (int i = 0; i < arr.size(); i++) {
                    ta.append("\t" + arr.get(i).getprice() + " \t " + arr.get(i).getname() + " \t " + arr.get(i).getnum()
                            + "\n");
                }

                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
            }
        });

        // 상품 검색
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                ta.setText("");
                String content = t4.getText();

                ArrayList<Model> arr = new ArrayList<Model>();
                arr = dao.searchitem(content);
                ta.append(" \n");

                ta.append("\t" + "상품명" + "\t" + "가격" + "\t" + "수량\n");
                ta.append("\t" + "------------------------------------------------------------\n");

                for (int i = 0; i < arr.size(); i++) {
                    ta.append("\t" + arr.get(i).getprice() + " \t " + arr.get(i).getname() + " \t " + arr.get(i).getnum()
                            + "\n");
                }
                
                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
            }
        });
    }
}