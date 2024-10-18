

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Lab3Part2 extends JFrame implements ListSelectionListener {
	JList list = new JList();
	JTextArea animalDescription = new JTextArea("Something Interesting");
	JLabel outputLabel = new JLabel("Message will appear here");
	String choices[] = {"Cat","Elephant","Cheetah","Dog","Fish","Cow"};
	Icon catIcon = new ImageIcon("./images/catPic.jpg");
	Icon elephantIcon = new ImageIcon("./images/elephantPic.jpeg");
	Icon cheetahIcon = new ImageIcon("./images/cheetah.jpg");
	Icon dogIcon = new ImageIcon("./images/dog.jpg");
	Icon fishIcon = new ImageIcon("./images/fishPic.jpeg");
	Icon cowIcon = new ImageIcon("./images/cowPic.jpg");
	private int selectionNum = 0;
	
	public Lab3Part2() {
		super("Lab 3 Part 2");
		Container contentPane = getContentPane();
		contentPane.setLayout(new GridLayout(3,1));
		JPanel panel = new JPanel();
		JPanel outputPanel = new JPanel();
		JPanel txtAreaPanel = new JPanel();
		list = new JList(choices);
		list.addListSelectionListener(this);
		JScrollPane txtAreaPane = new JScrollPane(animalDescription);
		JScrollPane scrllPane = new JScrollPane(list,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrllPane.setPreferredSize(new Dimension(100,100));
		panel.add(scrllPane);
		outputPanel.add(outputLabel);
		txtAreaPanel.add(txtAreaPane);
		contentPane.add(panel);
		contentPane.add(outputPanel);
		contentPane.add(txtAreaPane);
		
		setSize(500,450);
		setLocation(500,50);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		Lab3Part2 lb3p2 = new Lab3Part2();
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		Object source = e.getSource();
		if (source == list) {		
			listImageSelector(list.getSelectedIndex());
		}
		
	}
	
	public void listImageSelector(int listIndex) {
		switch (listIndex) {
		case 0: {
			outputLabel.setText("Cat");
			outputLabel.setIcon(catIcon);
			animalDescription.setText("this is a cat, cats are cute");
			break;
		}
		case 1: {
			outputLabel.setText("Elephant");
			outputLabel.setIcon(elephantIcon);
			animalDescription.setText("Probably never going to forget you!");
			break;
		}
		case 2: {
			outputLabel.setText("Cheetah");
			outputLabel.setIcon(cheetahIcon);
			animalDescription.setText("cheetahs are the fastest land animals");
			break;
		}
		case 3: {
			outputLabel.setText("Dog");
			outputLabel.setIcon(dogIcon);
			animalDescription.setText("dogs make great companions");
			break;
		}
		case 4: {
			outputLabel.setText("Fish");
			outputLabel.setIcon(fishIcon);
			animalDescription.setText("Here is a fish");
			break;
		}
		case 5: {
			outputLabel.setText("Cow");
			outputLabel.setIcon(cowIcon);
			animalDescription.setText("this is a cow, cows go moo!");
			break;
		}
		default:
			outputLabel.setText("1234");
		}
	}

	public int getSelectionNum() {
		return this.selectionNum;
	}

	public void setSelectionNum(int selectionNum) {
		this.selectionNum = selectionNum;
	}
	
	
	
	
	
	
	

}
