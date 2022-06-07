package pkg;
import java.util.Random;

public class Gizmo
{ 
   Random rand = new Random();
   public static String maker;
   public boolean isE;
   public double cost;
   public Gizmo(String maker, boolean isE){
      this.isE = isE;
      this.maker = maker;
      cost = rand.nextInt(50) + rand.nextDouble();
   }
   public Gizmo(String maker, boolean isE, double cost){
      this.isE = isE;
      this.maker = maker;
      this.cost = cost;
   }
   public String getMaker(){
      return maker;
   }
   public boolean isElectronic(){
      return isE;
   }
   public double getCost(){
      return cost;
   }
   public String toString()
   {
   	return "" + maker + " " + isE + " " + cost;
   }
}
