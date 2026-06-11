package chandana;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyboardEventSwing extends JFrame implements KeyListener {

    JTextArea area;
    JLabel label;

    KeyboardEventSwing() {

        // Frame settings
        setTitle("Keyboard Event Handling using Swing");
        setSize(400, 200);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Components
        label = new JLabel("Press any key...");
        area = new JTextArea(5, 25);

        add(label);
        add(area);

        // Add Key Listener
        area.addKeyListener(this);

        setVisible(true);
    }

    // Key Pressed Event
    public void keyPressed(KeyEvent e) {
        label.setText("Key Pressed: " + e.getKeyChar());
    }

    // Key Released Event
    public void keyReleased(KeyEvent e) {
        label.setText("Key Released: " + e.getKeyChar());
    }

    // Key Typed Event
    public void keyTyped(KeyEvent e) {
        label.setText("Key Typed: " + e.getKeyChar());
    }

    public static void main(String[] args) {
        new KeyboardEventSwing();
    }
}