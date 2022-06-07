package pkg;
import java.util.Scanner;
import java.util.Random;


public class Combinatoric {
	public static int factorial(int n){
		if(n != 1){
			for(int i = (n - 1); i > 0; i--){
				n = n*i;
			}
			return n;
		}
		return n;
	}
	public static void numCombinations (int n, int r){
		int numerator = factorial(n);
		int denom = factorial(r) * factorial(n - r);
		int choices = 0;
		if(r>n){
			System.out.println("There are 0 ways to get " + r " items from " + n " choices");
		} else {
			choices = (factorial(n) / (factorial(r) * factorial(n-r)));
			System.out.println("There are " + choices + " ways of choosing " + r + " items from " + n + " choices");
		}
		
	}
}
