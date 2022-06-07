package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	static String role;
	static int st;
	static int de;
	static int in;
	static int co;
	static int ch;
	static int total;
	int level;
	int points;
	public boolean sA;
	public myCharacter(){
		role = ("no role");
		st = 0;
		de = 0;
		in = 0;
		co = 0;
		ch = 0;
		total = 0;
		level = 0;
		points = 0;
	}
	public void role(String a){
		if(a.equals("Wizard")||a.equals("wizard"))
			System.out.println("You have chosen the wizard!");
		else if(a.equals("Warrior")||a.equals("warrior"))
			System.out.println("You have chosen the warrior!");
		else if(a.equals("Rogue")||a.equals("rogue"))
			System.out.println("You have chosen the rogue!");
		else 
			System.out.println("You have not chosen a role.");
		return;
	}
	
	private int strength(int a){
		st = a;
		System.out.println("Strength: " + st);
		return st;
	}
	private int dexterity(int b){
		de = b;
		System.out.println("Dexterity: " + de);
		return de;
	}
	private int intelligence(int c){
		in = c;
		System.out.println("Intelligence: " + c);
		return in;
	}
	private int constitution(int d){
		co = d;
		System.out.println("Constitution: " + d);
		return co;
	}
	private int charisma(int e){
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
	private boolean checkPoints(int a){
		int x = a;
		if(x>10 || x<0|| x>points){
			System.out.println("You don't have that many points/ you chose a number below 0");
			return false;
		}
		else {
			
			return true;
		}
	}
	public void levelUp(){
		Scanner sc = new Scanner(System.in);
		if(level == 0){
			level = level++;
			points = points + 25;
		}
		else{
			level = level++;
			points = points + 10;
		}
		System.out.println("Now choose your skill points. You have 25 and can put it into 5 categories: Strength, Dexterity, Intelligence, Constitution, and Charisma.");
		System.out.print("Strength (1-10): ");
		int strength = sc.nextInt();
		if(checkPoints(strength)){
			points = (points - strength);
			if(points ==0){
				System.out.println("You are out of points");
				return;
			}
		}
		
		System.out.print("Dexterity (1-10): ");
		int dexterity = sc.nextInt();
		if(checkPoints(dexterity)){
			points = (points - dexterity);
			if(points ==0){
				System.out.println("You are out of points");
				return;
			}
		}
		System.out.print("Intelligence (1-10): ");
		int intelligence = sc.nextInt();
		if(checkPoints(intelligence)){
			points = (points - intelligence);
			if(points ==0){
				System.out.println("You are out of points");
				return;
			}
		}
		System.out.print("Constitution (1-10): ");
		int constitution = sc.nextInt();
		if(checkPoints(constitution)){
			points = (points - constitution);
			if(points ==0){
				System.out.println("You are out of points");
				return;
			}
		}
		System.out.print("Charisma (1-10): ");
		int charisma = sc.nextInt();
		if(checkPoints(charisma)){
			points = (points - charisma);
			if(points ==0){
				System.out.println("You are out of points");
				return;
			}
		}
		System.out.println("You now have " + points + "points left");
		return;
	}
	
	
}

