package Flyable;

public class Main {



    public static void main(String[] args) {
        Helicopter helicopter = new Helicopter("gg","Big");

        System.out.println(helicopter.getName());

        helicopter.setName("Wp is my name");


        System.out.println(helicopter.getName());

        Airport airport = new Airport();
        airport.addHelicopter(helicopter);
        airport.printAll();

    }

}
