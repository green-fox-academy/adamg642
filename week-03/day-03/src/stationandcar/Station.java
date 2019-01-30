package stationandcar;

public class Station {
    int gasAmount;

    public Station (int gasAmount){
        this.gasAmount = gasAmount;
    }

    public void reFill (Car car){
        int fillAmount = car.capacity - car.gasAmount;
        gasAmount -= fillAmount;
        car.gasAmount += fillAmount;
    }
}
