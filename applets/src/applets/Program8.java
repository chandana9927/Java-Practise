package applets;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Program8 extends Applet implements KeyListener {
	String msg = "", key;
	public void init() {
	addKeyListener(this);
	}
	public void paint(Graphics g) {
		g.drawString(msg, 150, 100);
	}
	public void keyReleased(KeyEvent ke) {
		showStatus(key + " Key Released");
		}
		public void keyPressed(KeyEvent ke) {
		int keycode = ke.getKeyCode(); key = ke.getKeyText(keycode); repaint();
		showStatus(key + " Key Pressed");
		}
		public void keyTyped(KeyEvent ke) {
		char c = ke.getKeyChar();
		msg += c;
		key = String.valueOf(c);
		repaint();
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Program8();
	}

}
