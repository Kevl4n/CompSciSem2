import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static int getMode(int[] x){
		int[] arr = x;
		int buh = arr.length();
		int count = 0;
		int i = 0;
		int c = i;
		for(i = 0; i < buh;i++){
		
			for(c = i : arr){
				if(arr[i] == arr[i+1]){
					count++;
				}
			}
		}
	}
	public static int getMedian(int[] x){
		int[] arr = x;
		int yee = arr.length();
		int half = (yee/2);
		int median = 0;
		if(yee%2==0){
			median = x[half] + x[half-1];
			median = median/2;
		}
		else{
			median = x[half];
		}
		return median;
		
	}
	public static void main(String args[]) {
		// Your code goes below here


		
	}
}
