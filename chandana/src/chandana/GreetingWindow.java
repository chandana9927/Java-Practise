package chandana;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GreetingWindow extends JFrame implements KeyListener {

    JLabel message;

    GreetingWindow() {

        setTitle("Greeting Window");
        setSize(400, 200);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        message = new JLabel("Press M, A, E or N key");
        message.setFont(new Font("Arial", Font.BOLD, 18));

        add(message);

        // Add Key Listener to Frame
        addKeyListener(this);

        setVisible(true);
    }

    // Key Pressed Event
    public void keyPressed(KeyEvent e) {

        char ch = e.getKeyChar();

        if (ch == 'M' || ch == 'm')
            message.setText("Good Morning");

        else if (ch == 'A' || ch == 'a')
            message.setText("Good After Noon");

        else if (ch == 'E' || ch == 'e')
            message.setText("Good Evening");

        else if (ch == 'N' || ch == 'n')
            message.setText("Good Night");
    }

    public void keyReleased(KeyEvent e) {}
    public void keyTyped(KeyEvent e) {}

    public static void main(String[] args) {
        new GreetingWindow();
    }
}
