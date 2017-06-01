package gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;

public class Home {

	private JPanel homePanel;

//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Home window = new Home();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public Home(JPanel thePanel) {
		homePanel = thePanel;
		//homePanel.setBounds(0, 0, 871, 581);
		homePanel.setBackground(Color.WHITE);
		//initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	void evokeHome() {
//		frame = new JFrame();
//		myFrame.getContentPane().setBackground(randomColor());
//		myFrame.setForeground(Color.WHITE);
//		frame.setTitle("The Potato Squad");
//		frame.setBounds(100, 100, 1098, 605);
//		//frame.getContentPane().add(new JLabel(new ImageIcon("src/spud.jpg")));
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		
//		JMenuBar menuBar = new JMenuBar();
//		frame.setJMenuBar(menuBar);
//		
//		JMenu mnHome = new JMenu("Home");
//		menuBar.add(mnHome);
//		
//		JMenu mnProjects = new JMenu("Projects");
//		menuBar.add(mnProjects);
//		
//		JMenu mnSupport = new JMenu("Support");
//		menuBar.add(mnSupport);
//		frame.getContentPane().setLayout(null);
//		
//		JButton btnSignin = new JButton("Sign-In");
//		btnSignin.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//			}
//		});
//		btnSignin.setBounds(983, 0, 97, 25);
//		frame.getContentPane().add(btnSignin);
		
		JLabel lblWelcome = new JLabel("Welcome!");
		lblWelcome.setForeground(randomColor());
		lblWelcome.setFont(new Font("STZhongsong", Font.BOLD, 65));
		lblWelcome.setBounds(365, 108, 340, 119);
		homePanel.add(lblWelcome);
		
		JLabel lblDontExpectMuch = new JLabel("Don't expect much.");
		lblDontExpectMuch.setForeground(randomColor());
		lblDontExpectMuch.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDontExpectMuch.setBounds(442, 200, 289, 50);
		homePanel.add(lblDontExpectMuch);
		
		JLabel lblPlease = new JLabel("please");
		lblPlease.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblPlease.setBounds(514, 250, 56, 16);
		homePanel.add(lblPlease);
		
}
	/**
     * Creates a random color.
     *
     * @return the random color
     */
    private Color randomColor() {
        final Random rand = new Random();
        final int r = rand.nextInt(255);
        final int g = rand.nextInt(255);
        final int b = rand.nextInt(255);
        
        return new Color(r, g, b).brighter();
    }
}
