import java.util.*;

class starter {
	public static Random rand = new Random();
	
	//Methods go here
	public static void printArrayList(ArrayList<Integer> arr){
		for(int i = 0; i < arr.size(); i++){
			System.out.println(arr.get(i));
		}
	}
	public static void addValuesArrayList(int n, ArrayList<Integer> arr){
		//Random rand = new Random();
		for(int c = 0; c < n; c++){
			arr.add(rand.nextInt(100)+1);
		}
	}
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		int e = 0;
		ArrayList <Integer> arr = new ArrayList<Integer>();
		System.out.println("Give me a number, which will signify how many values go into an array list");
		e = sc.nextInt();
		addValuesArrayList(e, arr);
		printArrayList(arr);


	}
}
