package oneTo50.controller;

//import oneTo50.model.Ranker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

//import oneTo50.model.UImodel;

public class RecordingController implements ActionListener {
	JTextField nameField;
	String name;
	int record;
	
	public RecordingController(JTextField nameField) {
		this.nameField = nameField;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		name = nameField.getText();
		record = 0;
//		Ranker ranker = new Ranker(name, record);
		
	}

}
