import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Lab3Part1a extends JFrame implements ActionListener{
	
	Container c = getContentPane();
	JPanel panel = new JPanel();
	JButton button1 = new JButton("Translate to Irish");
	JLabel label1 = new JLabel("My name is Gary");
	
	//constructor
	Lab3Part1a(){
	super("Lab3 Part 1a");
	
	button1.addActionListener(this);
	panel.add(label1);
	panel.add(button1);
	c.add(panel);
	setSize(300,300);
	setVisible(true);
	
	}
	
	public static void main(String[] args) {
		Lab3Part1a lb3p1a = new Lab3Part1a();
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		String translateMessage = "Gary is aimn dom";
		label1.setText(translateMessage);
		
	}
	

}
