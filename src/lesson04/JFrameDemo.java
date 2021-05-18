package lesson04;

import javax.swing.*;
import java.awt.*;

public class JFrameDemo {
    public void init(){
        //顶级窗口
       JFrame jf= new JFrame("这是一个JFrame窗口");
       jf.setVisible(true);
       jf.setBounds(100,100,200,200);
       jf.setBackground(Color.blue);
       //设置文字
        JLabel label=new JLabel("哈哈哈");
        jf.add(label);
        //容器实例化

       //关闭事件
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        //建立一个窗口
        new JFrameDemo().init();
    }
}
