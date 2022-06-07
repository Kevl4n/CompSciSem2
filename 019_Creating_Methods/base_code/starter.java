import java.util.Scanner;
import java.util.Random;

class starter {
	public static void toString(String a){
		System.out.println(a);
		return;
	}
	public static void toStringCombined(String a, String b){
		System.out.println(a + " " + b);
		return;
	}
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me a sentence!");
		String bruh = sc.nextLine();
		System.out.println("Give me another sentence!");
		String yeet = sc.nextLine();
		System.out.println("This is using a Method!");	
		toString(bruh);
		toStringCombined(bruh, yeet);
		
	}
}
