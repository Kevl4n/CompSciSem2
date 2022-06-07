import java.util.Scanner;
import java.util.Random;
import java.lang.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		int rando = r.nextInt(1000+1);
		
		while(true){
			System.out.println("Give me a number between 1-1000");
			
			int guess = sc.nextInt();
			if(guess == rando){
				System.out.println("congrats! you guessed it!");
				break;
			}
			else{
				System.out.println("Nope, guess again.");
				rando = r.nextInt(1000+1);
				System.out.println("you are " + (Math.abs(rando-guess)) + " away from ur number");
			}
		}
	
	
			
		}
	}
