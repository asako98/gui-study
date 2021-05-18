package lesson05;

import javax.swing.*;
import java.awt.*;

public class JPanelDemo extends JFrame {
    public JPanelDemo()  {
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(2,1,10,10));//后面两个参数是间距
        JPanel panel1 = new JPanel(new GridLayout(1,3));

        panel1.add(new JButton("1"));
        panel1.add(new JButton("1"));
        panel1.add(new JButton("1"));
        container.add(panel1);
        this.setVisible(true);
        this.setSize(500,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JPanelDemo();
    }
}
