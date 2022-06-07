package pkg;
import java.util.Scanner;
import java.util.Random;

public class Shirts extends Clothing{
    public String Brand(String a){
        brandname = a + " with collab with Yeezys";
        return brandname;
    }
    public boolean Sleeve(String a){
        if(a.equals("short")){
            return true;
        } else if(a.equals("long")){
            return false;
        }
        return true;
    }
}