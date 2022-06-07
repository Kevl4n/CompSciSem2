import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Shirts gucci = new Shirts();
		System.out.println(gucci.Quantity(69));
		System.out.println(gucci.Brand("Gucci"));
		if(gucci.Sleeve("long"))
			System.out.println("This shirt is short sleeved");
		else 
			System.out.println("This shirt is long sleeved");
		Socks nuts = new Socks();
		System.out.println(nuts.Brand("urmomlole"));
		
	}
}
