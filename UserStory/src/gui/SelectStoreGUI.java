package gui;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import model.Calculator;

/**
 * SelectStore GUI
 * @author if30
 *
 */
public class SelectStoreGUI {
	/** the total store that we have.*/
	private static int myStoreInt = 3;
	/** the total material that we have.*/
	private static int myMatInt = 3;
	/**my working panel.*/
	private JPanel myPanel;
	/** copy of the store button.*/
	private JButton storeButton;
	/** copy of the calculator button.*/
	private JButton calculatorButton;
	/** copy of the walls button.*/
	private JButton wallsButton;
	/** label for "Walmart".*/
	private JLabel myWalmartLabel;
	/** label for "Lowes".*/
	private JLabel myLowesLabel;
	/** label for "Home Depot". */
	private JLabel myHomeDepotLabel;
	
	/** the JButton array for Walmart Store. */
	private JButton[] myWalmartMat;
	/** the JButton array for Home Depot Store. */
	private JButton[] myHomeDepotMat;
	/** the JButton array for Lowes Store. */
	private JButton[] myLowesMat;
	/** instance of the calculator to change the price. */
	private Calculator myCalc;
	/**
	 * Constructor for select store.
	 * @param thePanel copy of the working panel
	 * @param theWalls the walls button
	 * @param theStore the store button
	 * @param theCalc the calc button
	 */
	public SelectStoreGUI(JPanel thePanel, JButton theWalls, JButton theStore, JButton theCalc){
		myPanel = thePanel;
		wallsButton = theWalls;
		storeButton = theStore;
		calculatorButton = theCalc;
		
		myWalmartMat = new JButton[myStoreInt];
		myCalc = new Calculator();
	}
	/**
	 * So that the button can get this started.
	 */
	void evokeSelectStore(){
		createWalmart();
		createStoreHomeDepot();
		createStoreLowes();
		for(int i = 0; i < myMatInt; i++){
			myPanel.add(myWalmartMat[i]);
			myPanel.add(myHomeDepotMat[i]);
			myPanel.add(myLowesMat[i]);
		}
//		JLabel next = new JLabel("<-- To the next page!");
//		next.setBounds(12, 150, 162, 41);
//		next.setFont(new Font("Tahoma", Font.PLAIN, 12));
		calculatorButton.setEnabled(false);
	}
	/**
	 * Creating the first store.
	 */
	private void createWalmart(){
		myWalmartLabel = new JLabel("Walmart");
		myWalmartLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		myWalmartLabel.setHorizontalAlignment(SwingConstants.CENTER);
		myWalmartLabel.setBounds(0, 0, 161, 109);
		myPanel.add(myWalmartLabel);
		setupWalmartMat();
	}
	/**
	 * Creating the home depot.
	 */
	private void createStoreHomeDepot(){
		myHomeDepotLabel= new JLabel("Home Depot");
		myHomeDepotLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		myHomeDepotLabel.setHorizontalAlignment(SwingConstants.CENTER);
		myHomeDepotLabel.setBounds(173, 0, 161, 109);
		myPanel.add(myHomeDepotLabel);
		setupHomeDepotMat();
	}
	/**
	 * Creating the lowes store.
	 */
	private void createStoreLowes(){
		myLowesLabel = new JLabel("Lowes");
		myLowesLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		myLowesLabel.setHorizontalAlignment(SwingConstants.CENTER);
		myLowesLabel.setBounds(359, 0, 161, 109);
		myPanel.add(myLowesLabel);
		setupLowesMat();
	}
	/**
	 * Setting up the materials for walmart
	 */
	private void setupWalmartMat(){
		myWalmartMat = new JButton[myMatInt];
		myWalmartMat[0] = new JButton("<html>Spray Foam<br> Cost: $2.94</html>");
		myWalmartMat[0].setBounds(10, 113, 136, 70);
		myWalmartMat[0].addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				myCalc.setPrice(2.94);
				calculatorButton.setEnabled(true);
			}
		});
		
		myWalmartMat[1] = new JButton("<html>Reflective Roll<br> Cost: $62.56</html>");
		myWalmartMat[1].setBounds(10, 208, 136, 67);
		myWalmartMat[1].addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				myCalc.setPrice(62.56);
				calculatorButton.setEnabled(true);
			}
		});
		myWalmartMat[2] = new JButton("<html>Soundproofing<br>Stone Wool<br> Cost: $124.99</html>");
		myWalmartMat[2].setBounds(12, 310, 136, 67);
		myWalmartMat[2].addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				myCalc.setPrice(124.99);
				calculatorButton.setEnabled(true);
			}
		});
	}
	/**
	 * Setting up the materials for home depot
	 */
	private void setupHomeDepotMat(){
		myHomeDepotMat = new JButton[myMatInt];
		myHomeDepotMat[0] = new JButton("<html>Spray Foam<br> Cost: $4.25</html>");
		myHomeDepotMat[0].setBounds(183, 113, 136, 67);
		myHomeDepotMat[0].addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				myCalc.setPrice(4.25);
				calculatorButton.setEnabled(true);
			}
		});
		
		myHomeDepotMat[1] = new JButton("<html>Reflective Roll<br> Cost: $68.76</html>");
		myHomeDepotMat[1].setBounds(183, 208, 136, 67);
		myHomeDepotMat[1].addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				myCalc.setPrice(68.76);
				calculatorButton.setEnabled(true);
			}
		});
		myHomeDepotMat[2] = new JButton("<html>Soundproofing<br>Stone Wool<br> Cost: $49.47</html>");
		myHomeDepotMat[2].setBounds(183, 310, 136, 67);
		myHomeDepotMat[2].addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				myCalc.setPrice(49.47);
				calculatorButton.setEnabled(true);
			}
		});
	}
	/**
	 * Setting up the materials for lowes
	 */
	private void setupLowesMat(){
		myLowesMat = new JButton[myMatInt];
		myLowesMat[0] = new JButton("<html>Spray Foam<br> Cost: $4.48</html>");
		myLowesMat[0].setBounds(369, 113, 136, 67);
		myLowesMat[0].addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				myCalc.setPrice(4.48);
				calculatorButton.setEnabled(true);
			}
		});
		
		myLowesMat[1] = new JButton("<html>Reflective Roll<br> Cost: $39.57</html>");
		myLowesMat[1].setBounds(369, 208, 136, 67);
		myLowesMat[1].addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				myCalc.setPrice(39.57);
				calculatorButton.setEnabled(true);
			}
		});
		myLowesMat[2] = new JButton("<html>Soundproofing<br>Stone Wool<br> Cost: $49.47</html>");
		myLowesMat[2].setBounds(369, 310, 136, 67);
		myLowesMat[2].addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				myCalc.setPrice(49.47);
				calculatorButton.setEnabled(true);
			}
		});
	}
}
