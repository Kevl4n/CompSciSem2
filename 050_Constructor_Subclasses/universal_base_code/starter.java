import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Musician one = new Musician();
		Musician two = new Musician("gun");
		Musician three = new Musician("Glaive","His laptop OMEGALUL");
		Musician jhin = new Musician("Jhin", "FOUR", 69);
		System.out.println(three.getName());
		three.practice();
		System.out.println(three.getInstrument());
		System.out.println(jhin.getName());
		jhin.perform();
		jhin.playInstrument();
	}
}
