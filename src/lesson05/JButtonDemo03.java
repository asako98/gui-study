package lesson05;


import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class JButtonDemo03 extends JFrame {
    public JButtonDemo03()  {
        Container container = this.getContentPane();
        //将一个图片变为图标
        URL resource = JButtonDemo03.class.getResource("test2.jpg");
        Icon icon = new ImageIcon(resource);
        //多选框
        JCheckBox checkBox01 = new JCheckBox("checkBox01");
        JCheckBox checkBox02 = new JCheckBox("checkBox02");
        container.add(checkBox01,BorderLayout.NORTH);
        container.add(checkBox02,BorderLayout.SOUTH);

        this.setVisible(true);
        this.setSize(500,300);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
       new JButtonDemo03();
    }
}
