package pkg;
import java.util.Scanner;
import java.util.Random;


public class Spider implements Creature{
    Random rand = new Random();
	private int example = 0;
	private int health = 0;
	private String name = "";
	private int attack = 0;
	private int age;
	public Spider() {
		name = "Charlotte";
		health = rand.nextInt(5)+5;
		attack = rand.nextInt(5)+5;
	}
	public boolean isDead() {
		if(health <= 0){
			return true;
		}
		else {
		    return false;
		}
	}
	public boolean takeDamage(int a){
		health = health - a;
		return isDead();
	}
	public String getName(){
		return name;
	}
	public void atk(Role a){
		a.setHealth(a.getHealth() - attack);
	}
	public void setHealth(int a){
		health = a;
	}
	public int getHealth(){
		return health;
	}

}