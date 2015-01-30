package game;

import javax.swing.*;
import interfacePackage.*;

public class Game {
	
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public static void buildGame(){
		SwingUtilities.invokeLater(new Runnable() {
			public void run(){
				JFrame frame = new MenuInt("Al's RPG");

				frame.setSize(WIDTH, HEIGHT);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
	}
}
