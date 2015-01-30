package interfacePackage;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;

public class MenuInt extends JFrame {

	private static final long serialVersionUID = 1L;
	private MainMenu mainMenu;

	public MenuInt(String title){
		super(title);
		setLayout(new BorderLayout());
		initUI();		
		
		Container c = getContentPane();
		c.add(mainMenu);
		
		
	}
	
	public void initUI(){
	
		mainMenu = new MainMenu();
		
	}	
}
