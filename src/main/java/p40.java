import javax.swing.*;
import java.awt.*;

public class p40 {
    static class MyGUI extends JFrame implements Runnable {

        JProgressBar bar1, bar2, bar3;

        MyGUI() {
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setTitle("스레드 응용");

            this.setLayout(new GridLayout(3, 1, 10, 10));

            bar1 = new JProgressBar();
            bar1.setValue(50);
            bar1.setStringPainted(true);
            bar2 = new JProgressBar();
            bar2.setValue(10);
            bar2.setForeground(Color.red);
            bar2.setStringPainted(true);
            bar3 = new JProgressBar();
            bar3.setValue(30);
            bar3.setForeground(Color.green);
            bar3.setStringPainted(true);

            MyGUI.this.add(bar1);
            MyGUI.this.add(bar2);
            MyGUI.this.add(bar3);
            setSize(512, 256);
            setVisible(true);
        }

        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                try {
                    Thread.sleep(100);
                    bar1.setValue(bar1.getValue());
                    bar2.setValue(bar2.getValue());
                    bar3.setValue(bar3.getValue());
                } catch (Exception e) {
                }
            }
        }
    }

    public static void main(String[] args) {
        MyGUI mygui = new MyGUI();
        Thread th = new Thread(mygui);
        th.start();
    }
}
