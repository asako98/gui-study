package lesson02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//简易计算器
public class TestCalc {
    public static void main(String[] args) {
       new Calculator();
    }
}
//计算器类
class Calculator extends Frame{
    //属性
    TextField num1,num2,num3;
    //方法
    public void loadFrame(){
        //3个文本框
         num1 =new TextField(10);//字符数
         num2 =new TextField(10);
         num3 =new TextField(20);
        //1个按钮
        Button button = new Button("=");
        button.addActionListener(new MyCalculatorListener(this));
        //1个标签
        Label label = new Label("+");
        //布局
        setLayout(new FlowLayout());
        add(num1);
        add(label);
        add(num2);
        add(button);
        add(num3);
        pack();//设置自适应性
        setVisible(true);
    }

}
//监听器类
class MyCalculatorListener implements ActionListener{
    //获得计算器这个对象,在一个类中组合另外一个类
    Calculator calculator = null;
    public MyCalculatorListener(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      //1、获得加数和被加数
         int n1=Integer.parseInt(calculator.num1.getText());
         int n2=Integer.parseInt(calculator.num2.getText());
        //2、将这个值加法运算后放到第三个框
         calculator.num3.setText(""+(n1+n2));
        //3、清空前两个框
        calculator.num1.setText("");
        calculator.num2.setText("");

    }
}