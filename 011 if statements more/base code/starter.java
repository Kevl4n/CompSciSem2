import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Put ur first variable: ");
		int x = sc.nextInt();
		System.out.println("Put ur second variable: ");
		int y = sc. nextInt();
		
		if(x == y){
			System.out.println("Your numbers are the same!");
		}
		else {
			System.out.println("Your numbers are different!");
		}
	}
}
