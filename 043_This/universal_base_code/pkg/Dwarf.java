package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dwarf {
	Random rand = new Random();
	public String name;
	public int age;
	
	public Dwarf(){
		name = "fHaT nUTTs";
		age = 43;
	}
	public Dwarf(String name){
		this.name = name;
		
	}

	public void setName(String a){
		name = a;
	}
	public void setAge(int a){
		age = a;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
}

