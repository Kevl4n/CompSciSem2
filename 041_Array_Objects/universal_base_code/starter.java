import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Random rand = new Random();
		Warrior[] olaf = new Warrior[100];
		Wizard[] gandalf = new Wizard[100];
		int c = 0;
		for(int i = 0;i<100;i++){
			olaf[i] = new Warrior();
		}
		for(int i = 0;i<100;i++){
			gandalf[i] = new Wizard();
		}
		while(olaf[99].isDead() == false || gandalf[99].isDead() == false){
			gandalf[c].attack(olaf[c]);
			olaf[c].attack(gandalf[c]);
			if(olaf[c].isDead() || gandalf[c].isDead()){
				c++;
			}
			if(c == 100){
				break;
			}
		}
		if(olaf[99].isDead()){
			System.out.println("The Wizards have won!");
		}
		else{
			System.out.println("The Warriors have won!");
		}

		
	}
}
