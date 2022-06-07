import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What's your name?");
		String name = sc.nextLine();
		System.out.println("What is your title? (Ex. Dragon slayer)");
		String title = sc.nextLine();
		System.out.println("What role would you like? Wizard, Rogue, or Warror?");
		String role = sc.nextLine();
		
		if (role.equals("Wizard"))
			System.out.println("You have chosen the wizard! a wise character with the power of magic!");
		else if (role.equals("wizard"))
			System.out.println("You have chosen the wizard! a wise character with the power of magic");
		else if(role.equals("Warrior"))
			System.out.println("You have chosen the warrior! a front liner that can take and dish out a lot of damage!");
		else if(role.equals("warrior"))
			System.out.println("You have chosen the warrior! a front liner that can take and dish out a lot of damage!");
		else if(role.equals("Rogue"))
			System.out.println("You have chosen the rogue! fast and cunning, it is hard to catch this character!");
		else if(role.equals("rogue"))
			System.out.println("You have chosen the rogue! fast and cunning, it is hard to catch this character!");
		else 
			System.out.println("You have not chosen a role.");
			
		int points = 25;
		System.out.println("Now choose your skill points. You have 25 and can put it into 5 categories: Strength, Dexterity, Intelligence, Constitution, and Charisma.");
		System.out.print("Strength (1-10): ");
		int strength = sc.nextInt();
		points = (points - strength);
		System.out.println("You have " + points + " points left");
		if(strength > 10)
			System.out.println("You cannot put that many points into strength.");
		System.out.print("Dexterity (1-10): ");
		int dexterity = sc.nextInt();
		points = (points - dexterity);
		System.out.println("You have " + points + " points left");
		if(dexterity > 10)
			System.out.println("You cannot put that many points into dexterity");
		System.out.print("Intelligence (1-10): ");
		int intelligence = sc.nextInt();
		points = (points - intelligence);
		System.out.println("You have " + points + " points left");
		if(intelligence > 10)
			System.out.println("You cannot put that many points into intelligence");
		System.out.print("Constitution (1-10): ");
		int constitution = sc.nextInt();
		points = (points - constitution);
		System.out.println("You have " + points + " points left");
		if(constitution > 10)
			System.out.println("You cannot put that many points into constitution");
		System.out.print("Charisma (1-10): ");
		int charisma = sc.nextInt();
		points = (points - constitution);
		System.out.println("You have " + points + " points left");
		if(charisma >10)
			System.out.println("You cannot put that many points into charisma");
		if(points == 0){
			System.out.println("Your character has been created!");
			System.out.println("--------------------------------------------");
			System.out.println("You are " + name + ", the " + title + " of CVHS.");
			System.out.println("You are a " + role + " with the following stats: ");
			System.out.println("Strength - " + strength);
			System.out.println("Dexterity - " + dexterity);
			System.out.println("Intelligence - " + intelligence);
			System.out.println("Constitution - " + constitution);
			System.out.println("Charisma - " + charisma);
			System.out.println("Good luck your quest " + name + "!");
		}
		else
			System.out.println("You fucked up somewhere dawg");
	}
}
