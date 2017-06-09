package gui;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.Calculator;

public class CalculatorGUI {
	/** my main  working panel. **/
	private JPanel myPanel;
	/** the split panel depending on the number of walls. **/
	private JPanel[] mySplitPanel;
	/** access to store button. **/
	private JButton storeButton;
	/** access to calculator button. **/
	private JButton calculatorButton;
	/** access to wall button. */
	private JButton wallsButton;
	/** label of calculator. */
	private JLabel calcLabel;
	/** array of JLabel for the "Walls#".*/
	private JLabel[] mySplitLabel;
	/** array of width label. */
	private JLabel[] myWidthLabel;
	/** array of height label. */
	private JLabel[] myHeightLabel;
	/** array of length label. */
	private JLabel[] myLengthLabel;
	/** array of cost label. */
	private JLabel[] myCostLabel;
	/** array of width textfield.*/
	private JTextField[] myWidth;
	/** array of height textfield.*/
	private JTextField[] myHeight;
	/** array of length textfield.*/
	private JTextField[] myLength;
	/** to store the number of walls chosen.*/
	private int myWalls;
	/** to get number of walls from calc. */
	private Calculator myCalcSize;
	/** array of calc for each wall. */
	private Calculator[] myCalc;
	/**
	 * Constructor for calculator.
	 * @param thePanel copy of the working panel
	 * @param theWalls copy of the wall button
	 * @param theStore copy of the store button
	 * @param theCalc copy of the calculator button
	 */
	public CalculatorGUI(JPanel thePanel, JButton theWalls, JButton theStore, JButton theCalc){
		myPanel = thePanel;
		wallsButton = theWalls;
		storeButton = theStore;
		calculatorButton = theCalc;
		myCalcSize = new Calculator();
		
	}
	/**
	 * To get the "wall" calculator going.
	 */
	private void updateIntWalls(){
		myWalls = myCalcSize.getNumOfWalls();
		mySplitPanel = new JPanel[myWalls];
		setupTitleJLabel();
		setupDimJLabel();
		setupJTextField();
		for(int i = 0; i < myWalls; i++){
			mySplitPanel[i] = new JPanel();
			mySplitPanel[i].setBackground(Color.WHITE);
			mySplitPanel[i].setBorder(BorderFactory.createStrokeBorder(new BasicStroke(0.5f)));
			mySplitPanel[i].setBounds(0 + (120*i), 60, 120, 393);
			mySplitPanel[i].add(mySplitLabel[i]).setBounds(40, 0, 55, 40);
			mySplitPanel[i].add(myWidthLabel[i]).setBounds(3, 40, 50, 40);
			mySplitPanel[i].add(myWidth[i]).setBounds(50, 50, 50, 20);
			mySplitPanel[i].add(myHeightLabel[i]).setBounds(3, 70, 50, 40);
			mySplitPanel[i].add(myHeight[i]).setBounds(50, 80, 50, 20);
			mySplitPanel[i].add(myLengthLabel[i]).setBounds(3, 100, 50, 40);
			mySplitPanel[i].add(myLength[i]).setBounds(50, 110, 50, 20);
			mySplitPanel[i].add(myCostLabel[i]).setBounds(3, 200, 55, 40);
			myPanel.add(mySplitPanel[i]);
		}
	}
	/**
	 * so button can evoke the calculator gui.
	 */
	void evokeCalculator(){
		calcLabel = new JLabel("Calculator!");
		calcLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		calcLabel.setBounds(12, 13, 162, 41);
		myPanel.add(calcLabel);
		updateIntWalls();
	}
	/**
	 * Needs update!
	 */
	private void setupJTextField(){
		myCalc = new Calculator[myWalls];
		myWidth = new JTextField[myWalls];
		myHeight = new JTextField[myWalls];
		myLength = new JTextField[myWalls];
		for(int i = 0; i < myWalls; i++){
			myCalc[i] = new Calculator();
			myWidth[i] = new JTextField();
			myHeight[i] = new JTextField();
			myLength[i] = new JTextField();
		}
	}
	/**
	 * To initialize the labels.
	 */
	private void setupDimJLabel(){
		myWidthLabel = new JLabel[myWalls];
		for(int i = 0; i < myWalls; i++){
			myWidthLabel[i] = new JLabel("Width: ");
			myWidthLabel[i].setFont(new Font("Tahoma", Font.PLAIN, 12));
		}
		myHeightLabel = new JLabel[myWalls];
		for(int i = 0; i < myWalls; i++){
			myHeightLabel[i] = new JLabel("Height: ");
			myHeightLabel[i].setFont(new Font("Tahoma", Font.PLAIN, 12));
		}
		myLengthLabel = new JLabel[myWalls];
		for(int i = 0; i < myWalls; i++){
			myLengthLabel[i] = new JLabel("Length: ");
			myLengthLabel[i].setFont(new Font("Tahoma", Font.PLAIN, 12));
		}
	}
	/**
	 * To initialize the wall# and cost# label.
	 */
	private void setupTitleJLabel(){
		mySplitLabel = new JLabel[myWalls];
		myCostLabel = new JLabel[myWalls];
		for(int i = 0; i < myWalls; i++){
			mySplitLabel[i] = new JLabel("Wall " + (i+1) + ": ");
			mySplitLabel[i].setFont(new Font("Tahoma", Font.BOLD, 13));
			myCostLabel[i] = new JLabel("Cost " + (i+1) + ": ");
			myCostLabel[i].setFont(new Font("Tahoma", Font.BOLD, 12));
		}
	}
	/**
	 * Made for testing purposes.
	 * @return
	 */
	private Color randomColor() {
        final Random rand = new Random();
        final int r = rand.nextInt(255);
        final int g = rand.nextInt(255);
        final int b = rand.nextInt(255);
        return new Color(r, g, b).brighter();
    }
}
