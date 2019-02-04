package com.nigel.calculator;

import javax.swing.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class mainForm {


    private JButton button1;
    private JPanel panel1;
    private JLabel resultLable;

    public mainForm() {
        resultLable.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
            }
        });
    }

    public static void main (String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new mainForm().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
