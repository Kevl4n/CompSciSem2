import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static int c;
	public static int avg;
	public static int max;
	public static int min;
	public static void toStringArray(int[] x){
		c = 0;
		while(c<x.length){
			System.out.println(x[c]);
			c++;
		}
		return;
	}
	public static int getArrayAverage(int[] x){
		int avg = 0;
		c = 0;
		while(c<x.length){
			avg = avg + x[c];
			c++;
		}
		avg = avg/x.length;
		return avg;
	}
	public static int getArrayMax(int[] x){
		max = 0;
		c = 0;
		while(c<x.length){
			if(x[c] > max){
				max = x[c];
			}
			c++;
		}
		return max;
	}
	public static int getArrayMin(int[] x){
		min = 1000;
		c = 0;
		while(c<x.length){
			if(x[c] < min){
				min = x[c];
			}
			c++;
		}
		return min;
	}
	public static void main(String args[]) {
		// Your code goes below here
		Random rand = new Random();
		int[] arnold = new int[100];
		c = 0;
		while(c<arnold.length){
			arnold[c] = rand.nextInt(100)+1;
			c++;
		}
		toStringArray(arnold);
		System.out.println("Avg: " + getArrayAverage(arnold));
		System.out.println("Max: " + getArrayMax(arnold));
		System.out.println("Min: " + getArrayMin(arnold));
		
		
	}
}
