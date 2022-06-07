import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Ascii buh = new Ascii("cactus", "urmomlole", 1);
		buh.printArt();
		Ascii bruh = new Ascii("cactus");
		bruh.printArt();
		Ascii bu = new Ascii("cactus", 3);
		bu.printArt();
		Ascii b = new Ascii();
		b.setType("custom");
		b.setName("WubTF");
		b.setNumber(1);
		b.printArt();
		
	}
}
