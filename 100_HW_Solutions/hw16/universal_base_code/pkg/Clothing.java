package pkg;
import java.util.Scanner;
import java.util.Random;


public class Clothing {
	public int quant;
	public String brandname;
	public String color;
	public int price;
	public String prod;
	Random rand = new Random();
	public Clothing(){
		quant = 40;
		brandname = "gucci";
		color = "red";
		price = 69;
		prod = "Kanye West";
	}
	public int Quantity(int a){
        quant = a;
        return quant;
    }
    public String Brand(String a){
        brandname = a;
        return brandname;
    }
    public String Color(String a){
        color = a;
        return color;
    }
    public int Price(){
        price = rand.nextInt(50) + 50;
        return price;
    }
    public String ClothProd(String a){
        prod = a;
        return prod;
    }
}
