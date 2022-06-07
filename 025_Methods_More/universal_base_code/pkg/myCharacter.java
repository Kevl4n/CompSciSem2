package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	public String r;
	public int st;
	public int de;
	public int in;
	public int co;
	public int ch;
	public int total;
	public boolean sA;
	public String role(String a){
		if(a.equals("Wizard"))
			System.out.println("You have chosen the wizard!");
		else if(a.equals("wizard"))
			System.out.println("You have chosen the wizard!");
		else if(a.equals("Warrior"))
			System.out.println("You have chosen the warrior!");
		else if(a.equals("warrior"))
			System.out.println("You have chosen the warrior!");
		else if(a.equals("Rogue"))
			System.out.println("You have chosen the rogue!");
		else if(a.equals("rogue"))
			System.out.println("You have chosen the rogue!");
		else 
			System.out.println("You have not chosen a role.");
		return a;
	}
	
	public int strength(int a){
		st = a;
		System.out.println("Strength: " + st);
		return st;
	}
	public int dexterity(int b){
		de = b;
		System.out.println("Dexterity: " + de);
		return de;
	}
	public int intelligence(int c){
		in = c;
		System.out.println("Intelligence: " + c);
		return in;
	}
	public int constitution(int d){
		co = d;
		System.out.println("Constitution: " + d);
		return co;
	}
	public int charisma(int e){
		ch = e;
		System.out.println("Charisma: " + e);
		return ch;
	}
	public boolean setAll(String a, int b, int c, int d, int e,int f) {
		boolean steve;
		total = b + c + d + e + f;
		if(total > 25){
			System.out.println("-------------------------------------");
			System.out.println("You have used more than 25 points");
			return false;
		}
		else if(total <= 25){
			return true;
		}
		return false;
	}
	
}

