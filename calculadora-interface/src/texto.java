import java.awt.*;
import javax.swing.*;

class Calci{
    JFrame frame;
    JTextField screen;
    JButton nbtn[] = new JButton[10];
    JButton btnPlus, btnMinus, bntDiv, btnMult, btnZero, btn2Zero, btnEq, btnDec, btnAC, btnDel;

    public Calci(){

        frame = new JFrame();
        frame.setSize(400,500);
        frame.setLocationRelativeTo(null);
        frame.setTitle("Calculadora");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.getContentPane().setBackground(new Color(100,100,100));
    }
    public static void main(String[] args) {
        new Calci();
    }
}