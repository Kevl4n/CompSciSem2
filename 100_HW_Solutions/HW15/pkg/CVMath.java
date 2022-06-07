package pkg;

public class CVMath {		
	public static int findMid(int one, int two, int three)
	{
		return (one + two + three - Math.min(one,Math.min(two,three)) - Math.max(one,Math.max(two,three)));
	}
	
	public static boolean checkSquare(double n){
		double sqrt = Math.sqrt(n);
		return ((sqrt - Math.floor(sqrt)) == 0);
	}
	public static double checkAdd(double n){
		int sum = 0;
		for(int i = 1; i <= n; i++){
			sum += (i * i);
		}
		return sum;
	}
	public static void both(int n){
		for(double i = 0; i <= n; i++){
			if(checkSquare(i) == true || checkAdd(i) == i * i){
				System.out.print(i + " ");
			}
		}
	}
	
}
