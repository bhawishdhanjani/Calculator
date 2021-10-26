package Calculator;

import javax.swing.*;
import java.awt.*;

public class Main {
    static JPanel panel;
    public static void main(String[] args) {
        Utils utils = new Utils();
        JFrame frame = utils.getFrame();
        JTextField screen = utils.getjTextField();
        panel = utils.getPanel();

        //Arrays for setting button
        ButtonSetting[] number = new ButtonSetting[11];
        ButtonSetting[] operation = new ButtonSetting[6];
        String[] operations = {"+","-","*","/","Clear","Delete"};

        //Setting name,colour,size of button
        for (int i = 0 ; i<10 ; i++){
            number[i] = new ButtonSetting(Integer.toString(i),screen);
        }
        for (int i =0 ; i<operations.length ; i++){
            operation[i] = new ButtonSetting(operations[i],screen);
            operation[i].setBackground(new Color(255, 123, 0));
            if(operations[i]=="Clear" || operations[i]=="Delete"){
                operation[i].setFont(new Font(null,Font.BOLD,20));
                operation[i].setPreferredSize(new Dimension(125,41));

            }
        }

        number[10] = new ButtonSetting(".",screen);
        ButtonSetting equal = new ButtonSetting("=",screen);


        ButtonSetting[] buttons = {number[7],number[8],number[9],operation[0]
                ,number[4],number[5],number[6],operation[1],number[1],number[2],number[3],operation[2],number[0],
                number[10],equal,operation[3],operation[4],operation[5]};


        addButton(buttons);

        frame.add(screen);
        frame.add(panel);

        frame.setVisible(true);
    }
    private static void addButton (ButtonSetting[] buttons){
        for (int i = 0 ; i<buttons.length ; i++)
            panel.add(buttons[i]);
    }


}
