import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Random rand = new Random();
		int uno = rand.nextInt(10);
		System.out.println(uno);
		
		int hundred = rand.nextInt(100);
		System.out.println(hundred+1);
		
		double hund = rand.nextDouble();
		System.out.println(hund + 2.5);
		
		int fourteen = rand.nextInt(574 + 15);
		double fiveightnine = rand.nextDouble();
		System.out.println(fourteen + fiveightnine);
	}
}
