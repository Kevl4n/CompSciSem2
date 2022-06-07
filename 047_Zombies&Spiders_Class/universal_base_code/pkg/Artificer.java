package pkg;
import java.util.Scanner;
import java.util.Random;

public class Artificer implements Role{
    Random rand = new Random();
    public String name;
    public int age;
    public int attack;
    public int health;
    public Artificer(){
        name = "urmomlole";
        age = 42;
    }
    public void printArt(){
        System.out.println("Insert ASCII art here");
    }
    public void setHealth(int a){
        health = a;
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
    public boolean atk(Creature a){
        attack = rand.nextInt(15)+1;
       a.setHealth(a.getHealth() - attack);
        return a.isDead();
    }
}