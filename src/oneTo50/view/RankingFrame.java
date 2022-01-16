package oneTo50.view;

import javax.swing.DefaultListCellRenderer;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.SwingConstants;

public class RankingFrame extends JFrame {
	String[] top10 = {"Kim", "Lee", "Park", "Choi", "Jung", "Kang", "Cho", "Yoon", "Jang", "Lim"};
	JList top10List;
	
	RankingFrame() {
		setTitle("Ranking");
		setSize(250, 280);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		setResizable(false);
		
		top10List = new JList(top10);
		top10List.setBounds(68, 20, 100, 200);
		DefaultListCellRenderer renderer = (DefaultListCellRenderer) top10List.getCellRenderer();
		renderer.setHorizontalAlignment(SwingConstants.CENTER);
		add(top10List);

		setVisible(true);
	}

	
	public static void main(String[] args) {
		//test
		RankingFrame rf = new RankingFrame();
	}
	
}
