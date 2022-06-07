package pkg;
import java.util.ArrayList;


public class OnlinePurchaseManager
{
   private ArrayList<Gizmo> purchases;
   public String mooker;
   public boolean ase;
   public double costerino;
   public boolean hasAdjacentEqualPair(){
      if(Gizmo.maker.equals(Gizmo.maker))
      
      for(int i = 0; i < purchases.size()-1; i++){
         if(purchases.get(i).equals(purchases.get(i+1))){
         return true;
         }
      }
      return false;
      
   }
   public int countElectronicsByMaker(String mkr){
      int c = 0;
      for(int i = 0; i < purchases.size(); i++){
         if(purchases.get(i).getMaker().equals(mkr)){
            if(purchases.get(i).isElectronic()){
               c++;
            }
         }
      }
      return c;
   }
   public Gizmo getCheapestGizmoByMaker( String mkr )
   {
   	double costs = 1000000;
   	int c = 0;
   	for(int i = 0; i < purchases.size(); i++){
   	   if(purchases.get(i).getMaker().equals(mkr)){
   	      if(purchases.get(i).getCost() < costs){
   	         costs = purchases.get(i).getCost();
   	         c = i;
   	      }
   	   }
   	}
   	return purchases.get(c);
   }
   public void add(String mkr, boolean isee, double costed){
      mooker = mkr;
      ase = isee;
      costerino = costed;
      purchases = new ArrayList<Gizmo>();
      Gizmo a = new Gizmo(mooker, ase, costerino);
      purchases.add(a);
   }
   
   public String toString()
   {
   	return "" + purchases;
   }
}
