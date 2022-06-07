package pkg;
import java.util.Scanner;
import java.util.Random;


public class Classroom {
    public String teacher;
    public int grade
    public int credit;
    public Classroom(String teacher, int grade){
        this.teacher = teacher;
        this.grade = grade;
    }
    public int calcCredit(){
        if(grade >= 90){
            return 4;
        }
        if(grade >= 80 && grade < 90){
            return 3;
        }
        else if(grade >= 70 && grade < 80){
            return 2;
        }
        else if(grade >= 60 && grade < 80){
            return 1;
        }
        else if(grade < 60){
            return 0;
        }
        return 0;
    }
    public int APSci(){
        if(grade >= 90){
            return 5;
        }
        if(grade >= 80 && grade < 90){
            return 4;
        }
        else if(grade >= 70 && grade < 80){
            return 3;
        }
        else if(grade >= 60 && grade < 80){
            return 2;
        }
        else if(grade < 60){
            return 1;
        }
        return 0;
    }
    public boolean RecoverySci(){
        if(grade > 60){
            return true;
        }
        return false;
    }
}

