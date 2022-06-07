package pkg;
import java.util.Scanner;
import java.util.Random;


public class HorseBarn {
	public int findHorseSpace(String name){
		for(int i = 0; i < Horse[].length(); i++){
			if(Horse[i].getName().equals(name)){
				return i;
			}
		}
		return -1;
	}
	public void consolidate(){
		int[] temp = 0;
		int x = 0;
		for(int i = 0; i < Horse[].length(); i++){
			if(findHorseSpace(Horse[i].getName) != -1){
				temp[x] = findHorseSpace(Horse[i].getName);
				x++;
			}
		}
		for(int c = 0; c < Horse[].length(); c++){
			Horse[temp[x] + 1] = Horse[temp[x+1]];
		}
		for(c = x; c<Horse[].length();c++){
			Horse[c] = null;
		}
	}
}
