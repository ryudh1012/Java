import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ex13_14 {
    static class MyGUI4 extends JFrame{
        MyGUI4() {
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setTitle("메뉴 만들기");
            this.setLayout(new FlowLayout());

            JLabel lbl = new JLabel("이 글자가 바뀝니다");
            this.add(lbl);

            JMenuBar menuBar = new JMenuBar();

            JMenu fileMenu = new JMenu("파일");
            JMenu editMenu = new JMenu("편집");

            JMenuItem newItem = new JMenuItem("새 문서");
            JMenuItem openItem = new JMenuItem("열기");
            JMenuItem closeItem = new JMenuItem("닫기");

            setJMenuBar(menuBar);

            menuBar.add(fileMenu);
            menuBar.add(editMenu);

            fileMenu.add(newItem);
            fileMenu.add(openItem);
            fileMenu.addSeparator();
            fileMenu.add(closeItem);

            newItem.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    lbl.setText("[새 문서]를 선택했습니다.");
                }
            });

            openItem.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    lbl.setText("[열기]를 선택했습니다.");

                }
            });

            closeItem.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    System.exit(0);

                }
            });

            setSize(300, 200);
            setVisible(true);
        }
    }

    public static void main(String[] args){
        new MyGUI4();
    }
}
