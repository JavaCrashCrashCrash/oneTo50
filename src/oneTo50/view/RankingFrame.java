package oneTo50.view;

import javax.swing.JButton;
import javax.swing.JFrame;

public class RankingFrame extends JFrame {
	RankingFrame() {
		setTitle("1 to 50 Ranking");
		setSize(400, 300);
		setDefaultCloseOperation(3);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		setVisible(true);
	}

	
	public static void main(String[] args) {
		//test
		RankingFrame rf = new RankingFrame();
	}
	
}
