package pkg;
import java.util.Scanner;
import java.util.Random;


public class DnDClass {
	Random rand = new Random();
	String name;
	int health;
	int attack;
	Warrior olaf;
	Wizard gandalf;
	public DnDClass() {
		this("Artificer");
	}
	public DnDClass(String name){
		this.name = name;
		health = rand.nextInt(15)+1;
		attack = rand.nextInt(15)+1;
	}
	
	public void setHealth(int health){
		this.health = health;
	}
	public int getHealth(){
		return health;
	}
	public String getName(){
		return name;
	}
	public void AttackWar(Warrior olaf){
		this.attack = rand.nextInt(attack)+1;
		olaf.setHealth(olaf.getHealth()-attack);
	}
	public void AttackWiz(Wizard gandalf){
		this.attack = rand.nextInt(attack)+1;
		gandalf.setHealth(gandalf.getHealth()-attack);
		System.out.println("You attacked the Wizard for: " + attack + " damage!");
	
		if(gandalf.getHealth() <= 0){
			System.out.println("The Wizard is Dead!");
		}
		else{
			System.out.println("The Wizard now has " + gandalf.getHealth() + " Health!");
		}
	}
}

