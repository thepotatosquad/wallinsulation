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
		myTitle = new JLabel("Home");
		myTitle.setForeground(Color.BLACK);
		myTitle.setFont(new Font("STZhongsong", Font.BOLD, 60));
		myTitle.setBounds(310,50, 340, 119);
		myPanel.add(myTitle);
	}
}
