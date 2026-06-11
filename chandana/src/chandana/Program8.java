package chandana;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Program8 extends JFrame implements KeyListener {
    String msg = "  Hello  ", key;

    JLabel displayLabel;

    public Program8() {
        super("Key Event Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        displayLabel = new JLabel(msg);
        displayLabel.setBounds(50, 100, 300, 30);
        displayLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        add(displayLabel);
        addKeyListener(this);
        setVisible(true);
        setFocusable(true);
        requestFocusInWindow(); // Ensure JFrame gets focus
    }
    @Override
    public void keyPressed(KeyEvent ke) {
        int keycode = ke.getKeyCode();
        key = KeyEvent.getKeyText(keycode);
        setTitle(key + " Key Pressed");
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        setTitle(key + " Key Released");
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        char c = ke.getKeyChar();
        msg += c;
        key = String.valueOf(c);
        displayLabel.setText(msg);
    }

    public static void main(String[] args) {
      
        new Program8();
    }
}