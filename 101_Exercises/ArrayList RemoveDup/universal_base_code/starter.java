import java.util.*;

class starter {
	public static void main(String args[]) {
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		addValuesInt(arr1, 100);
		printValuesInt(arr1);
		removeDup(arr1);		//Create this method.
		System.out.println(" ");
		printValuesInt(arr1);
	}

	public static void addValuesInt(ArrayList<Integer> arr, int num){
		for(int i = 0; i < num; i++){
			arr.add((int)(Math.random()*100));
		}
	}

	public static void printValuesInt(ArrayList<Integer> arr){
		for(int i = 0; i < arr.size(); i++){
			System.out.print(arr.get(i) + ", ");
		}
	}
	public static void removeDup(ArrayList<Integer> arr){
		for(int first = 0; first < arr.size(); first++){
			for(int i = first+1; i < arr.size(); i++){
				if(arr.get(first) == arr.get(i)){
					arr.remove(i);
					i--;
				}
			}
		}
	}
}
