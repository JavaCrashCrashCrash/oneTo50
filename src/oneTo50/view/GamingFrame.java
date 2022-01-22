package oneTo50.view;

import oneTo50.controller.GameController;
import oneTo50.model.Rect;
import oneTo50.model.UImodel;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GamingFrame extends JFrame {

	GamingFrame() {
		UImodel uiModel = new UImodel();
		setTitle("1 to 50 Play");
		setSize(400, 468);
		setLocationRelativeTo(null);
		MyPanel mp = new MyPanel(uiModel);

		setContentPane(mp);
		setResizable(false);
		setVisible(true);

		GameController gameController = new GameController(uiModel, mp);
		addMouseListener(gameController);
	}

	public static void main(String[] args) {
		// test
		GamingFrame gf = new GamingFrame();

	}

}