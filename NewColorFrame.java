package JAVA24;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class NewColorFrame extends JFrame {
    JButton red, green, blue, yellow;
    
    public NewColorFrame(){
        super("NewColorFrame");
        setSize(322, 122);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout flo = new FlowLayout();
        setLayout(flo);
        red = new JButton("Red");
        add(red);
        green = new JButton("Green");
        add(green);
        blue = new JButton("Blue");
        add(blue);
        yellow = new JButton("Yellow");
        add(yellow);
        
        // Beginning of lambda expression
        ActionListener act = (event) -> {
            if(event.getSource() == red){
                getContentPane().setBackground(Color.red);
            }
            if(event.getSource() == green){
                getContentPane().setBackground(Color.green);
            }
            if(event.getSource() == blue){
                getContentPane().setBackground(Color.blue);
            }
            if(event.getSource() == yellow){
                getContentPane().setBackground(Color.yellow);
            }
        };
        
        // End lambda - expressions
        red.addActionListener(act);
        green.addActionListener(act);
        blue.addActionListener(act);
        yellow.addActionListener(act);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new NewColorFrame();
    }
}
