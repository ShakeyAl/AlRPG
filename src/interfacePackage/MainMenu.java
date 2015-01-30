package interfacePackage;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

public class MainMenu extends JPanel {
	
	
	private static final long serialVersionUID = 1L;

	public MainMenu(){
		Dimension size = getPreferredSize();
		size.width = 600;
		setPreferredSize(size);
		
		JButton newBtn = new JButton("Create New Character");
		JButton loadBtn = new JButton("Load Character");
		JButton exitBtn = new JButton("Exit Game");
		
		
		exitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				System.exit(0);
			}
		});
		
		newBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println("What up");
			}
		});
		
		loadBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println("This is whats up");
			}
		});
		
		
		
		setBorder(BorderFactory.createTitledBorder("Main Menu"));
		setLayout( new GridBagLayout());
		
		GridBagConstraints gc = new GridBagConstraints();
		
		//////// Create new Character button /////////////
		
		gc.anchor = GridBagConstraints.SOUTH;
		gc.weightx = 0.5;
		gc.weighty = 0.4;
		
		gc.gridx = 0;
		gc.gridy = 0;
		add(newBtn, gc);
		
		////////// Load Character Button ///////////////
		
		gc.anchor = GridBagConstraints.NORTH;
		gc.weightx = 0.5;
		gc.weighty = 0.1;
		
		gc.gridx = 0;
		gc.gridy = 1;
		add(loadBtn, gc);
		
		
		////////// Load Character Button ///////////////
		
		gc.anchor = GridBagConstraints.NORTH;
		gc.weightx = 0.5;
		gc.weighty = 0.3;
		
		gc.gridx = 0;
		gc.gridy = 2;
		add(exitBtn, gc);
				
	}
	
}
