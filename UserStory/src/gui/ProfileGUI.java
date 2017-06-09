package gui;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

import model.Users;

public class ProfileGUI {
	private JPanel myPanel;
	private Users myUser;
	
	public ProfileGUI(JPanel thePanel) {
		myPanel = thePanel;
	}
	void evokeProfile() {
		myPanel.setBackground(Color.LIGHT_GRAY);
		myUser = new Users();
		makeProfilePage();
		myPanel.setVisible(true);
	}
	private void makeProfilePage(){
		JLabel lblUsername = new JLabel("Username: ");
		lblUsername.setBounds(71, 150, 105, 29);
		myPanel.add(lblUsername);
		
		JLabel lblEmail = new JLabel("Email: ");
		lblEmail.setBounds(95, 192, 105, 29);
		myPanel.add(lblEmail);
		
		JLabel lblGetusername = new JLabel(myUser.getUsername());
		lblGetusername.setBounds(138, 150, 200, 29);
		myPanel.add(lblGetusername);
		
		JLabel lblGetemail = new JLabel(myUser.getEmail());
		lblGetemail.setBounds(138, 192, 200, 29);
		myPanel.add(lblGetemail);
		
//		JLabel lblPassword = new JLabel("Password:");
//		lblPassword.setBounds(70, 232, 70, 16);
//		myPanel.add(lblPassword);
//		
//		JLabel lblGetpw = new JLabel(myUser.getPassword());
//		lblGetpw.setBounds(144, 232, 200, 16);
//		myPanel.add(lblGetpw);
		
		JLabel lblLastName = new JLabel("Last Name: ");
		lblLastName.setBounds(71, 79, 105, 29);
		myPanel.add(lblLastName);
		
		JLabel lblFirstName = new JLabel("First Name: ");
		lblFirstName.setBounds(71, 50, 105, 29);
		myPanel.add(lblFirstName);
		
		JLabel lblGetlname = new JLabel(myUser.getLName());
		lblGetlname.setBounds(144, 79, 200, 29);
		myPanel.add(lblGetlname);
		
		JLabel lblGetfname = new JLabel(myUser.getFName());
		lblGetfname.setBounds(144, 50, 200, 29);
		myPanel.add(lblGetfname);
		
//		JLabel lblState = new JLabel("State:");
//		lblState.setBounds(95, 119, 46, 29);
//		myPanel.add(lblState);
//		
//		JLabel lblGetstate = new JLabel();
//		lblGetstate.setBounds(138, 119, 62, 29);
//		myPanel.add(lblGetstate);
	}
}
