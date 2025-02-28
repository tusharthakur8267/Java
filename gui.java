package com.company;
import javax.swing.*;

public class gui {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My First GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        JButton button = new JButton("Press");
        frame.getContentPane().add(button); // Adds Button to content pane of frame
        frame.setVisible(true);
        JButton button1 = new JButton(("Button 2"));
        frame.getContentPane().add(button1);
        frame.setVisible(true);
    }
}
