package applets;

import java.awt.*;
import java.awt.event.*;

public class GreetingWindow extends Frame implements KeyListener {

    Label message;

    GreetingWindow() {
        // Create label
        message = new Label("Press M, A, E, or N", Label.CENTER);
        add(message);

        // Add key listener
        addKeyListener(this);

        // Window settings
        setSize(400, 200);
        setTitle("Greeting Window");
        setFont(new Font("Calibri", Font.BOLD, 16));
        setLayout(new BorderLayout());
        setVisible(true);

        // Close window event
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    // Key pressed event
    public void keyPressed(KeyEvent e) {
        char ch = e.getKeyChar();

        if (ch == 'M' || ch == 'm') {
            message.setText("Good Morning");
        } 
        else if (ch == 'A' || ch == 'a') {
            message.setText("Good Afternoon");
        } 
        else if (ch == 'E' || ch == 'e') {
            message.setText("Good Evening");
        } 
        else if (ch == 'N' || ch == 'n') {
            message.setText("Good Night");
        } 
        else {
            message.setText("Invalid Key");
        }
    }

    public void keyReleased(KeyEvent e) {}
    public void keyTyped(KeyEvent e) {}

    public static void main(String[] args) {
        new GreetingWindow();
    }
}