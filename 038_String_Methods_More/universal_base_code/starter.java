import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("What is your full name?");
		String name = sc.nextLine();
		int space = name.indexOf(" ");
		System.out.println(name.substring(space+1, name.length()));

		
	}
}
