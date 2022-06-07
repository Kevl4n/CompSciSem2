import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Random rand = new Random();
		int[] arr1 = new int[200];
		//bubbleSort(arr1);			//Create this method
		System.out.println();
		for(int i = 0; i < arr1.length; i++){
			arr1[i] = rand.nextInt(100);
			System.out.print(arr1[i] + ", ");
		}
		System.out.println();
		bubbleSort(arr1);
		for(int i = 0; i < arr1.length; i++){
			System.out.print(arr1[i] + ", ");
		}
	}
	
	public static void bubbleSort(int [] arr){
		for(int outer = 0; outer < arr.length-1; outer++){
			for(int inner = 0; inner < arr.length-1; inner++){
				if(arr[inner] > arr[inner+1]){
					int temp = arr[inner];
					arr[inner] = arr[inner+1];
					arr[inner+1] = temp;
				}
			}
		}
	}
}
