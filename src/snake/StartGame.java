package snake;


import javax.swing.*;

//游戏的主启动类
public class StartGame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(10,10,900,720);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //正常的游戏界面都应该在面板上
        frame.add(new GamePanel());
        frame.setVisible(true);
    }
}
