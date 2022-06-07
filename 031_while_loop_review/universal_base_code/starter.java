import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Random rand = new Random();
		int c = 0;
		while(c < 100){
			System.out.println(rand.nextInt(100)+1);
			c++;
		}


		
	}
}
