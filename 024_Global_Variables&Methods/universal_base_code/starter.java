import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		myCharacter cs = new myCharacter();
		System.out.println("Choose: Rogue, Wizard, or Warrior");
		String q = sc.nextLine();
		cs.myToString(q);
		System.out.println("Input your stats:");
		System.out.print("Strength: ");
		int w = sc.nextInt();
		System.out.print("Dexterity: ");
		int e = sc.nextInt();
		System.out.print("Intelligence: ");
		int r = sc.nextInt();
		System.out.print("Constitution: ");
		int t = sc.nextInt();
		System.out.print("Charisma: ");
		int y = sc.nextInt();
		cs.stats(w,e,r,t,y);
	}
}
