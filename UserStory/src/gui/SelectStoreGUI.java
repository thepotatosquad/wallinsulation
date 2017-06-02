package gui;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class SelectStoreGUI {
	private JPanel myPanel;
	private JButton storeButton;
	private JButton calculatorButton;
	private JButton wallsButton;
	public SelectStoreGUI(JPanel thePanel, JButton theWalls, JButton theStore, JButton theCalc){
		myPanel = thePanel;
		wallsButton = theWalls;
		storeButton = theStore;
		calculatorButton = theCalc;
	}
	void evokeSelectStore(){
		createCostco();
		createStoreHomeDepot();
		createStoreLowes();
		JLabel next = new JLabel("<-- To the next page!");
		next.setBounds(12, 150, 162, 41);
		next.setFont(new Font("Tahoma", Font.PLAIN, 12));
		//myPanel.add(next);
		calculatorButton.setEnabled(true);
	}
	private void createCostco(){
		JLabel lblCostco = new JLabel("Costco");
		lblCostco.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCostco.setHorizontalAlignment(SwingConstants.CENTER);
		lblCostco.setBounds(0, 0, 161, 109);
		myPanel.add(lblCostco);
		
		JButton mat1 = new JButton("Material1");
		mat1.setBounds(10, 113, 136, 67);
		myPanel.add(mat1);
		
		JButton mat2 = new JButton("Material2");
		mat2.setBounds(10, 208, 136, 67);
		myPanel.add(mat2);
		
		JButton mat3 = new JButton("Material3");
		mat3.setBounds(369, 310, 136, 67);
		myPanel.add(mat3);
	}
	private void createStoreHomeDepot(){
		JLabel lblHomeDepot = new JLabel("Home Depot");
		lblHomeDepot.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblHomeDepot.setHorizontalAlignment(SwingConstants.CENTER);
		lblHomeDepot.setBounds(173, 0, 161, 109);
		myPanel.add(lblHomeDepot);
		
		JButton mat1 = new JButton("Material1");
		mat1.setBounds(183, 113, 136, 67);
		myPanel.add(mat1);
		
		JButton mat2 = new JButton("Material2");
		mat2.setBounds(183, 208, 136, 67);
		myPanel.add(mat2);
		
		JButton mat3 = new JButton("Material3");
		mat3.setBounds(183, 310, 136, 67);
		myPanel.add(mat3);
	}
	private void createStoreLowes(){
		JLabel lblLowes = new JLabel("Lowes");
		lblLowes.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblLowes.setHorizontalAlignment(SwingConstants.CENTER);
		lblLowes.setBounds(359, 0, 161, 109);
		myPanel.add(lblLowes);
		
		JButton mat1 = new JButton("Material1");
		mat1.setBounds(369, 113, 136, 67);
		myPanel.add(mat1);
		
		JButton mat2 = new JButton("Material2");
		mat2.setBounds(369, 208, 136, 67);
		myPanel.add(mat2);
		
		JButton mat3 = new JButton("Material3");
		mat3.setBounds(12, 310, 136, 67);
		myPanel.add(mat3);
	}
}
