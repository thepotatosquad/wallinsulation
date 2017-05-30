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

import javax.swing.JTextField;

public class NumWalls {

	private JPanel myPanel;
	private JTextField myInputWalls;
	private int myNumWalls;
	private JComboBox<String> myComboBox;
	private JFrame myFrame;
	
	public NumWalls(JPanel thePanel) {
		myPanel = thePanel;
	}
	@SuppressWarnings("unchecked")
	void evokeWallGUI() {
		JLabel lblNumberOfWalls = new JLabel("Number of Walls:");
		lblNumberOfWalls.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNumberOfWalls.setBounds(12, 13, 162, 41);
		myPanel.add(lblNumberOfWalls);
		
		String[] choice = {"0", "1", "2", "3", "4", "5"};
		myComboBox = new JComboBox<String>(choice);
		myComboBox.setSelectedIndex(0);
		myComboBox.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				String choice = (String) myComboBox.getSelectedItem();
				if (choice.equals("0")){
					JOptionPane.showMessageDialog(myFrame,"Pick a Number","Alert",JOptionPane.ERROR_MESSAGE);
				} else{
					myNumWalls = Integer.parseInt(choice);
					System.out.println(myNumWalls);
				}
			}
		});
		myComboBox.setBounds(172, 23, 116, 22);
		myPanel.add(myComboBox);
		
		JButton btnNext = new JButton("Next");
		btnNext.setEnabled(false);
		btnNext.setBounds(304, 22, 97, 25);
		myPanel.add(btnNext);
	}
	
}
