import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		int c = 1;
		
		System.out.println("Name. Now.");
		String name = sc.nextLine();
		System.out.println("Number. Now.");
		int count = sc.nextInt();
		
		while(c<=count){
			System.out.println(name);
			c = c + 1;
		}



		
	}
}
