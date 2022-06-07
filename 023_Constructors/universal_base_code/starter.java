import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		
		Scanner sc = new Scanner(System.in);
		//myCharacter cs = new myCharacter();
		System.out.println("Pick a role:");
		String steve = sc.nextLine();
		myCharacter steven = new myCharacter(steve);
	}
}
