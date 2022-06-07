import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Random rand = new Random();
		//String name = "";
		int x = 0;
		int c = -1;
		Dwarf[] olaf = new Dwarf[100];
		for(int i = 0; i<100;i++){
		//	Dwarf[] olaf = new Dwarf[100];
			olaf[i] = new Dwarf(); 
			x = rand.nextInt(7);
			if(x == 0){
				olaf[i].setName("Grumpy");
			}
			else if(x == 1){
				olaf[i].setName("Dopey");
			}
			else if(x == 2){
				olaf[i].setName("Doc");
			}
			else if(x == 3){
				olaf[i].setName("Happy");
			}
			else if(x == 4){
				olaf[i].setName("Bashful");
			}
			else if(x == 5){
				olaf[i].setName("Sneezy");
			}
			else if(x == 6){
				olaf[i].setName("Sleepy");
			}
			int age = rand.nextInt(100)+1;
			System.out.println(olaf[i].getName() + age);
		}
		for(int i = 0; i<100; i++){
			if(olaf[0].getName().equals(olaf[i].getName())){
				c++;
			}
		}
		System.out.println(olaf[0].getName() + " was repeated " + c + " times!");
	}
}
