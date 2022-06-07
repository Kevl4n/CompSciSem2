import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Random rand = new Random();
		BaseClass test = new BaseClass();
		int[] arnold = new int[1000];
		int c = 0;
		while(c<1000){
			int bruh = rand.nextInt(1000);
			arnold[c] = bruh;
			System.out.println(arnold[c]);
			c++;
		}

		
	}
}
