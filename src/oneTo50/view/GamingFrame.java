package oneTo50.view;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Rect {
	int x;
	int y;
	int size;
	int num;
	Color color;
	int back;
}

class MyPanel extends JPanel {
	Rect[] rect = new Rect[25];
	Random ran;
	int a = 1;
	JButton restartButton = new JButton();
	JLabel timer = new JLabel();

	MyPanel() {
		setLayout(null);
		ran = new Random();
		int i = 0;
		for (int y = 0; y < 5; y++) {
			for (int x = 0; x < 5; x++) {
				rect[i] = new Rect();
				rect[i].size = 50;
				rect[i].x = 70 + x * rect[i].size;
				rect[i].y = 70 + y * rect[i].size;
				rect[i].num = i + 1;
				rect[i].color = Color.WHITE;
				rect[i].back = 26 + i;
				i += 1;
			}
		}
		num_shuffle();
		
		restartButton.setLabel("RESTART");
		restartButton.setBounds(145, 350, 100, 50);
		add(restartButton);
		
		timer.setText("0 second"); // sample
		timer.setBounds(170, 13, 100, 50);
		add(timer);
	}

	public void num_shuffle() {
		for (int i = 0; i < 1000; i++) {
			int r = ran.nextInt(25);
			int temp = rect[r].num;
			rect[r].num = rect[0].num;
			rect[0].num = temp;

			r = ran.nextInt(25);
			temp = rect[r].back;
			rect[r].back = rect[0].back;
			rect[0].back = temp;
		}
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		try {
			Thread.sleep(10);
			repaint();
		} catch (Exception e) {
		}
		for (int i = 0; i < 25; i++) {
			g.setColor(rect[i].color);
			g.fillRect(rect[i].x, rect[i].y, rect[i].size, rect[i].size);
			g.setColor(Color.black);
			g.drawRect(rect[i].x, rect[i].y, rect[i].size, rect[i].size);
			g.drawString(rect[i].num + "", rect[i].x + 20, rect[i].y + 30);
		}
	}
}

public class GamingFrame extends JFrame {

	GamingFrame() {
		setTitle("1 to 50 Play");
		setSize(400, 468);
		setLocationRelativeTo(null);
		MyPanel mp = new MyPanel();
		setContentPane(mp);
		setResizable(false);
		setVisible(true);
	}

	public static void main(String[] args) {
		// test
		GamingFrame gf = new GamingFrame();
	}

}