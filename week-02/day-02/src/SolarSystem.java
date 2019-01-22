
import java.util.*;

public class SolarSystem{
    public static void main(String... args){
        ArrayList<String> planetList = new ArrayList<String>(Arrays.asList("Mercury","Venus","Earth","Mars","Jupiter","Uranus","Neptune"));

        // Saturn is missing from the planetList
        // Insert it into the correct position
        // Create a method called putSaturn() which has list parameter and returns the correct list.

        System.out.println(putSaturn(planetList));
        // Expected output: "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"


    }

    public static String putSaturn(ArrayList<String> list){
        
        String outPuthino = "";
        String[] outList = new String[list.size()];
        list.add(5,"Saturn");
        outList = list.toArray(outList);


        for (int i = 0; i < outList.length ; i++) {

            if (i > 0) {
                outPuthino = outPuthino + " , " + outList[i];
            } else {
                outPuthino = outPuthino + outList[i];
            }
        }

        return outPuthino;
    }

}



