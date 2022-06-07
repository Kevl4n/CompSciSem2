package pkg;
import java.util.Scanner;
import java.util.Random;

public class Artificer implements Role{
    Random rand = new Random();
    public String name;
    public int age;
    public int attack;
    public in health;
    public Artificer(){
        name = "urmomlole";
        age = 42;
        health = rand.nextInt(5)+5;
    }
    public void printArt(){
        System.out.println("Insert ASCII art here");
    }
    public boolean atk(Creature a){
        a.health() = a.health - attack;
        return a.isDead();
    }
    public int getHealth(){
        return health;
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