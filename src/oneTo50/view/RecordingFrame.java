package oneTo50.view;

import javax.swing.JFrame;
import javax.swing.JTextField;

import oneTo50.controller.RecordingController;

public class RecordingFrame extends JFrame {
	public RecordingFrame() {
		setTitle("enter your name");
		setSize(200, 100);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		setResizable(false);
		
		JTextField nameField = new JTextField();
		nameField.setBounds(15, 15, 170, 40);
		RecordingController rc = new RecordingController(nameField);
		nameField.addActionListener(rc);
		add(nameField);
		
		setVisible(true);
	}
}
