package gui;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ProjectsPage {
	private JPanel myPanel;
	private JPanel myWorkingPanel;
	
	private JButton storeButton;
	private JButton calculatorButton;
	private JButton wallsButton;
	private JButton loadButton;
	private JButton saveButton;
	
	private WallsGUI myWalls;
	private SelectStoreGUI mySelectStore;
	private CalculatorGUI myCalculator;
	public ProjectsPage(JPanel thePanel){
		myPanel = thePanel;
	}
	void evokeProjects(){
		myPanel.setBackground(Color.LIGHT_GRAY);
		setUpWorkingPanel();
		setUpButtons();
		//This has to be placed here, after all the panels and the button are all declared
		setUpPages(); 
		myPanel.setVisible(true);
	}
	private void setUpWorkingPanel(){
		myWorkingPanel = new JPanel();
		myWorkingPanel.setBackground(Color.WHITE);
		myWorkingPanel.setBounds(272, 69, 532, 393);
		myPanel.add(myWorkingPanel);
	}
	private void setUpPages(){
		myWalls = new WallsGUI(myWorkingPanel, wallsButton, storeButton, calculatorButton);
		mySelectStore = new SelectStoreGUI(myWorkingPanel, wallsButton, storeButton, calculatorButton);
		myCalculator = new CalculatorGUI(myWorkingPanel, wallsButton, storeButton, calculatorButton);
	}
	private void setUpButtons(){
		wallsButton = new JButton("Number of Walls");
		wallsButton.setBounds(30, 69, 190, 72);
		wallsButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				myWorkingPanel.removeAll();
				myWalls.evokeWalls();
				myWorkingPanel.repaint();
			}
		});
		myPanel.add(wallsButton);
		storeButton = new JButton("Select Store");
		storeButton.setBounds(30, 140, 190, 72);
		storeButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				myWorkingPanel.removeAll();
				mySelectStore.evokeSelectStore();
				myWorkingPanel.repaint();
			}
		});
		myPanel.add(storeButton);
		calculatorButton = new JButton("Calculator");
		calculatorButton.setBounds(30, 211, 190, 72);
		calculatorButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				myWorkingPanel.removeAll();
				myCalculator.evokeCalculator();
				myWorkingPanel.repaint();
			}
		});
		myPanel.add(calculatorButton);
		loadButton = new JButton("Load");
		loadButton.setBounds(27, 437, 97, 25);
		myPanel.add(loadButton);
		saveButton= new JButton("Save");
		saveButton.setBounds(123, 437, 97, 25);
		myPanel.add(saveButton);
	}
}
