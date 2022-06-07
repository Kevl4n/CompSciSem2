package pkg;
import java.util.Scanner;
import java.util.Random;


public class Musician extends Performer {
    public String instrument;
    public String name;
    public int age;
	public Musician() {
		instrument = "Cello";
	}
	public Musician(String instrument){
	    this.instrument = instrument;
	}
	public Musician(String name, String instrument){
		this.name = name;
		this.instrument = instrument;
	}
	public Musician(String name, String instrument, int age){
		this.name = name;
		this.instrument = instrument;
		this.age = age;
	}
	public String getInstrument(){
	    return instrument;
	}
	public void playInstrument(){
	    System.out.println(name + " plays the " + instrument);
	}
	public void practice(){
	    System.out.println(name + " is practicing with " + instrument);
	}
}

