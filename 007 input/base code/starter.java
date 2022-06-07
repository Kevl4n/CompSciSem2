import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = sc.nextLine();
		
		System.out.println("What is your age?");
		int age = sc.nextInt();
		
		System.out.println("What month were you born? (1-12)");
		int month = sc.nextInt();
		
		System.out.println("What day were you born? (1-31)");
		int day = sc.nextInt();
		
		System.out.println("What year were you born?");
		int year = sc.nextInt();
		
		System.out.println("How much a buck fity");
		double buckfity = sc.nextDouble();
		
		System.out.println("Hello, " +  name + ",");
		System.out.println("I have learned many things about you.");
		System.out.println("Your age is " + age + ",");
		System.out.println("This makes ur birthday on " + month + "/" + day + "/" + year + ",");
		System.out.println("and you currently own " + buckfity + " in your wallet.");
	}
}
