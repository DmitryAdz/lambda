package by.odinets.lambda.project.book.chapter3;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

public class Functional {

	private JButton button = new JButton();
	
	private ActionEvent lastEvent;
	
	private void registerHandler() {
		button.addActionListener((ActionEvent event) -> {
			this.lastEvent = event;
		});
	}
}
