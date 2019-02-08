package Flyable;

import java.util.ArrayList;
import java.util.List;

public class Airport implements Printable {

    private List<Helicopter> helicopters ;


    public Airport(){
        helicopters = new ArrayList<Helicopter>();
    }

    public void addHelicopter (Helicopter helicopter){
        helicopters.add(helicopter);
    }
    @Override
    public void printAll(){
        for (Helicopter heliz:helicopters
             ) {
            System.out.println(heliz.getName());
        }
    }
}
