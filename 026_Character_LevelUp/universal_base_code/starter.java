import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		myCharacter lvl = new myCharacter();
		Scanner sc = new Scanner(System.in);
		System.out.println("What is ur role? Your options are Wizard, Warrior, or Rogue");
		String role = sc.nextLine();
		lvl.role(role);
		lvl.levelUp();
	}
}
