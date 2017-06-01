package gui;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumWalls {

	private JPanel myPanel;
	private int myNumWalls;
	private JComboBox<String> myComboBox;
	private JFrame myFrame;
	private JButton btnSelectStore;
	private JButton btnCalculator;
	private JButton btnNumberOfWalls;
	
	public NumWalls(JPanel thePanel, JButton theSS, JButton theCalc, JButton theNum) {
		myPanel = thePanel;
		btnSelectStore = theSS;
		btnCalculator = theCalc;
		btnNumberOfWalls = theNum;
	}
	void evokeWall() {
		JLabel lblNumberOfWalls = new JLabel("Number of Walls:");
		lblNumberOfWalls.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNumberOfWalls.setBounds(12, 13, 162, 41);
		myPanel.add(lblNumberOfWalls);
		
//		JButton btnNext = new JButton("Next");
//		btnNext.setEnabled(false);
//		btnNext.setBounds(304, 22, 97, 25);
//		btnNext.addActionListener(new ActionListener(){
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				
//			}
//			
//		});
//		myPanel.add(btnNext);
		
		JLabel next = new JLabel("<-- To the next page!");
		next.setBounds(12, 75, 162, 41);
		next.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		String[] choice = {"0", "1", "2", "3", "4", "5"};
		myComboBox = new JComboBox<String>(choice);
		myComboBox.setSelectedIndex(0);
		myComboBox.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				String choice = (String) myComboBox.getSelectedItem();
				//System.out.println(choice);
				if (choice.equals("0")){
					JOptionPane.showMessageDialog(myFrame,"Pick a Number","Alert",JOptionPane.ERROR_MESSAGE);
					//btnNext.setEnabled(false);
					btnSelectStore.setEnabled(false);
					btnCalculator.setEnabled(false);
					myPanel.remove(next);
					myPanel.repaint();
				} else{
					myNumWalls = Integer.parseInt(choice);
					//btnNext.setEnabled(true);
					btnSelectStore.setEnabled(true);
					myPanel.add(next);
					myPanel.repaint();
					//System.out.println(myNumWalls);
				}
			}
		});
		myComboBox.setBounds(172, 23, 116, 22);
		myPanel.add(myComboBox);
		
		
	}
}
