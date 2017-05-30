package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class GUIBase {
	private JFrame myFrame;
	private JPanel myPanel;
	private NumWalls NumWallsGUI;
	public GUIBase(){
		myFrame = new JFrame();
		myFrame.getContentPane().setBackground(Color.LIGHT_GRAY);
		myFrame.setTitle("The Potato Squad");
		myFrame.setBounds(100, 100, 871, 581);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.getContentPane().setLayout(null);
		initialize();
		myFrame.setVisible(true);
	}
	private void initialize() {
		myPanel = new JPanel();
		myPanel.setBackground(Color.WHITE);
		myPanel.setBounds(272, 69, 532, 393);
		myFrame.getContentPane().add(myPanel);
		myPanel.setLayout(null);
		NumWallsGUI = new NumWalls(myPanel);
		
		myFrame.setJMenuBar(createMenuBar());
		
		JButton btnNewButton = new JButton("Sign-In");
		btnNewButton.setBounds(756, 0, 97, 25);
		myFrame.getContentPane().add(btnNewButton);
		
		JButton btnNumberOfWalls = new JButton("Number of Walls");
		btnNumberOfWalls.setBounds(30, 69, 190, 72);
		btnNumberOfWalls.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				NumWallsGUI.evokeWallGUI();
				myPanel.repaint();
			}
		});
		myFrame.getContentPane().add(btnNumberOfWalls);
		
		JButton btnSelectStore = new JButton("Select Store");
		btnSelectStore.setEnabled(false);
		btnSelectStore.setBounds(30, 140, 190, 72);
		myFrame.getContentPane().add(btnSelectStore);
		
		JButton btnCalculator = new JButton("Calculator");
		btnCalculator.setEnabled(false);
		btnCalculator.setBounds(30, 211, 190, 72);
		myFrame.getContentPane().add(btnCalculator);
		
		JButton btnNewButton_1 = new JButton("Load");
		btnNewButton_1.setBounds(27, 437, 97, 25);
		myFrame.getContentPane().add(btnNewButton_1);
		
		JButton button = new JButton("Save");
		button.setBounds(123, 437, 97, 25);
		myFrame.getContentPane().add(button);
	}
	private JMenuBar createMenuBar(){
		JMenuBar menuBar = new JMenuBar();
		JMenu mnHome = new JMenu("Home");
		menuBar.add(mnHome);
		
		JMenu mnProjects = new JMenu("Projects");
		menuBar.add(mnProjects);
		
		JMenu mnSupport = new JMenu("Support");
		menuBar.add(mnSupport);
		return menuBar;
	}
}
