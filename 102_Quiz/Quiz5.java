



class BatterCharger {

public int total;
public int optimal;
public int ix;
public int counter;
public int deez;
private int getChargingCost(int startHour, int chargeTime){
    total = 0;
    counter = deez;
    for(deez = 0; i < chargeTime; i++){
        if(startHour + counter > 23){
            counter = 0;
        }
        total = rateTable[startHour + counter] + total;
    }
    return total;
}
public int getChargeStartTime(int chargeTime){
    optimal = 0;
    ix = 0;
    for(int i = 0; i < 23; i++){
        while(ix < 23){
            if(getChargingCost(ix,chargeTime) < getChargingCost(ix + 1, chargeTime)){
                optimal = i;
                ix++;
            }  
            else {
                ix++;
            }
        }
        
    }
    return optimal;
}
}