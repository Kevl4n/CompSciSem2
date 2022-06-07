import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Performer [] nuts = new Performer[4];
		nuts[0] = new Performer("Glaive", 16);
		System.out.println(nuts[0]);
		nuts[1] = new Musician("Jhin", "FOUR");
		System.out.println(nuts[1]);
		nuts[2] = new Apprentice("Deez", "nuts", "University of BOFA");
		System.out.println(nuts[2]);
		nuts[3] = new Actor("bofa", "deez nutz");
		System.out.println(nuts[3]);
		System.out.println(nuts[0].equals(nuts[1]));
	}
}
