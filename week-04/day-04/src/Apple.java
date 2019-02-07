import jdk.internal.dynalink.linker.LinkerServices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Apple {

    private String apple = "apple";

    public static void main(String[] args) {

        Apple applele = new Apple();
        System.out.println(applele.getApple());

        List<Integer> myList = new ArrayList(Arrays.asList(new Integer[]{3,4,5}));
      //  List<Integer> myList2 = new ArrayList<>();
       // List<Integer> myListw2 = new ArrayList();
       // applele.sum(myList);
        System.out.println( applele.sum(myList));

        }



    public int sum(List<Integer> inputList){
        if (inputList == null){
            return 0;
        }

        int sum = 0;
        for (Integer numbers : inputList
             ) {
            sum += numbers;
        }

        return sum;
    }


    public String getApple(){

        return apple;
    }

}
