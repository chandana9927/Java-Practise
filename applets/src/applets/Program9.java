package applets;

import java.awt.*;
import java.awt.event.*;

public class Program9 extends Frame implements KeyListener{
	
	Label lbl;
	Program9() { 
		addKeyListener(this); 
		requestFocus();
		lbl = new Label();
		lbl.setBounds(100, 100, 200, 40);
		lbl.setFont(new Font("Calibri", Font.BOLD, 16));
		add(lbl); 
		setSize(400, 300); 
		setLayout(null);
		setVisible(true);
		
		// Close window event
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
	}
	
	public void keyPressed(KeyEvent e) {
		if (e.getKeyChar() == 'M' || e.getKeyChar() == 'm')
			lbl.setText("Good morning");
		else if (e.getKeyChar() == 'A' || e.getKeyChar() == 'a')
			lbl.setText("Good afternoon");
		else if (e.getKeyChar() == 'E' || e.getKeyChar() == 'e')
			lbl.setText("Good evening");
		else if (e.getKeyChar() == 'N' || e.getKeyChar() == 'n')
			lbl.setText("Good night");
		else
			lbl.setText("Invalid Input");
		}
		public void keyReleased(KeyEvent e) {
		}
		public void keyTyped(KeyEvent e) {
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Program9();

	}

}
