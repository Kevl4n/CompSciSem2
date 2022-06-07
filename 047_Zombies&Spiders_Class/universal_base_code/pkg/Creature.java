package pkg;
import java.util.Scanner;
import java.util.Random;


public interface Creature {
	public boolean isDead();
	public boolean takeDamage(int a);
	public String getName();
	public void atk(Role a);
	public void setHealth(int a);
	public int getHealth();
}

