import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Random rand = new Random();
		int[] arnold = new int[100];
		int c = 0;
		int min = 100;
		int max = 0;
		int avg = 0;
		while(c<arnold.length){
			arnold[c] = rand.nextInt(100)+1;
			System.out.println(arnold[c]);
			if(arnold[c] < min){
				min = arnold[c];
			}
			if(arnold[c] > max){
				max = arnold[c];
			}
			avg = avg + arnold[c];
			c++;
		}
		System.out.println("max: " + max);
		System.out.println("min: " + min);
		System.out.println("Avg: " + (avg/100));

		
	}
}
