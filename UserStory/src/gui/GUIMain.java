package gui;

import java.awt.EventQueue;

public class GUIMain {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					@SuppressWarnings("unused")
					GUIBase myProg = new GUIBase();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
