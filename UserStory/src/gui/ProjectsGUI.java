package gui;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ProjectsGUI {
	/**A copy of the whole big panel.*/
	private JPanel myPanel;
	/** created a working panel to be shared.*/
	private JPanel myWorkingPanel;
	/** a copy of the store button. */
	private JButton storeButton;
	/** a copy of the calculator button. */
	private JButton calculatorButton;
	/** a copy of the walls button. */
	private JButton wallsButton;
	/** a copy of the load button. */
	private JButton loadButton;
	/** a copy of the save button. */
	private JButton saveButton;
	
	/** walls call. */
	private WallsGUI myWalls;
	/** selectstore call. */
	private SelectStoreGUI mySelectStore;
	/** calculator call. */
	private CalculatorGUI myCalculator;
	/**
	 * Constructor.
	 * @param thePanel the copy of the big whole panel.
	 */
	public ProjectsGUI(JPanel thePanel){
		myPanel = thePanel;
	}
	/**
	 * So that buttons can evoke this GUI
	 */
	void evokeProjects(){
		myPanel.setBackground(Color.LIGHT_GRAY);
		setUpWorkingPanel();
		setUpButtons();
		//This has to be placed here, after all the panels and the button are all declared
		setUpPages(); 
		myPanel.setVisible(true);
	}
	/**
	 * To get the panel ready
	 */
	private void setUpWorkingPanel(){
		myWorkingPanel = new JPanel();
		myWorkingPanel.setBackground(Color.WHITE);
//		myScrollPane = new JScrollPane(myWorkingPanel, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
//		myScrollPane.setForeground(Color.YELLOW);
//		myScrollPane.setPreferredSize(new Dimension(600, 600));
		myWorkingPanel.setBounds(272, 69, 700, 393);
		myPanel.add(myWorkingPanel);
//		myPanel.add(myScrollPane);
	}
	/**
	 * Calling all the pages
	 */
	private void setUpPages(){
		myWalls = new WallsGUI(myWorkingPanel, wallsButton, storeButton, calculatorButton);
		mySelectStore = new SelectStoreGUI(myWorkingPanel, wallsButton, storeButton, calculatorButton);
		myCalculator = new CalculatorGUI(myWorkingPanel, wallsButton, storeButton, calculatorButton);
	}
	/**
	 * Setting up all the necessary buttons.
	 */
	private void setUpButtons(){
		wallsButton = new JButton("Number of Walls");
		wallsButton.setBounds(30, 69, 190, 72);
		wallsButton.setEnabled(true);
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
		storeButton.setEnabled(false);
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
		calculatorButton.setEnabled(false);
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
