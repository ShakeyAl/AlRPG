package game;
import interfacePackage.Menu;

public class Game {
	int menuOneSelection;
	public Game(){}
	
	public void start(){
		Boolean gameOver = false;
		while(gameOver == false){
			menuOneSelection = Menu.MainMenu();
			// if(menuOneSelection == 1) create new character
			// else if(menuOneSelection == 2) Load already created character
			// else gameOver = true;
			
			//take loaded character and contine to playing game
			
			gameOver = true; //  this is for testing just so i'm not stuck in an infinite loop
			
		}
	}
	/*
	
	public void playGame( database value ){
		
	}
	
	*/
}
