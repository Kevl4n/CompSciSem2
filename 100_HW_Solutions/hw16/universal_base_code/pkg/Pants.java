package pkg;
import java.util.Scanner;
import java.util.Random;

public class Pants extends Clothing{
    public boolean Ripped(String a){
        if(a.equals("ripped")){
            return true;
        } else if(a.equals("not ripped")){
            return false;
        }
        return false;
    }
}