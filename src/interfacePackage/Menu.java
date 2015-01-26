package interfacePackage;
import java.util.Scanner;

public class Menu {
	int selection = 0;
	int loadSelect = 0;
	public Menu(){}
	
	public int MainMenu(){
		/************************/
		System.out.println("Welcome to Al's RPG");
		System.out.println();
		System.out.println("Please select an option from below list:");
		System.out.println("1. Create new character");
		System.out.println("2. Load character");
		System.out.println();
		System.out.print("0. Exit Game");
		/*************************/
		
		Scanner sc = new Scanner(System.in);
		selection = sc.nextInt();
		sc.close();
		return selection;
	}
	
	public int LoadMenu(){
		
		/***********************/
		System.out.println("Please select a character to load");
		System.out.println();
		// for loop to print number of characters in DB.  Number : Name : Class : Level
		// Scanner sc = new Scanner(System.in);
		// loadSelect = sc.nextInt();
		// sc.close();
		// return selection 0 means nothing, and should go back to main menu to start again
		/***********************/
		
		return loadSelect;
	}
	
}
