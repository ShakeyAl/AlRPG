package game;
import interfacePackage.Menu;
//import charPack.CharacterCreation;


import java.util.Scanner;

public class Game {
	
	Scanner scan1;
	Menu mainM;
	boolean playing = true;
	int mmsel; // main menu selection
	int ccsel; // character class selection
	String cnsel; // character name selection
	int clsel;
	
	public Game(){
		mainM = new Menu();
		scan1 = new Scanner(System.in);
		playing = true;
	}
	
	public void start(){
		
		// while loop for starting the game
		while(playing == true){
			// prints the main menu
			mainM.MainMenu();
			
			System.out.print("Please enter your selection:  ");
			mmsel = scan1.nextInt();
			
			if(mmsel == 1){
				mainM.CharClass();
				System.out.print("Enter your selection: ");
				ccsel = scan1.nextInt(); // make sure this is an int
				System.out.print("Please enter your characters name: ");
				cnsel = scan1.next(); // make sure this is a string
				// currentChar = CharacterCreation.createChar( cnsel, ccsel)
				// this.playGame(currentChar);
			}
			else if( mmsel == 2 ){
				mainM.LoadMenu();
				// print out list of characters from database
				// System.out.println("Enter your selection: ");
				// clsel = scan1.nextInt();
				
				// currentChar = loadChar( clsel );
				// this.plaGame(currentChar);
			}
			else playing = false;
			
		}
	}
	
	public void end(){
		System.out.println();
		System.out.println("Game Over!");
		scan1.close();
	}
	/*
	
	public void playGame( currentCharacter ){
		
	}
	
	*/
}
