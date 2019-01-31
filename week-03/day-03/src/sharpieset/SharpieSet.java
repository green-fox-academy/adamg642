package sharpieset;
import java.util.List;
import java.util.ArrayList;
import sharpie.Sharpie;
import java.util.Iterator;


public class SharpieSet {
    public  List<Sharpie> sharpiesList2 ;
    

    public List<Sharpie> wat = new ArrayList<>();

    Sharpie sharpie5 = new Sharpie("black",144.2f,10);



    public SharpieSet (List<Sharpie> sharpiesList){
        this.sharpiesList2 = sharpiesList;

    }






public int countUsable(List<Sharpie> sharpiesList){
        int counter = 0;

        this.sharpiesList2 = sharpiesList;
        wat.add(sharpie5);



        Iterator<Sharpie> iter = sharpiesList.iterator();

        while (iter.hasNext()){
            Sharpie sharpie = iter.next();
            if (sharpie.inkAmount != 0){
                counter++;
            }

        }


        return counter;
}

public void removeTrash(List<Sharpie> sharpiesList){

    this.sharpiesList2 = sharpiesList;
    Iterator<Sharpie> iter = sharpiesList.iterator();

    while (iter.hasNext()){
        Sharpie sharpie = iter.next();
        if (sharpie.inkAmount == 0){
            iter.remove();
        }

    }
}


}
