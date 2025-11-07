package com.example;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {
     public static void main(String[] args) {

    JFrame frame;
    JLabel label;
   
   frame = new JFrame();
   frame.setVisible(true);
   frame.setSize(300,700);
   frame.setLayout(null);

   label = new JLabel("hello");
   label.setBounds(24, 67, 100, 466);
   frame.add(label);
    
   
    }
 
   
}
