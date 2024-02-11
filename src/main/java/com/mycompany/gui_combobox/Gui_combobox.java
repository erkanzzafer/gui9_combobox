/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.gui_combobox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

/**
 *
 * @author PC
 */
public class Gui_combobox {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Combobox örneği");
        String arr[] = {"c", "c#", "c++", "java", "python"};
        JComboBox cb = new JComboBox(arr);
        cb.setBounds(50, 100, 90, 20);

        JButton btn = new JButton("Seç");
        btn.setBounds(50, 150, 80, 20);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = "Seçilen programlama dili: " + cb.getSelectedItem();
                System.out.println(text);
            }
        });

        frame.add(cb);
        frame.add(btn);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);

    }
}
