package pkg;
import java.util.Scanner;
import java.util.Random;


public interface Role {
	public void printArt();
	public boolean atk(Creature a);
	public void setHealth(int a);
	public int getHealth();
}
/*public class Wizard implements Role{
	public String name;
	public int age;
	public Wizard(){
		name = "Gandalf";
		age = "52034";
	}
	public void printArt(){
		System.out.println("This is " + name);
		System.out.println("Insert ASCII art here");
	}
}
public class Warrior implements Role{
	public Warrior(){
		name = "Gimli";
		age = "342";
	}
	public void printArt(){
		System.out.println("This is " + name);
		System.out.println("Insert ASCII art here");
	}
}*/