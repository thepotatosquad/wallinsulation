package gui;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CalculatorGUI {
	private JPanel myPanel;
	private JButton storeButton;
	private JButton calculatorButton;
	private JButton wallsButton;
	private JLabel calcLabel;
	public CalculatorGUI(JPanel thePanel, JButton theWalls, JButton theStore, JButton theCalc){
		myPanel = thePanel;
		wallsButton = theWalls;
		storeButton = theStore;
		calculatorButton = theCalc;
	}
	void evokeCalculator(){
		calcLabel = new JLabel("Calculator!");
		calcLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		calcLabel.setBounds(12, 13, 162, 41);
		myPanel.add(calcLabel);
	}
}
