package lesson06;

import javax.swing.*;
import java.awt.*;

public class TestTextDemo01 extends JFrame {
    public TestTextDemo01()  {
        Container container = this.getContentPane();
        JTextField textField = new JTextField("hello");
        JTextField textField1 = new JTextField("world",20);
        container.add(textField,BorderLayout.NORTH);
        container.add(textField1,BorderLayout.SOUTH);
        this.setVisible(true);
        this.setSize(500,350);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TestTextDemo01();
    }
}
