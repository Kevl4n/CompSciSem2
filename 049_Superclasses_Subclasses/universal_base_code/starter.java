import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Performer one = new Performer();
		Performer two = new Performer("Glaive", 16);
		Musician three = new Musician();
		Musician jhin = new Musician("gun");
		System.out.println(one.getName());
		one.perform();
		System.out.println(two.getName());
		two.perform();
		System.out.println(three.getName());
		three.perform();
		three.playInstrument();
		jhin.practice();
		System.out.println(jhin.getInstrument());

	}
}
