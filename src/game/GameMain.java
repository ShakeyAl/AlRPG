package game;

import javax.swing.SwingUtilities;

public class GameMain{

	public static void main(String[] args) throws Exception{

		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				Game.buildGame();
			}
		});

	}
}