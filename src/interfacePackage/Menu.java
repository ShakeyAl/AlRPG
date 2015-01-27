package interfacePackage;

public class Menu {
	
	public Menu(){}
	
	public void MainMenu(){
		/************************/
		System.out.println();
		System.out.println("Welcome to Al's RPG");
		System.out.println();
		System.out.println("Please select an option from below list:");
		System.out.println("1. Create new character");
		System.out.println("2. Load character");
		System.out.println();
		System.out.print("0. Exit Game");
		System.out.println();
		/*************************/
	}
	
	public void CharClass(){
		/*************************/
		System.out.println();
		System.out.println("Please select a class: ");
		System.out.println("1. Warrior");
		System.out.println("2. Wizard");
		System.out.println("3. Archer");
		System.out.println();
		/*************************/		
	}
	
	public void LoadMenu(){
		/***********************/
		System.out.println();
		System.out.println("Please select a character to load");
		System.out.println();
		/***********************/
	}
	
}
