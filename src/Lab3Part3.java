import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.nio.channels.SelectionKey;

import javax.swing.*;

public class Lab3Part3 extends JFrame implements ActionListener {
	String colorChoices[] = {"Red","Green","Blue","Orange","Purple"};
	String bookChoices[] = {"Php & MySQL", "The Pianist", "Bruce Springsteen", "Cujo", "The General"};
	JLabel colorLbl = new JLabel("I will change color");
	JLabel bookLbl = new JLabel("You should read these");
	
	//create new colors
	Color redLblColor = new Color(255,0,0);
	Color grnLblColor = new Color(0,255,0);
	Color blueLblColor = new Color(0,0,255);
	Color orangeLblColor = new Color(255,165,0);
	Color purpleLblColor = new Color(160,32,240);
	Color blackLblColor = new Color(0,0,0);
	Color greybg = new Color(211,211,211);
	
	//Icons
	ImageIcon bookIcon1 = new ImageIcon("../images/php&mysqlIcon.jpg");
	ImageIcon bookIcon2 = new ImageIcon("./images/pianist.jpg");
	ImageIcon bookIcon3 = new ImageIcon("./images/bruceBook.jpg");
	ImageIcon bookIcon4 = new ImageIcon("./images/cujo.jpg");
	ImageIcon bookIcon5 = new ImageIcon("./images/theGeneral.jpg");
	
	JComboBox<String> colorComboChoices = new JComboBox<String>();
	JComboBox<ImageAndText> bookComboChoices = new JComboBox<ImageAndText>();
	JPanel bookComboPanel = new JPanel();
	JPanel clrLblPanel = new JPanel();
	JPanel colorComboSelectionPanel = new JPanel();
	JPanel bookChoiceLblpanel = new JPanel();
	
	Lab3Part3() {
		super("Lab3 Part 3");
		
		//layouts
		Container contentPane = getContentPane();
		contentPane.setLayout(new GridLayout(2,2,10,10));
		bookComboChoices.setModel(populateNewComboBox());
		bookComboChoices.setRenderer(new ImagesTextRenderer());
		//jcombo config and populate list using loop method 
		loopListItems(colorChoices, colorComboChoices);
		
		colorComboChoices.addActionListener(this);
		clrLblPanel.setBackground(greybg);
		bookComboPanel.setBackground(greybg);
		
		//label placements
		colorComboSelectionPanel.add(colorComboChoices);
		bookComboPanel.add(bookComboChoices);
		clrLblPanel.add(colorLbl);
		bookChoiceLblpanel.add(bookLbl);
		
		//contentPane
		contentPane.add(colorComboSelectionPanel);
		contentPane.add(bookComboChoices);
		contentPane.add(clrLblPanel);
		contentPane.add(bookChoiceLblpanel);
		
		
		setLocation(500,100);
		setSize(600, 300);
		setVisible(true);
		
	}
	
	public void loopListItems(String choices[], JComboBox<String> jCombo) {
        for (int i = 0; i < choices.length; i++) {
            jCombo.addItem(choices[i]);
        }
    }
	
	public static void main(String[] args) {
		Lab3Part3 lb3p3 = new Lab3Part3();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//actions for color label
		String txtChange = "it Works";
		Object source = e.getSource();
		checkForColorComboSelection((colorComboChoices.getSelectedIndex()));
	}
	
	private void checkForColorComboSelection(int selectionIndex) {
		switch (selectionIndex) {
		case 0: {
			String printIndex = "the selected index is for color box = " + colorComboChoices.getSelectedIndex();
			System.out.println(printIndex);
			colorLbl.setBackground(redLblColor);
			colorLbl.setOpaque(true);
			break;
		}
		case 1: {
			String printIndex = "the selected index is for color box = " + colorComboChoices.getSelectedIndex();
			System.out.println(printIndex);
			colorLbl.setBackground(grnLblColor);
			colorLbl.setOpaque(true);
			break;
		}
		case 2: {
			String printIndex = "the selected index is for color box = " + colorComboChoices.getSelectedIndex();
			System.out.println(printIndex);
			colorLbl.setBackground(blueLblColor);
			colorLbl.setOpaque(true);
			break;
		}
		case 3: {
			String printIndex = "the selected index is for color box = " + colorComboChoices.getSelectedIndex();
			System.out.println(printIndex);
			colorLbl.setBackground(orangeLblColor);
			colorLbl.setOpaque(true);
			break;
		}
		case 4: {
			String printIndex = "the selected index is for color box = " + colorComboChoices.getSelectedIndex();
			System.out.println(printIndex);
			colorLbl.setBackground(purpleLblColor);
			colorLbl.setOpaque(true);
			break;
		}
		
		default:
			System.out.println("nothing too declare");
		}
	}
	
	//create new comboBox model
	private DefaultComboBoxModel<ImageAndText> populateNewComboBox() {
		DefaultComboBoxModel<ImageAndText> dcm = new DefaultComboBoxModel<ImageAndText>();
		dcm.addElement(new ImageAndText(bookIcon1, bookChoices[0]));
		dcm.addElement(new ImageAndText(bookIcon2, bookChoices[1]));
		dcm.addElement(new ImageAndText(bookIcon3, bookChoices[2]));
		dcm.addElement(new ImageAndText(bookIcon4, bookChoices[3]));
		dcm.addElement(new ImageAndText(bookIcon5, bookChoices[4]));
	
		return dcm;
		
	}
	

}
