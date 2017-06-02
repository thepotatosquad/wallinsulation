package gui;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GUIMain {
	private JFrame myFrame;
	private JPanel myMainPanel;
	private JPanel myWelcomePanel;
	private JPanel myHomePanel;
	private JPanel myProjectsPanel;
	private JPanel mySignInPanel;
	
	private WelcomePage myWelcomePage;
	private HomePage myHomePage;
	private ProjectsPage myProjectsPage;
	private SignInPage mySignInPage;
	
	private ImageIcon spudIcon = new ImageIcon("./src/spudIconLarge.gif", null);
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new GUIMain();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public GUIMain(){
		initialization();
	}
	private void initialization(){
		myFrame = new JFrame();
		myFrame.getContentPane().setBackground(Color.LIGHT_GRAY);
		myFrame.setIconImage(spudIcon.getImage());
		myFrame.setTitle("The Potato Squad");
		myFrame.setBounds(100, 100, 871, 581);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.getContentPane().setLayout(null);
		myFrame.setVisible(true);
		myFrame.setJMenuBar(createMenuBar());
		createJPanel();
		myWelcomePage = new WelcomePage(myWelcomePanel);
		myHomePage = new HomePage(myHomePanel);
		myProjectsPage = new ProjectsPage(myProjectsPanel);
		mySignInPage = new SignInPage(mySignInPanel);
		startProgram();
		
	}
	private void startProgram(){
		myWelcomePage.evokeWelcome(); //to direct the first run to the homepage
		
	}
	private void createJPanel(){
		myMainPanel = new JPanel();
		myMainPanel.setBackground(Color.RED);
		myMainPanel.setBounds(0, 0, 871, 581);
		myFrame.getContentPane().add(myMainPanel);
		myMainPanel.setLayout(null);
		myMainPanel.setVisible(false);
		
		myHomePanel = new JPanel();
		myHomePanel.setBounds(0, 0, 871, 581);
		myHomePanel.setLayout(null);
		myHomePanel.setVisible(false);
		myFrame.getContentPane().add(myHomePanel);
		
		myProjectsPanel = new JPanel();
		myProjectsPanel.setBounds(0, 0, 871, 581);
		myProjectsPanel.setLayout(null);
		myProjectsPanel.setVisible(false);
		myFrame.getContentPane().add(myProjectsPanel);
		
		mySignInPanel = new JPanel();
		mySignInPanel.setBounds(0, 0, 871, 581);
		mySignInPanel.setLayout(null);
		mySignInPanel.setVisible(false);
		myFrame.getContentPane().add(mySignInPanel);
		
		myWelcomePanel = new JPanel();
		myWelcomePanel.setBounds(0, 0, 871, 581);
		myWelcomePanel.setLayout(null);
		myWelcomePanel.setVisible(false);
		myFrame.getContentPane().add(myWelcomePanel);
	}
	private  JMenuBar createMenuBar(){
		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		menuBar.add(fileMenu);
		fileMenu.add(createHomeMenu());
		menuBar.add(createProjectsMenu());
		JMenu supportMenu = new JMenu("Support");
		supportMenu.add(createAbout());
		menuBar.add(supportMenu);
		menuBar.add(createSignInMenuItem());
		return menuBar;
	}
	private JMenuItem createHomeMenu(){
		JMenuItem homeMenu = new JMenuItem("Home");
		homeMenu.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				myProjectsPanel.setVisible(false);
				myMainPanel.setVisible(false);
				mySignInPanel.setVisible(false);
				myHomePage.evokeHome();
			}
		});
		return homeMenu;
	}
	private JMenuItem createProjectsMenu(){
		JMenuItem projectsMenu = new JMenuItem("Projects");
		projectsMenu.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				myMainPanel.setVisible(false);
				myHomePanel.setVisible(false);
				mySignInPanel.setVisible(false);
				myProjectsPage.evokeProjects();
			}
		});
		return projectsMenu;
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
	private JMenuItem createSignInMenuItem(){
		JMenuItem signIn = new JMenuItem("Sign In");
		signIn.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				myMainPanel.setVisible(false);
				myHomePanel.setVisible(false);
				myProjectsPanel.setVisible(false);
				mySignInPage.evokeSignIn();
			}
		});
		return signIn;
	}
}
