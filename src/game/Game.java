package game;
import interfacePackage.Menu;
//import charPack.CharacterCreation;

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
			if(menuOneSelection == 1) gameOver = true; //create new character and return it's Key in the DB
			else if(menuOneSelection == 2) gameOver = true ; //Load already created character and return its key in DB
			else gameOver = true;
			
			if(gameOver != true){
				// take loaded character and start playing game
				
			}
			
		}
	}
	/*
	
	public void playGame( database value ){
		
	}
	
	*/
}
