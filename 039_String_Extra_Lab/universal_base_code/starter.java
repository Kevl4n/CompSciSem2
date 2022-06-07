import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		Scanner sc = new Scanner(System.in);
		int x = 0;
		System.out.println("Give me a phrase");
		String input = sc.nextLine();
		int y = input.length();
		String temp = input;
		y= y-1;
		String tupni = "";
		
		for(int i = 0; i<input.length();i++){
			if(input.substring(i,i+1).compareTo(" ") == 0){
				temp = input.substring(x,input.indexOf((" "),x));
				x = input.indexOf((" "),x)+1;
				tupni = temp + " " + tupni;
				System.out.println(temp);
			
			}
			if(input.indexOf((" "),x)==-1){
				temp = input.substring(x, input.length());
				tupni = temp + " " +  tupni;
				System.out.println(temp);
				break;
			}
		}
		System.out.println(tupni);
	}
}
