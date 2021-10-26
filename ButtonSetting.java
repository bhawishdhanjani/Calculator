package Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonSetting extends JButton implements ActionListener {
    JTextField textField;

    public ButtonSetting(String text ,JTextField textField){
        this.setText(text);
        this.setPreferredSize(new Dimension(61,60));
        this.setBackground(Color.BLACK);
        this.setForeground(Color.WHITE);
        this.setBorder(null);

        this.setFont(new Font("My Boli",Font.BOLD,20));
        this.addActionListener(this);
        this.textField = textField;
        this.setFocusable(false);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this) {
            try {



                switch (this.getText()) {
                    case "+" -> {
                        MathExpressionSolver.value1 = Double.parseDouble(textField.getText());
                        MathExpressionSolver.operation = '+';
                        textField.setText("");

                    }
                    case "-" -> {
                        MathExpressionSolver.value1 = Double.parseDouble(textField.getText());
                        MathExpressionSolver.operation = '-';
                        textField.setText("");
                    }
                    case "*" -> {
                        MathExpressionSolver.value1 = Double.parseDouble(textField.getText());
                        MathExpressionSolver.operation = '*';
                        textField.setText("");
                    }
                    case "/" -> {
                        MathExpressionSolver.value1 = Double.parseDouble(textField.getText());
                        MathExpressionSolver.operation = '/';
                        textField.setText("");
                    }
                    case "Clear" -> {
                        MathExpressionSolver.value2 = 0;
                        MathExpressionSolver.value1 = 0;
                        textField.setText("");
                    }
                    case "Delete" -> {
                        if (!(textField.getText().equals(""))) {
                            textField.setText(textField.getText().substring(0, textField.getText().length() - 1));
                        }
                    }
                    case "=" -> {
                        MathExpressionSolver.value2 = Double.parseDouble(textField.getText());
                        textField.setText(MathExpressionSolver.solution());
                    }
                    default -> textField.setText(textField.getText().concat(this.getText()));
                }
            }
            catch (NumberFormatException exception){
                textField.setText("Please input correct number");
            }
        }
    }
}

