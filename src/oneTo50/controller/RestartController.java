package oneTo50.controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import oneTo50.model.UImodel;
import oneTo50.view.GamingFrame;
import oneTo50.view.MyPanel;

public class RestartController implements MouseListener{
	UImodel uiModel;
	MyPanel mp;
	
	public RestartController(UImodel uiModel, MyPanel mp) {
		this.uiModel = uiModel;
		this.mp = mp;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		mp.uimodel.currentNumber = 1;
		for (boolean b : mp.uimodel.usedNumber) {
			b = false;
		}
		mp.uimodel.setRects();
		mp.uimodel.numShuffle();
		mp.repaint();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
