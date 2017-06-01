package gui;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Calculator {

	private JPanel myPanel;
	private JButton btnSelectStore;
	private JButton btnCalculator;
	private JButton btnNumberOfWalls;
	
	public Calculator(JPanel thePanel, JButton theSS, JButton theCalc, JButton theNum ) {
		myPanel = thePanel;
		btnSelectStore = theSS;
		btnCalculator = theCalc;
		btnNumberOfWalls = theNum;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	void evokeCalculator() {
		JLabel lblCalculator = new JLabel("Calculator!");
		lblCalculator.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCalculator.setBounds(12, 13, 162, 41);
		myPanel.add(lblCalculator);
	}
}