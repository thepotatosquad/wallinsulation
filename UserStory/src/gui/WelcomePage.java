package gui;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class WelcomePage {
	private JPanel myPanel;
	private JLabel myWelcome;
	private JLabel myDescription;
	public WelcomePage(JPanel thePanel) {
		myPanel = thePanel;
	}
	void evokeWelcome(){
		myPanel.setBackground(Color.LIGHT_GRAY);
		welcoming();
		description();
		myPanel.setVisible(true);
	}
	private void welcoming(){
		myWelcome = new JLabel("Welcome!");
		myWelcome.setForeground(Color.BLACK);
		myWelcome.setFont(new Font("STZhongsong", Font.BOLD, 60));
		myWelcome.setBounds(290,50, 340, 119);
		myPanel.add(myWelcome);
	}
	private void description(){
		myDescription = new JLabel("<html>This app is about saving energy by having<br>"
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
