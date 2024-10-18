import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.Format;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.*;
public class Lab3Part4 extends JFrame implements ActionListener {

	// panels
	JPanel btnPanel = new JPanel();
	JPanel blnceLblPanel = new JPanel();
	JPanel mainScreen = new JPanel();
	JPanel titlePanel = new JPanel();
	// buttons
	JButton topUpBtn = new JButton();
	JButton makeCallBtn = new JButton();
	JButton sendTxtBtn = new JButton();

	// Bank Account Information
	BalanceAccount bankAccount = new BalanceAccount();

	// labels

	JLabel balanceLblHolder = new JLabel();
	JLabel titleLbl = new JLabel("FoneVoda Remote Top Up Service");

	// Fonts 
	Font largeFont = new Font("Dialog", Font.BOLD, 20);
	Font smallFont = new Font("Dialog", Font.PLAIN, 14);

	//colors
	// colors
	Color greyBg = new Color(211, 211, 211);
	Color lightgryBtns = new Color(127,127,127);
	Color ornageBg = new Color(255, 165, 0);
	Color grnClr = new Color(0, 255, 0);

	// constructor
	public Lab3Part4() {

		super("Lab3 Part 4");
		Container contentPane = getContentPane();
		

		// content layout
		contentPane.setLayout(new GridLayout(3, 1, 10, 10));

		

		// main screen config
		mainScreen.setBorder(BorderFactory.createTitledBorder("Mobile Top Up Screen"));
		mainScreen.setLayout(new BorderLayout());
		mainScreen.setPreferredSize(new Dimension(500, 200));
		mainScreen.setBackground(greyBg);

		// title Screen config
		titlePanel.add(titleLbl);
		titlePanel.setBackground(greyBg);
		titleLbl.setFont(largeFont);

		// button panel config
		btnPanel.setBackground(ornageBg);
		btnPanel.setLayout(new GridLayout(1, 1, 50, 10));

		// balance panel config
		blnceLblPanel.setBackground(greyBg);
		blnceLblPanel.setBorder(BorderFactory.createTitledBorder("View Your Balance Below:"));
		

		// top up button
		topUpBtn.setText("Top Up");
		topUpBtn.setBorder(BorderFactory.createBevelBorder(0));
		topUpBtn.addActionListener(this);
		topUpBtn.setFont(smallFont);
		topUpBtn.setBackground(lightgryBtns);
		
		
		// make call button
		makeCallBtn.setText("Make Call");
		makeCallBtn.setBorder(BorderFactory.createBevelBorder(0));
		;
		makeCallBtn.addActionListener(this);
		makeCallBtn.setFont(smallFont);
		
		
		
		// send text button
		sendTxtBtn.setText("Send Text");
		sendTxtBtn.setBorder(BorderFactory.createBevelBorder(0));
		;
		sendTxtBtn.addActionListener(this);
		sendTxtBtn.setFont(smallFont);

		// balance label
		balanceLblHolder.setText("balance: " + bankAccount.getBankBalance());
		balanceLblHolder.setFont(largeFont);
		// button panel add components
		btnPanel.add(topUpBtn);
		btnPanel.add(makeCallBtn);
		btnPanel.add(sendTxtBtn);
		// balance panel
		blnceLblPanel.add(balanceLblHolder);

		// balance panel add components
		mainScreen.add(titlePanel, BorderLayout.NORTH);
		mainScreen.add(btnPanel, BorderLayout.CENTER);
		mainScreen.add(blnceLblPanel, BorderLayout.SOUTH);

		blnceLblPanel.add(balanceLblHolder);

		// content Pane panels

		contentPane.add(mainScreen);
		// set minimum size of your container to preferred size you want then set
		// contentPane of container to main sreeen frame.
		setContentPane(mainScreen);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(800, 300);
		setVisible(true);
		pack();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		checkForBankBalance(bankAccount.getBankBalance());
		checkForButtonPress(source);

	}

	public static void main(String[] args) {
		// Launch the application.
		Lab3Part4 lb3p4 = new Lab3Part4();
	}

	public void enableButtons() {
		sendTxtBtn.setEnabled(true);
		makeCallBtn.setEnabled(true);
		sendTxtBtn.setBorder(BorderFactory.createBevelBorder(0));
		;
		sendTxtBtn.setBackground(this.lightgryBtns);

		
		makeCallBtn.setBorder(BorderFactory.createBevelBorder(0));
		;
		makeCallBtn.setBackground(this.lightgryBtns);
		
	}

	public void disableButtons() {
		sendTxtBtn.setEnabled(false);
		makeCallBtn.setEnabled(false);

		sendTxtBtn.setBorder(BorderFactory.createTitledBorder("Please Top up"));
		sendTxtBtn.setBackground(Color.WHITE);
		sendTxtBtn.setForeground(Color.BLACK);
		makeCallBtn.setBorder(BorderFactory.createTitledBorder("Please Top up"));
		makeCallBtn.setBackground(Color.WHITE);
		makeCallBtn.setForeground(Color.BLACK);

		
	}

	public void checkForButtonPress(Object source) {
	
		if (source == topUpBtn) {

			balanceLblHolder.setText(bankAccount.toString());
			System.out.println("Top Up Btn Presed \n" + bankAccount.topUpBtn());
		} else if (source == sendTxtBtn) {
			balanceLblHolder.setText(bankAccount.toString());
			System.out.println("Send Txt Btn Presed.\n" + bankAccount.sendTxtBtn());
		} else if (source == makeCallBtn) {
			balanceLblHolder.setText(bankAccount.toString());
			System.out.println("Make Call Btn Presed.\n" + bankAccount.makeCallBtn());
		};
	
	}

	public void checkForBankBalance(double bankBalance) {
		if (bankBalance > 0) {
			enableButtons();
		}
		else {
            disableButtons();
            balanceLblHolder.setText("Your balance is zero. Please top up!");
        }
	}
} //end of class