import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Choose a role: Wizard, Warrior, or Rogue");
		String choice = sc.nextLine();
		
		if (choice.equals("Wizard")){
			System.out.println("You have chosen the wizard! a wise character with the power of magic!");
		}
		else if (choice.equals("wizard")){
			System.out.println("You have chosen the wizard! a wise character with the power of magic");
		}
		else if(choice.equals("Warrior")){
			System.out.println("You have chosen the warrior! a front liner that can take and dish out a lot of damage!");
		}
		else if(choice.equals("warrior")){
			System.out.println("You have chosen the warrior! a front liner that can take and dish out a lot of damage!");
		}
		else if(choice.equals("Rogue")){
			System.out.println("You have chosen the rogue! fast and cunning, it is hard to catch this character!");
		}
		else if(choice.equals("rogue")){
			System.out.println("You have chosen the rogue! fast and cunning, it is hard to catch this character!");
		}
		else {
			System.out.println("You have not chosen a role.");
		}
	}
}
