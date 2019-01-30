package stationandcar;

public class StationAndCarMain {

    public static void main(String[] args) {

        Car ferrari = new Car();
        Station petrolStation = new Station(3500);


        System.out.println(petrolStation.gasAmount);
        System.out.println(ferrari.gasAmount);


        petrolStation.reFill(ferrari);

        System.out.println(petrolStation.gasAmount);
        System.out.println(ferrari.gasAmount);

    }


}
