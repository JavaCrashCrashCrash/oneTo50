package oneTo50.view;

import javax.swing.JFrame;

import oneTo50.controller.GameController;
import oneTo50.controller.RestartController;
import oneTo50.model.UImodel;

public class GamingFrame extends JFrame {
	public UImodel uiModel;

	public GamingFrame() {
		UImodel uiModel = new UImodel();
		uiModel.init();
		setTitle("1 to 50 Play");
		setSize(400, 468);
		setLocationRelativeTo(null);
		MyPanel mp = new MyPanel(uiModel);

		setContentPane(mp);
		setResizable(false);
		setVisible(true);

		GameController gameController = new GameController(uiModel, mp);
//		addMouseListener(gameController);
		mp.addMouseListener(gameController);

		RestartController restartController = new RestartController(uiModel, mp);
		mp.restartButton.addMouseListener(restartController);
	}
}