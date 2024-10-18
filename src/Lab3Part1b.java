import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Lab3Part1b extends JFrame implements ActionListener{

	JButton translateButton = new JButton();
	boolean buttonPressed;
	String originalStateButtonMessage = "My Text Changes When You Push Me";
	String translateMessage = "See, I Told You the Text Would Change?";
	public Lab3Part1b() {
		super("Lab3 Part 1b");
		Container contentPane = getContentPane();
		JPanel panel = new JPanel();
		buttonPressed = true;
		translateButton.setText(originalStateButtonMessage);
		translateButton.addActionListener(this);
		panel.add(translateButton);
		contentPane.add(panel);
		
		setSize(300,300);
		setLocation(500,50);
		setVisible(true);
	}

	public static void main(String[] args) {
		Lab3Part1b lb3p1b = new Lab3Part1b();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		checkButtonState();
	}//end of actionPerformed
	
	public void checkButtonState() {
		if(buttonPressed) {
			translateButton.setText(translateMessage);
			buttonPressed = false;
			} else {
				translateButton.setText(originalStateButtonMessage);
				buttonPressed = true;
			}
	}
}
