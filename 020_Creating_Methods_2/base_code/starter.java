import java.util.Scanner;
import java.util.Random;

class starter {
	public static int pow(int a, int b){
		int count = 1;
		int x = a;
		while(count<b){
			a = a*x;
			count = count + 1;
		}
		return a;
	}
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me a number");
		int x = sc.nextInt();
		System.out.println("Now give me its power");
		int y = sc.nextInt();
		int c = pow(x,y);
		System.out.println(c);
		//System.out.println(Math.pow(5,2));
	}
}
