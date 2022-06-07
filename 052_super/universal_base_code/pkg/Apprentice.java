package pkg;
import java.util.Scanner;
import java.util.Random;


public class Apprentice extends Musician {
	public String school;
	public int yearsOfExperience;
	public String name;
	public int age;
	public String instrument;
	public Apprentice() {
		name = "bepis";
		school = "CVHS";
		yearsOfExperience = 0;
		instrument = "my nuts";
	}
	public Apprentice(String school, int yearsOfExperience){
		name = "bepis";
		this.school = school;
		this.yearsOfExperience = yearsOfExperience;
	}
	public Apprentice(String instrument, String school, int yearsOfExperience){
		name = "bepis";
		this.instrument = instrument;
		this.school = school;
		this.yearsOfExperience = yearsOfExperience;
	}
	public Apprentice(String name, int age, String instrument, String school, int yearsOfExperience){
		this.name = name;
		this.age = age;
		this.instrument = instrument;
		this.school = school;
		this.yearsOfExperience = yearsOfExperience;
	}
	public void playInstrument(){
		System.out.println(name + " has just tooted/fingered/played their " + instrument);
	}
	public void practice(){
		System.out.println(name + " has been practicing for " + yearsOfExperience + " yurs");
	}
	public void perform(){
		System.out.println(name + " just performed! WICKED");
	}
	public void practiceAtUni(){
		super.practice();
		System.out.println(" with " + name + " at " + school);
	}
}

