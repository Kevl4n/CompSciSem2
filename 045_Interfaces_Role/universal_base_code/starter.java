import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		
		Role[] x = new Role[3];
		x[0] = new Warrior();
		x[1] = new Wizard();
		x[2] = new Artificer();
		for(int i = 0; i<3; i++){
			x[i].printArt();
			x[2].attack();
		}
		
	}
}
