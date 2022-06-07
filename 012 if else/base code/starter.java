import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		int guess = rand.nextInt(1000 + 1);
		System.out.println("Guess a number between 1 and 1000");
		int guessed = sc.nextInt();
		
		if(guessed == guess){
			System.out.println("Your guess is correct!");
		}
		else {
			System.out.println("You are wrong!");
			System.out.println("The correct number is: " + guess);
		}
	}
}
