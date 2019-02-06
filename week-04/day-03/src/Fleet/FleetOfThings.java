package Fleet;



import java.util.Collections;

public class FleetOfThings {

    public static void main(String[] args) {
        Fleet fleet = new Fleet();
        // Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch

       // Collections.sort(fleet);
       // Collections.sort(fleet.things);
        Thing asd = new Thing("asd");
        Thing asd2 = new Thing("asd2");
        asd2.complete();
        Thing asd3 = new Thing("asd3");
        Collections.sort(fleet.things);
        fleet.things.add(asd);
        fleet.things.add(asd2);
        fleet.things.add(asd3);

        Collections.sort(fleet.things);
        System.out.println(fleet.toString());

    }
}
