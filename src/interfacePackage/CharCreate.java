package interfacePackage;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class CharCreate extends JPanel {
	
	private static final long serialVersionUID = -350017081316819157L;

	public CharCreate(){
	
		Dimension size = getPreferredSize();
		size.width = 600;
		setPreferredSize(size);
		setVisible(false);
		
		JLabel charName = new JLabel("Name of Character: ");
		JTextField charNameField = new JTextField(10);
		JRadioButton warRad = new JRadioButton("Warrior");
		JRadioButton archRad = new JRadioButton("Archer");
		JRadioButton wizRad = new JRadioButton("Wizard");
		
		JButton acptBtn = new JButton("Accept");
		JButton cnclBtn = new JButton("Cancel");
		
		setBorder(BorderFactory.createTitledBorder("Character Creation"));
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		
		/////////////// Name enter //////////////////////
		gc.anchor = GridBagConstraints.SOUTH;
		gc.weightx = 0.5;
		gc.weighty = 0.4;
		
		gc.gridx = 0;
		gc.gridy = 0;
		add(charName, gc);
		
		gc.anchor = GridBagConstraints.SOUTH;
		gc.weightx = 0.5;
		gc.weighty = 0.4;
		
		gc.gridx = 1;
		gc.gridy = 0;
		add(charNameField, gc);
		
		////////////// Class selection radials ////////////////////
		gc.anchor = GridBagConstraints.SOUTH;
		gc.weightx = 0.5;
		gc.weighty = 0.4;
		
		gc.gridx = 0;
		gc.gridy = 1;
		add(warRad, gc);
		
		gc.anchor = GridBagConstraints.SOUTH;
		gc.weightx = 0.5;
		gc.weighty = 0.4;
		
		gc.gridx = 1;
		gc.gridy = 1;
		add(archRad, gc);
		
		gc.anchor = GridBagConstraints.SOUTH;
		gc.weightx = 0.5;
		gc.weighty = 0.4;
		
		gc.gridx = 2;
		gc.gridy = 1;
		add(wizRad, gc);
		
		///////////////// Accept and Cancel buttons //////////////////////
		
		gc.anchor = GridBagConstraints.SOUTH;
		gc.weightx = 0.5;
		gc.weighty = 0.4;
		
		gc.gridx = 0;
		gc.gridy = 2;
		add(acptBtn, gc);
		
		gc.anchor = GridBagConstraints.SOUTH;
		gc.weightx = 0.5;
		gc.weighty = 0.4;
		
		gc.gridx = 1;
		gc.gridy = 2;
		add(cnclBtn, gc);
		
		
	}
	
	public void showScreen(){
		if(isVisible() == true) setVisible(false);
		else setVisible(true);
	}
	
}
