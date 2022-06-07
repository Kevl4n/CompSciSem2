import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		myCharacter cs = new myCharacter();
		int st;
		int de;
		int in;
		int co;
		int ch;
		System.out.println("give me a role between a wizard, warrior, or rogue:");
		String role = sc.nextLine();
		cs.role(role);
		System.out.println("You have 25 points to spend on your stats: Strength, Dexterity, Intelligence, Constitution, and Charisma. Spend them wisely.");
		while(true){
			System.out.print("Strength: ");
			st = sc.nextInt();
			if(st > 10){
				System.out.println("You cannot put more than 10 points into strength");
			}
			else if(st <= 10){
				break;
			}
		}
		while(true){
			System.out.print("Dexterity: ");
			de = sc.nextInt();
			if(de > 10){
				System.out.println("You cannot put more than 10 points into Dexterity");
			}
			else if(de <= 10){
				break;
			}
		}
		while(true){
			System.out.print("Intelligence: ");
			in = sc.nextInt();
			if(in > 10){
				System.out.println("You cannot put more than 10 points into Intelligence");
			}
			else if(in <= 10){
				break;
			}
		}
		while(true){
			System.out.print("Constitution: ");
			co = sc.nextInt();
			if(co > 10){
				System.out.println("You cannot put more than 10 points into Constitution");
			}
			else if(co <= 10){
				break;
			}
		}
		while(true){
			System.out.print("Charisma: ");
			ch = sc.nextInt();
			if(ch> 10){
				System.out.println("You cannot put more than 10 points into Charisma");
			}
			else if(ch <= 10){
				break;
			}
		}
		
		
		boolean qwer = cs.setAll(role, st, de, in, co, ch);
		if(qwer == true){
		System.out.println("-----------------------------");
		System.out.println("You have chosen " + role + " And your stats are: ");
		cs.strength(st);
		cs.dexterity(de);
		cs.intelligence(in);
		cs.constitution(co);
		cs.charisma(ch);
		}
		else if(qwer == false){
			
		}
	}
}
