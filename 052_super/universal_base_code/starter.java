import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Apprentice one = new Apprentice();
		one.playInstrument();
		Apprentice two = new Apprentice("i ladies", 42);
		two.practice();
		Apprentice three = new Apprentice("sugondese","phat nuts", 69);
		three.perform();
		Apprentice jhin = new Apprentice("Jhin", 38, "FOUR!", "Rito games", 200);
		jhin.practiceAtUni();
	}
}
