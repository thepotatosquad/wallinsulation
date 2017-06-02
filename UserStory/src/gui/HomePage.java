package gui;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class HomePage {
	private JPanel myPanel;
	private JLabel myTitle;
	public HomePage(JPanel thePanel) {
		myPanel = thePanel;
	}
	void evokeHome(){
		myPanel.setBackground(Color.LIGHT_GRAY);
		welcoming();
		myPanel.setVisible(true);
	}
	private void welcoming(){
		myTitle = new JLabel("Home");
		myTitle.setForeground(Color.BLACK);
		myTitle.setFont(new Font("STZhongsong", Font.BOLD, 60));
		myTitle.setBounds(310,50, 340, 119);
		myPanel.add(myTitle);
	}
}
