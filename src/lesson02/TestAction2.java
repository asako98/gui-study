package lesson02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestAction2 {
    public static void main(String[] args) {
        //两个按钮，实现同一个监听
        Frame frame = new Frame("开始-停止");
        Button button1 = new Button("start");
        Button button2 = new Button("stop");
        //可以显示的定义触发会返回的命令，如果不显示定义，则会走默认的值
        //这样可以实现多个按钮只写一个监听类
        button2.setActionCommand("button2-stop");
        MyMonitor myMonitor = new MyMonitor();
        button1.addActionListener(myMonitor);
        button2.addActionListener(myMonitor);
        frame.add(button1,BorderLayout.NORTH);
        frame.add(button2,BorderLayout.SOUTH);
        frame.pack();
        frame.setVisible(true);
    }
}
class MyMonitor implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("按钮被点击了：msg"+e.getActionCommand());
        if(e.getActionCommand().equals("start")){

        }
    }
}