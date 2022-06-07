package pkg;
import java.util.Scanner;
import java.util.Random;

public class Designer extends Clothing{
    int buh;
    public String Famous(){
        buh = rand.nextInt(100)+ 1;
        if(buh > 75){
            return "Designed by urmomlole";
        } else if (buh < 75 && buh > 50){
            return "Designed by Kanye West";
        } else if (buh > 25 && buh < 50){
            return "Designed by Yeezy";
        } else if (buh < 25){
            return "Designed by me :(";
        }
        return "";
    }
}