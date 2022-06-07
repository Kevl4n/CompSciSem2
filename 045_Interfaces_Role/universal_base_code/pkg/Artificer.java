package pkg;
import java.util.Scanner;
import java.util.Random;

public class Artificer implements Role{
    Random rand = new Random();
    public String name;
    public int age;
    public int attack;
    public Artificer(){
        name = "urmomlole";
        age = 42;
    }
    public void printArt(){
        System.out.println("Insert ASCII art here");
    }
    /*public void attack(Warrior a){
        attack = rand.nextInt(15)+1;
        a.setHealth(a.getHealth() - attack);
        System.out.println("The Warrior now has " + a.getHealth() + " HP left!");
    }
    public void attack(Wizard a){
        attack = rand.nextInt(15)+1;
        a.setHealth(a.getHealth() - attack);
        System.out.println("The Wizard now has " + a.getHealth() + " HP left!");
    }*/
    public void attack(){
        attack = rand.nextInt(15)+1;
        System.out.println("Your Artificer's attack is " + attack);
    }
}