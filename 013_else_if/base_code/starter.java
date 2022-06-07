import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		int guess = rand.nextInt(1000);
		System.out.println(guess);
		
		System.out.println("Guess a number between 1 and 1000");
		int guessing = sc.nextInt();
		
		if (guessing == guess){
			System.out.println("Your guess was correct!");
		}
		else if(guessing < guess) {
			System.out.println("Your guess is lower than the correct number");
		}
		else if(guessing > guess) {
			System.out.println("Your guess is higher than the correct number");
		}
	}
}
