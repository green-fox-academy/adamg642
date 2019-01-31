package sharpieset;
import java.util.List;
import java.util.ArrayList;
import sharpie.Sharpie;

public class SharpiSetMain {
    //static List<Sharpie> sharpiesList = new ArrayList<>();
    public static void main(String[] args) {

        Sharpie sharpie = new Sharpie("black",4.2f,87.4f);
        Sharpie sharpie2 = new Sharpie("black",44.2f,0);
        Sharpie sharpie3 = new Sharpie("black",4.2f);
        Sharpie sharpie5 = new Sharpie("black",144.2f,10);

        List<Sharpie> sharpiesList = new ArrayList<>();

        SharpieSet listt = new SharpieSet(sharpiesList);


        sharpiesList.add(sharpie5);
        sharpiesList.add(sharpie);
        sharpiesList.add(sharpie3);
        sharpiesList.add(sharpie2);

        System.out.println(listt.countUsable(sharpiesList));

        for (Sharpie sharpzz:sharpiesList
             ) {

            System.out.println(sharpzz.inkAmount);

        }
        listt.removeTrash(sharpiesList);
        System.out.println("removing");
        for (Sharpie sharpzz:sharpiesList
        ) {
            System.out.println(sharpzz.inkAmount);

        }
        System.out.println(listt.countUsable(sharpiesList));


    }



}
