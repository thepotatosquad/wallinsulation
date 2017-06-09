package gui;
import java.awt.Color;
import java.awt.Dimension;
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
	/** my frame.*/
	private JFrame myFrame;
	/** my big panel. */
	private JPanel myMainPanel;
	/** my copy welcome panel. */
	private JPanel myWelcomePanel;
	/** my copyhome panel. */
	private JPanel myHomePanel;
	/** my copy project panel. */
	private JPanel myProjectsPanel;
	/** my copy sign in panel. */
	private JPanel mySignInPanel;
	/** my copy profile panel. */
	private JPanel myProfilePanel;
	/** my welcome page. */
	private WelcomeGUI myWelcomePage;
	/** my home page. */
	private HomeGUI myHomePage;
	/** my project page. */
	private ProjectsGUI myProjectsPage;
	/** my signin page. */
	private SignInGUI mySignInPage;
	/** my profile page. */
	private ProfileGUI myProfilePage;
	/** my icon. */
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
	/**
	 * Constructor.
	 */
	public GUIMain(){
		initialization();
	}
	/**
	 * To get the GUI running.
	 */
	private void initialization(){
		myFrame = new JFrame();
		myFrame.getContentPane().setBackground(Color.LIGHT_GRAY);
		myFrame.setIconImage(spudIcon.getImage());
		myFrame.setTitle("The Potato Squad");
		myFrame.setMinimumSize(new Dimension(950,600));
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.getContentPane().setLayout(null);
		myFrame.setVisible(true);
		myFrame.setJMenuBar(createMenuBar());
		createJPanel();
		myWelcomePage = new WelcomeGUI(myWelcomePanel);
		myHomePage = new HomeGUI(myHomePanel);
		myProjectsPage = new ProjectsGUI(myProjectsPanel);
		myProfilePage = new ProfileGUI(myProfilePanel);
		mySignInPage = new SignInGUI(mySignInPanel, myProfilePage);
		startProgram();
		
	}
	/**
	 * Evoke the welcome page.
	 */
	private void startProgram(){
		myWelcomePage.evokeWelcome(); //to direct the first run to the homepage
		
	}
	/**
	 * Initializing all the jpanel needed before calling the pages.
	 */
	private void createJPanel(){
		myMainPanel = new JPanel();
		//myMainPanel.setBackground(Color.RED);
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
		
		myProfilePanel = new JPanel();
		myProfilePanel.setBounds(0, 0, 871, 581);
		myProfilePanel.setLayout(null);
		myProfilePanel.setVisible(false);
		myFrame.getContentPane().add(myProfilePanel);
		
	}
	/**
	 * Creating the menubar.
	 * @return JMenuBar
	 */
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
		menuBar.add(createProfileMenuItem());
		return menuBar;
	}
	/**
	 * Creating the Home Menu Item for MenuBar
	 * @return Home menuitem
	 */
	private JMenuItem createHomeMenu(){
		JMenuItem homeMenu = new JMenuItem("Home");
		homeMenu.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				myProjectsPanel.setVisible(false);
				myMainPanel.setVisible(false);
				mySignInPanel.setVisible(false);
				myProfilePanel.setVisible(false);
				myWelcomePanel.setVisible(false);
				myHomePage.evokeHome();
			}
		});
		return homeMenu;
	}
	/**
	 * Creating the projects menu item.
	 * @return the projects menu item
	 */
	private JMenuItem createProjectsMenu(){
		JMenuItem projectsMenu = new JMenuItem("Projects");
		projectsMenu.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				myMainPanel.setVisible(false);
				myHomePanel.setVisible(false);
				mySignInPanel.setVisible(false);
				myProfilePanel.setVisible(false);
				myWelcomePanel.setVisible(false);
				myProjectsPage.evokeProjects();
			}
		});
		return projectsMenu;
	}
	/**
	 * Creating About menuitem
	 * @return about menu item
	 */
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
	/**
	 * Creating sign in menu item.
	 * @return the sign in menu item
	 */
	private JMenuItem createSignInMenuItem(){
		JMenuItem signIn = new JMenuItem("Sign Up");
		signIn.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				myMainPanel.setVisible(false);
				myHomePanel.setVisible(false);
				myProjectsPanel.setVisible(false);
				myProfilePanel.setVisible(false);
				myWelcomePanel.setVisible(false);
				mySignInPage.evokeSignIn();
			}
		});
		return signIn;
	}
	/**
	 * Creating profile menu item
	 * @return the profile
	 */
	private JMenuItem createProfileMenuItem(){
		JMenuItem profile = new JMenuItem("Profile");
		profile.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				myMainPanel.setVisible(false);
				myHomePanel.setVisible(false);
				myProjectsPanel.setVisible(false);
				mySignInPanel.setVisible(false);
				myWelcomePanel.setVisible(false);
				myProfilePage.evokeProfile();
			}
		});
		return profile;
	}
}
