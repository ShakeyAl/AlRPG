package interfacePackage;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;

public class MenuInt extends JFrame {

	private static final long serialVersionUID = 1L;
	private MainMenu mainMenu;
	private CharCreate charCreation;

	public MenuInt(String title){
		super(title);
		setLayout(new BorderLayout());
		initUI();		
		
		Container c = getContentPane();
		c.add(charCreation);
		c.add(mainMenu);
		
		
	}
	
	public void initUI(){
	
		mainMenu = new MainMenu();
		charCreation = new CharCreate();
		
	}	
}
