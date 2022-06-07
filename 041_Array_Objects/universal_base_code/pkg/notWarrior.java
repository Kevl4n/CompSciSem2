import pkg.*;
import java.util.Scanner;
import java.util.Random;


public class Warrior {
	public String name;
	public int health;
	public int dmg;
	public Warrior(){
		name = "olaf";
		health = 100;
		dmg = 10;
	}
	public Warrior(String a){
		name = a;
		health = 100;
		dmg = 10;
	}
	public void attack(Wizard gandalf){
		gandalf.health = gandalf.health - dmg;
		System.out.println(name + "attacked " + gandalf.name + " for " + dmg + " damage!");
		return;
	}
}
