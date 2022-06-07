package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	Scanner sc = new Scanner(System.in);
	public String choice;
	public myCharacter(){
		choice = ("");
		System.out.println("Your stats are: ");
		System.out.println("Strength: 5");
		System.out.println("Dexterity: 5");
		System.out.println("Charisma: 5");
		System.out.println("Constitution: 5");
		System.out.println("Intelligence: 5");
	}
	public myCharacter(String a){
		choice = ("");
		if(a.equals("Rogue")){
			System.out.println("You chose " + a + "!");
			System.out.println("Your stats are: ");
			System.out.println("Strength: 5");
			System.out.println("Dexterity: 5");
			System.out.println("Charisma: 5");
			System.out.println("Constitution: 5");
			System.out.println("Intelligence: 5");
		}
		if(a.equals("rogue")){
			System.out.println("You chose " + a + "!");
			System.out.println("Your stats are: ");
			System.out.println("Strength: 5");
			System.out.println("Dexterity: 5");
			System.out.println("Charisma: 5");
			System.out.println("Constitution: 5");
			System.out.println("Intelligence: 5");
		}
	}

	
}

