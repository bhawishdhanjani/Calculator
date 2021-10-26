package Calculator;

import javax.swing.*;
import java.awt.*;

public class Utils {
    public   JPanel getPanel() {
        JPanel panel = new JPanel();
        panel.setBounds(0,50,250,295);
        panel.setBorder(null);
        panel.setBackground(new Color(102, 255, 194, 112));
        panel.setLayout(new FlowLayout(FlowLayout.LEADING,0,0));
        return panel;
    }

    public JTextField getjTextField() {
        JTextField screen = new JTextField();
        screen.setBounds(0,0,250,51);
        screen.setBackground(Color.BLACK);
        screen.setForeground(Color.WHITE);
        screen.setBorder(null);
        return screen;
    }

    public JFrame getFrame() {
        ImageIcon imageIcon = new ImageIcon("C:\\Users\\Bhavesh\\Desktop\\Calculator.png");
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(260,370);
        frame.setLayout(null);
        frame.setIconImage(imageIcon.getImage());
        frame.setTitle("Calculator");
        frame.setResizable(false);
        return frame;
    }
}
