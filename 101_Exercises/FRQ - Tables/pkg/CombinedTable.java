package pkg;
import java.util.Scanner;
import java.util.Random;


public class CombinedTable {
	int seats;
	SingleTable uno;
	SingleTable dos;
	double desire;
	public CombinedTable(SingleTable a, SingleTable b) {
		uno = a;
		dos = b;
		seats = (uno.getNumSeats() + dos.getNumSeats()) - 2;
	}
	public boolean canSeat(int a){
		if(seats >= a){
			return true;
		}
		return false;
	}
	public double getDesirability(){
		if(uno.getHeight() == dos.getHeight()){
			desire = (uno.getViewQuality() + dos.getViewQuality()) / 2;
			return desire;
		}
		else {
			desire = ((uno.getViewQuality() + dos.getViewQuality()) / 2) - 10;
			return desire;
		}
		return desire;
	}
}

