package gui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class SelectStore {
	private JPanel myPanel;
	private JButton btnSelectStore;
	private JButton btnCalculator;
	private JButton btnNumberOfWalls;
	
	public SelectStore(JPanel thePanel, JButton theSS, JButton theCalc, JButton theNum ) {
		myPanel = thePanel;
		btnSelectStore = theSS;
		btnCalculator = theCalc;
		btnNumberOfWalls = theNum;
	}
	
	void evokeStore() {
		
		createCostco();
		createStoreHomeDepot();
		createStoreLowes();
//		JLabel lblSelectStore = new JLabel("Select Store: ");
//		lblSelectStore.setFont(new Font("Tahoma", Font.BOLD, 16));
//		lblSelectStore.setBounds(12, 13, 162, 41);
//		myPanel.add(lblSelectStore);
		
		JLabel next = new JLabel("<-- To the next page!");
		next.setBounds(12, 150, 162, 41);
		next.setFont(new Font("Tahoma", Font.PLAIN, 12));
		//myPanel.add(next);
		btnCalculator.setEnabled(true);
		
//		JSeparator separator = new JSeparator();
//		separator.setOrientation(SwingConstants.VERTICAL);
//		separator.setForeground(Color.BLACK);
//		separator.setBackground(Color.BLACK);
//		separator.setBounds(162, 0, 2, 393);
//		myPanel.add(separator);
//		
//		JSeparator separator_1 = new JSeparator();
//		separator_1.setOrientation(SwingConstants.VERTICAL);
//		separator_1.setForeground(Color.BLACK);
//		separator_1.setBackground(Color.BLACK);
//		separator_1.setBounds(346, 0, 2, 393);
//		myPanel.add(separator_1);
		
		
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
