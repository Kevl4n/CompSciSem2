
import java.util.*;

class starter {
	public static void bubbleSort(int[] arr){
		for(int outer = 0; outer < arr.length-1; outer++){
			for(int inner = 0; inner < arr.length-outer-1; inner++){
				if(arr[inner] > arr[inner+1]){
					int temp = arr[inner];
					arr[inner] = arr[inner+1];
					arr[inner+1] = temp;
				}
			}
		}
	}
	public static void selectionSort(int[] arr){
		int outer;
		int inner;
		int min_index;
		for(outer = 0; outer < arr.length; outer++){
			min_index = outer;
			for(inner = outer+1; inner < arr.length; inner++){
				if(arr[inner] < arr[min_index]){
					min_index = inner;
				}
			}
			int temp = arr[outer];
			arr[outer] = arr[min_index];
			arr[min_index] = temp;
		}
	}
	public static void insertionSort(int[] arr){
		int outer;
		int inner;
		int key;
		for(outer = 1; outer < arr.length; outer++){
			key = arr[outer];
			inner = outer - 1;
			while(inner >= 0 && arr[inner] > key){
				arr[inner+1] = arr[inner];
				inner = inner - 1;
			}
			arr[inner+1] = key;
		}
	}
	public static int median(int[] arr){
		int half = 0;
		int halfed = 0;
		if(arr.length%2 == 0){
			half = (arr.length/2);
			halfed = half + 1;
		}
		int median = ((arr[half]+arr[halfed])/2);
		return median;
	}
	public static void main(String args[]) {
		Random rand = new Random();
		int[] buhbble = new int[100];
		int[] selection = new int[100];
		int[] insertion = new int[100];
		int random = 0;
		for(int i = 0; i < buhbble.length; i++){
			random = rand.nextInt(101);
			buhbble[i] = random;
			selection[i] = random;
			insertion[i] = random;
		}
		bubbleSort(buhbble);
		selectionSort(selection);
		insertionSort(insertion);
		System.out.println("bubblesort: " + median(buhbble));
		System.out.println("selectionsort: " + median(selection));
		System.out.println("insertionsort: " + median(insertion));
	}
}
