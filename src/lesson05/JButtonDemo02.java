package lesson05;


import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class JButtonDemo02 extends JFrame {
    public JButtonDemo02()  {
        Container container = this.getContentPane();
        //将一个图片变为图标
        URL resource = JButtonDemo02.class.getResource("test2.jpg");
        Icon icon = new ImageIcon(resource);
        //单选框
        JRadioButton radioButton01 = new JRadioButton("RadioButton01");
        JRadioButton radioButton02 = new JRadioButton("RadioButton02");
        JRadioButton radioButton03 = new JRadioButton("RadioButton03");
        //由于单选框只能选一个，分组,一个组中只能选择一个
        ButtonGroup group = new ButtonGroup();
        group.add(radioButton01);
        group.add(radioButton02);
        group.add(radioButton03);
        container.add(radioButton01,BorderLayout.CENTER);
        container.add(radioButton02,BorderLayout.NORTH);
        container.add(radioButton03,BorderLayout.SOUTH);
        this.setVisible(true);
        this.setSize(500,300);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
       new JButtonDemo02();
    }
}
