package gui;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class HomeGUI {
	/** copy of my working panel. */
	private JPanel myPanel;
	/** Home Title.*/
	private JLabel myTitle;
	private JLabel myDescription;
	/**
	 * Constructor.
	 * @param thePanel copy of the working panel.
	 */
	public HomeGUI(JPanel thePanel) {
		myPanel = thePanel;
	}
	/**
	 * To get the home page.
	 */
	void evokeHome(){
		myPanel.setBackground(Color.LIGHT_GRAY);
		welcoming();
		myPanel.setVisible(true);
	}
	/**
	 * the inside of the home page.
	 */
	private void welcoming(){
		myTitle = new JLabel("Welcome to our Home!");
		myTitle.setForeground(Color.BLACK);
		myTitle.setFont(new Font("STZhongsong", Font.BOLD, 45));
		myTitle.setBounds(210,50, 550, 119);
		myPanel.add(myTitle);
		description();
	}
	private void description(){
		myDescription = new JLabel("<html>Here is the place to re-read the information<br>"
				+ "that we gave to you guess at the very beginning. Enjoy!<br><br>"
				+ "This app is about saving energy by having<br>"
				+ "a Do-It-Yourself wall insulation.<br><br>"
				+ "Let's get started!<br><br>"
				+ "File > Home --> Home Page<br>"
				+ "Projects --> Start A DIY Wall Insulation Project.<br>"
				+ "Support > About Us --> Get to know us, the developers!<br>"
				+ "Sign-In --> Save your data<html>");
		myDescription.setForeground(Color.BLACK);
		myDescription.setFont(new Font("Tahoma", Font.PLAIN, 12));
		myDescription.setBounds(300,150, 350, 200);
		myPanel.add(myDescription);
	}
}
