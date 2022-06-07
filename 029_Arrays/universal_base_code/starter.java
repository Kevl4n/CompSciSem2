import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int[] arnold = new int[10];
		int c = 0;
		int x = 9;
		while (c < 10){
			arnold[c] = x;
			System.out.println(arnold[c]);
			c++;;
			x = x-1;
		}
		System.out.println(arnold[9]);
		System.out.println(arnold[0]);
	}
}
