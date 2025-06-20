package College;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class P38_ButtonExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Button Example");

        // create a button
        JButton button = new JButton("Click me!");

        // add an action listener to the button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Welcome to JavaFx");
            }
        });

        // add the button to the frame
        frame.getContentPane().add(button);
        frame.pack();
        frame.setVisible(true);
    }
}

