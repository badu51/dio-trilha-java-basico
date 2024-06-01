import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Screen extends JFrame {

    public Screen(){
        setVisible(true);
        setSize(800, 500);
        setTitle("Aula 01");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);
        
        JButton jButton = new JButton("Clique aqui");
        jButton.setBounds(100,200, 250, 70);
        jButton.setFont(new Font("Arial", Font.BOLD, 40));
        jButton.setForeground(new Color(237, 241, 238));
        jButton.setBackground(new Color(9, 10, 9));

        JButton jButton2 = new JButton("outro botão");
        jButton2.setBounds(0, 0, 150, 70);
        jButton2.setFont(new Font("Arial", Font.ITALIC, 20));
        jButton2.setForeground(new Color(237, 241, 238));
        jButton2.setBackground(new Color(12, 12, 220));

        add(jButton);
        add(jButton2);
    }
}