package interfacePackage;
import java.util.Scanner;

public class Menu {
	int selection = 0;
	public Menu(){}
	
	public int MainMenu{
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
	
		return selection;
	}
	
}
