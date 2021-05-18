package lesson05;


import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class JButtonDemo01 extends JFrame {
    public JButtonDemo01()  {
        Container container = this.getContentPane();
        //将一个图片变为图标
        URL resource = JButtonDemo01.class.getResource("test2.jpg");
        Icon icon = new ImageIcon(resource);
        //把这个图标放在按钮上
        JButton button = new JButton();
        button.setIcon(icon);
        button.setToolTipText("图片按钮");
        container.add(button);
        this.setVisible(true);
        this.setSize(500,300);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
       new JButtonDemo01();
    }
}
