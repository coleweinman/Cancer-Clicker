package Main;
import java.awt.EventQueue;
import java.awt.Frame;

import Application.Application;

public class Main {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			Application frame;
			public void run() {
				try {
					frame = new Application();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		Game.start();
	}
}
