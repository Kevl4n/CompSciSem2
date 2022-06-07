package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter{
		public String role;
		public int strength;
		public int dexterity;
		public int intelligence;
		public int constitution;
		public int charisma;
	public myCharacter(){
		role = ("");
		strength = 0;
		dexterity = 0;
		intelligence = 0;
		constitution = 0;
		charisma = 0;
	}
	public void myToString(String a){
		System.out.println("Your role is: " + a);
		return;
		
	}
	public void stats(int w, int e, int r, int t, int y){
		System.out.println("Your stats are: ");
		System.out.println("Strength: " + w);
		System.out.println("Dexterity: " + e);
		System.out.println("Intelligence: " + r);
		System.out.println("Constitution: " + t);
		System.out.println("Charisma: " + y);
		return;
	}
	
}

