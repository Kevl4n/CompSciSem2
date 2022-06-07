import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Random rand = new Random();
		int x = rand.nextInt(79);
		int y = rand.nextInt(13);
		
		System.out.println("The first variable is: " + x);
		System.out.println("The second variable is: " + y);
		if(x == y){
			System.out.println("The numbers are the same");
		}
		else {
			System.out.println("The numbers are not the same");
		}
	}
}
