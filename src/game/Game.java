package game;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Game extends JPanel {
	
	private static final int WIDTH = 1024;
	private static final int HEIGHT = 768;
	private JFrame mFrame;
	private boolean bool1 = false;
	
	public Game(){

	}
	
	public Game(JFrame frame){
		mFrame = frame;
		buildMenu(mFrame);
	}
	
	public void buildMenu( JFrame f){
		JMenuBar bar = new JMenuBar();
		JMenu optionMenu = new JMenu("Option");
		JMenuItem item;
		
		item = new JMenuItem("Create New Character");
		item.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){

			}
		});
		optionMenu.add(item);
		
		item = new JMenuItem("Load Character");
		item.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
		
			}
		});
		optionMenu.add(item);
		
		item = new JMenuItem("Exit");
		item.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
		
			}
		});
		optionMenu.add(item);
		
		bar.add(optionMenu);
		f.setJMenuBar(bar);
	}
	
	
	public static void buildGame(){
		
		JFrame frame = new JFrame("Al's RPG");
		
		frame.setSize(WIDTH, HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		Game app = new Game(frame);
		app.buildMenu(frame);
		frame.setContentPane(app);
		
	}
}
