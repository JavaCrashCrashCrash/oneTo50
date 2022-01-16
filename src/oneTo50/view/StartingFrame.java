package oneTo50.view;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class StartingFrame extends JFrame {
	JButton playButton, rankingButton;

	StartingFrame() {
		setTitle("1 to 50 Start");
		setSize(400, 300);
		setDefaultCloseOperation(3);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		playButton = new JButton();
		playButton.setBounds(150, 80, 100, 40);
		playButton.setLabel("PLAY");
		add(playButton);
		
		rankingButton = new JButton();
		rankingButton.setBounds(150, 130, 100, 40);
		rankingButton.setLabel("RANKING");
		add(rankingButton);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		StartingFrame sf = new StartingFrame();
	}
}
