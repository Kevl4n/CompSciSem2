import pkg.*;
import java.util.Scanner;
import java.util.Random;


public class Wizard {
	public String name;
	public int health;
	public int dmg;
	public Wizard(){
		name = "gandalf";
		health = 100;
		dmg = 10;
	}
	public Wizard(String a){
		name = a;
		health = 100;
		dmg = 10;
	}
	public void attack(Warrior olaf){
		olaf.health = olaf.health - dmg;
		System.out.println(name + "attacked " + olaf.name + " for " + dmg + " damage!");
		return;
	}
}
