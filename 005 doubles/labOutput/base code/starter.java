import java.util.Random;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		
		int F = sc.nextInt();
		int convert = ((F-32)*5/9);
		System.out.println(F + " degrees Fahrenheit is " + convert + " Degrees celsius");
		
	}
}
