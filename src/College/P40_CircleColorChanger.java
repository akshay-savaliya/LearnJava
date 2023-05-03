package College;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class P40_CircleColorChanger extends JPanel {
    private boolean isPressed;

    public P40_CircleColorChanger() {
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                isPressed = true;
                repaint();
            }

            public void mouseReleased(MouseEvent e) {
                isPressed = false;
                repaint();
            }
        });
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (isPressed) {
            g.setColor(Color.RED);
        } else {
            g.setColor(Color.BLUE);
        }

        g.fillOval(100, 100, 100, 100);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        P40_CircleColorChanger panel = new P40_CircleColorChanger();
        frame.add(panel);

        frame.setVisible(true);
    }
}

