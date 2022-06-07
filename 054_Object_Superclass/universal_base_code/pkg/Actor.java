package pkg;
import java.util.Scanner;
import java.util.Random;


public class Actor extends Performer{
    public String type;
    public String name;
    
	public Actor() {
		type = "theater";
	}
    public Actor(String name, String type){
        this.name = name;
        this.type = type;
    }
    public void practice(){
        System.out.println(name + " is practicing a TikTok dance in (a) " + type);
    }
    public void perform(){
        System.out.println(name + "'s practice has all led up to a performance at " + type);
    }
    public void monologue(){
        System.out.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin eu odio turpis. Proin mollis lacus rhoncus libero molestie, nec viverra odio auctor. In vehicula eros eros, nec aliquam nisi ultrices sit amet. Nullam ultricies erat id nisi facilisis fermentum. Praesent condimentum varius nisl. Curabitur posuere libero nisi, vitae tempor sem ornare quis. Nunc ac nulla ac ante tristique aliquam. Morbi sapien justo, aliquam a lacus id, euismod aliquam neque. Vestibulum mauris orci, congue fermentum lectus ultricies, pharetra dapibus augue. Aenean vitae purus at ipsum imperdiet dictum quis vel est. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Fusce ut bibendum nisl.");
    }
    public String toString(){
        return (name + " " + type);
    }
}

