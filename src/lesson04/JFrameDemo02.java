package lesson04;

import javax.swing.*;
import java.awt.*;

public class JFrameDemo02 {
    public static void main(String[] args) {
        new MyJframe2().init();
    }
}
class MyJframe2 extends JFrame{
    public void init(){
        this.setVisible(true);
        this.setBounds(10,10,200,300);
        JLabel label=new JLabel("哈哈哈");
        this.add(label);
        //让文本标签居中
        label.setHorizontalAlignment(SwingConstants.CENTER);
        //获得一个容器
        Container container = this.getContentPane();
        container.setBackground(Color.blue);
    }
}