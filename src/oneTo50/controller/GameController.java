package oneTo50.controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import oneTo50.model.Rect;
import oneTo50.model.UImodel;
import oneTo50.view.MyPanel;
import oneTo50.view.RecordingFrame;

public class GameController implements MouseListener {
	UImodel uiModel;
	MyPanel mp;

	public GameController(UImodel uiModel, MyPanel mp) {
		this.uiModel = uiModel;
		this.mp = mp;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		Rect rect = uiModel.whoAmI(e.getX(), e.getY());
		System.out.println(e.getX() + " " + e.getY());
		uiModel.compare(rect);
		if(uiModel.currentNumber == 50) {
			RecordingFrame rf = new RecordingFrame();
		}
			
		mp.repaint();
	}

	@Override
	public void mousePressed(MouseEvent e) {

	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

	@Override
	public void mouseEntered(MouseEvent e) {

	}

	@Override
	public void mouseExited(MouseEvent e) {

	}
}
