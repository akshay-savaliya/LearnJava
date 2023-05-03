package College;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class P39_CheckboxExample extends JFrame implements ActionListener {
    private JCheckBox option1, option2, option3;
    private JButton button;

    public P39_CheckboxExample() {
        super("Checkbox Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 1));

        option1 = new JCheckBox("Option 1");
        option2 = new JCheckBox("Option 2");
        option3 = new JCheckBox("Option 3");

        button = new JButton("Show Selected");
        button.addActionListener(this);

        add(option1);
        add(option2);
        add(option3);
        add(button);

        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String selected = "";
        if (option1.isSelected()) {
            selected += "Option 1 ";
        }
        if (option2.isSelected()) {
            selected += "Option 2 ";
        }
        if (option3.isSelected()) {
            selected += "Option 3";
        }
        JOptionPane.showMessageDialog(this, "Selected: " + selected);
    }

    public static void main(String[] args) {
        new P39_CheckboxExample();
    }
}

