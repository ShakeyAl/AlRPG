package game;
import interfacePackage.Menu;
import charPack.CharacterCreation;

public class Game {
	int menuOneSelection;
	Menu mainM;
	
	public Game(){
		mainM = new Menu();
	}
	
	public void start(){
		Boolean gameOver = false;
		while(gameOver == false){
			menuOneSelection = mainM.MainMenu();
			if(menuOneSelection == 1) gameOver = true; //create new character
			else if(menuOneSelection == 2) gameOver = true ; //Load already created character
			else gameOver = true;
			
			//take loaded character and contine to playing game
			
			gameOver = true; //  this is for testing just so i'm not stuck in an infinite loop
			
		}
	}
	/*
	
	public void playGame( database value ){
		
	}
	
	*/
}
