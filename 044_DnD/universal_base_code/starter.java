import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Warrior olaf = new Warrior();
		Wizard gandalf = new Wizard();
		System.out.println("Warrior is: " + olaf.getName());
		System.out.println("Wizard is: " + gandalf.getName());
		DnDClass buh = new DnDClass();
		System.out.println("Your custom role is: " + buh.getName());
		System.out.println("HEALTH of Warrior: " + olaf.getHealth());
		System.out.println("HEALTH of Wizard: " + gandalf.getHealth());
		System.out.println("HEALTH of " + buh.getName() + ": " + buh.getHealth());
		
		buh.AttackWiz(gandalf);
	}
}
