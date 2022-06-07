import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Performer one = new Performer();
		one.perform();
		one.practice();
		Performer two = new Musician();
		two.perform();
		two.practice();
		Performer three = new Apprentice();
		three.practiceAtUni();
		three.playInstrument();
		Performer jhin = new Actor();
		jhin.monologue();
		jhin.perform();
		
	}
}
