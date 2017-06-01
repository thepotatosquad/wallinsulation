package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GUIBase {
	private JFrame myFrame;
	private JPanel myWholePanel;
	private JPanel myPanel;
	private NumWalls NumWallsGUI;
	private SelectStore mySelectStore;
	private Calculator myCalculator;
	private JButton btnSelectStore;
	private JButton btnCalculator;
	private JButton btnNumberOfWalls;
	private Home myHome;
	private ImageIcon spudIcon = new ImageIcon("./images/spudIcon.gif", null);
	public GUIBase(){
		myFrame = new JFrame();
		myFrame.getContentPane().setBackground(Color.LIGHT_GRAY);
		myFrame.setTitle("The Potato Squad");
		myFrame.setBounds(100, 100, 871, 581);
		myFrame.setIconImage(spudIcon.getImage());
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.getContentPane().setLayout(null);
		initialize();
		myFrame.setVisible(true);
	}
	private void initialize() {
		initializeWholePanel();
		
		myPanel = new JPanel();
		myPanel.setBackground(Color.WHITE);
		myPanel.setBounds(272, 69, 532, 393);
		myWholePanel.add(myPanel);
		myPanel.setLayout(null);
		
		btnNumberOfWalls = new JButton("Number of Walls");
		btnSelectStore = new JButton("Select Store");
		btnCalculator = new JButton("Calculator");
		NumWallsGUI = new NumWalls(myPanel, btnSelectStore, btnCalculator, btnNumberOfWalls);
		mySelectStore = new SelectStore(myPanel, btnSelectStore, btnCalculator, btnNumberOfWalls);
		myCalculator = new Calculator(myPanel, btnSelectStore, btnCalculator, btnNumberOfWalls);
//		myHome = new Home(myWholePanel);
		
		myFrame.setJMenuBar(createMenuBar());
		
		JButton btnNewButton = new JButton("Sign-In");
		btnNewButton.setBounds(756, 0, 97, 25);
		myWholePanel.add(btnNewButton);
		
		
		btnNumberOfWalls.setBounds(30, 69, 190, 72);
		btnNumberOfWalls.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				myPanel.removeAll();
				NumWallsGUI.evokeWall();
				myPanel.repaint();
			}
		});
		myWholePanel.add(btnNumberOfWalls);
		
		
		btnSelectStore.setEnabled(false);
		btnSelectStore.setBounds(30, 140, 190, 72);
		btnSelectStore.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				myPanel.removeAll();
				mySelectStore.evokeStore();
				myPanel.repaint();
			}
		});
		myWholePanel.add(btnSelectStore);
		
		
		btnCalculator.setEnabled(false);
		btnCalculator.setBounds(30, 211, 190, 72);
		btnCalculator.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				myPanel.removeAll();
				myCalculator.evokeCalculator();
				myPanel.repaint();
			}
			
		});
		myWholePanel.add(btnCalculator);
		
		JButton btnNewButton_1 = new JButton("Load");
		btnNewButton_1.setBounds(27, 437, 97, 25);
		myWholePanel.add(btnNewButton_1);
		
		JButton button = new JButton("Save");
		button.setBounds(123, 437, 97, 25);
		myWholePanel.add(button);
	}
	private void initializeWholePanel(){
		myWholePanel = new JPanel();
		myWholePanel.setBackground(Color.LIGHT_GRAY);
		myWholePanel.setBounds(0, 0, 871, 581);
		myFrame.getContentPane().add(myWholePanel);
		myWholePanel.setLayout(null);
	}
	private JMenuBar createMenuBar(){
		JMenuBar menuBar = new JMenuBar();
		JMenu mnHome = new JMenu("Home");
		mnHome.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
			
		});
		menuBar.add(mnHome);
		
		JMenu mnProjects = new JMenu("Projects");
		mnProjects.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		menuBar.add(mnProjects);
		
		JMenu mnSupport = new JMenu("Support");
		mnSupport.add(createAbout());
		menuBar.add(mnSupport);
		return menuBar;
	}
	private JMenuItem createAbout(){
		JMenuItem about = new JMenuItem("About Us");
		about.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				javax.swing.JOptionPane.showMessageDialog(null,"Members:\n" 
			+ "Irene Fransiga\nScott Hiraki\nDavid Mkrtychyan\nTanvir Singh(Beni)\nMamadou Barry\n\n"
			+ "Email:\n" + "thepotatosquad05@gmail.com\n" + "URL:\n" + "http://thepotatosquad.tk/"
						,null,JOptionPane.INFORMATION_MESSAGE, spudIcon);
			}
		});
		return about;
	}
}
