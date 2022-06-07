package pkg;
import java.util.Scanner;
import java.util.Random;


public class Performer {
	public String name;
	public int age;

	public Performer() {
		name = "Doja Cat";
		age = 26;
	}
	public Performer(String name, int age){
	    this.name = name;
	    this.age = age;
	}
	public Performer(String name){
	    this.name = name;
	    age = 26;
	}
	public String getName(){
	    return name;
	}
    public void practice(){
        System.out.println(name + " is practicing");
    }
    public void perform(){
        System.out.println(name + " is performing");
    }
    public String toString(){
    	return (name + " " + age);
    }
    public boolean equals(Performer check){
    	return this.name == check.name;
    }
}

