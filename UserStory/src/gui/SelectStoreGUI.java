package gui;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		createWalmart();
		createStoreHomeDepot();
		createStoreLowes();
		JLabel next = new JLabel("<-- To the next page!");
		next.setBounds(12, 150, 162, 41);
		next.setFont(new Font("Tahoma", Font.PLAIN, 12));
		calculatorButton.setEnabled(false);
	}
	private void createWalmart(){
		JLabel lblWalmart = new JLabel("Walmart");
		lblWalmart.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblWalmart.setHorizontalAlignment(SwingConstants.CENTER);
		lblWalmart.setBounds(0, 0, 161, 109);
		myPanel.add(lblWalmart);
		
		JButton mat1 = new JButton();
		mat1.setText("<html>Spray Foam<br> Cost: $2.94</html>");
		mat1.setBounds(10, 113, 136, 70);
		mat1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				calculatorButton.setEnabled(true);
			}
			
		});
		myPanel.add(mat1);
		
		JButton mat2 = new JButton();
		mat2.setText("<html>Reflective Roll<br> Cost: $62.56</html>");
		mat2.setBounds(10, 208, 136, 67);
		myPanel.add(mat2);
		
		JButton mat3 = new JButton();
		mat3.setText("<html>Soundproofing<br>Stone Wool<br> Cost: $124.99</html>");
		mat3.setBounds(12, 310, 136, 67);
		myPanel.add(mat3);
	}
	private void createStoreHomeDepot(){
		JLabel lblHomeDepot = new JLabel("Home Depot");
		lblHomeDepot.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblHomeDepot.setHorizontalAlignment(SwingConstants.CENTER);
		lblHomeDepot.setBounds(173, 0, 161, 109);
		myPanel.add(lblHomeDepot);
		
		JButton mat1 = new JButton();
		mat1.setText("<html>Spray Foam<br> Cost: $4.25</html>");
		mat1.setBounds(183, 113, 136, 67);
		myPanel.add(mat1);
		
		JButton mat2 = new JButton();
		mat2.setText("<html>Reflective Roll<br> Cost: $68.76</html>");
		mat2.setBounds(183, 208, 136, 67);
		myPanel.add(mat2);
		
		JButton mat3 = new JButton();
		mat3.setText("<html>Soundproofing<br>Stone Wool<br> Cost: $49.47</html>");
		mat3.setBounds(183, 310, 136, 67);
		myPanel.add(mat3);
	}
	private void createStoreLowes(){
		JLabel lblLowes = new JLabel("Lowes");
		lblLowes.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblLowes.setHorizontalAlignment(SwingConstants.CENTER);
		lblLowes.setBounds(359, 0, 161, 109);
		myPanel.add(lblLowes);
		
		JButton mat1 = new JButton();
		mat1.setText("<html>Spray Foam<br> Cost: $4.48</html>");
		mat1.setBounds(369, 113, 136, 67);
		myPanel.add(mat1);
		
		JButton mat2 = new JButton();
		mat2.setText("<html>Reflective Roll<br> Cost: $39.57</html>");
		mat2.setBounds(369, 208, 136, 67);
		myPanel.add(mat2);
		
		JButton mat3 = new JButton();
		mat3.setText("<html>Soundproofing<br>Stone Wool<br> Cost: $49.47</html>");
		mat3.setBounds(369, 310, 136, 67);
		myPanel.add(mat3);
	}
}
