import jdk.internal.dynalink.linker.LinkerServices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Apple {

    private String apple = "apple";

    public static void main(String[] args) {

        Apple applele = new Apple();
        System.out.println(applele.getApple());
        System.out.println(applele.getApple().charAt(0));
        List<Integer> myList = new ArrayList(Arrays.asList(new Integer[]{3,4,5}));
      //  List<Integer> myList2 = new ArrayList<>();
       // List<Integer> myListw2 = new ArrayList();
       // applele.sum(myList);
        System.out.println( applele.sum(myList));
        System.out.println(applele.Annagram("sajt","sakk"));
        System.out.println(applele.countLetter("hello bello alma"));
        System.out.println(applele.fibonacciNum(4));

        }



    public int fibonacciNum (int index){
        //int fibonacciSequance = 0;
        int firsnum = 0;
        int secnum = 1;
        int  allSum = 0;

        for (int i = 0; i < index ; i ++){
            allSum = firsnum + secnum;
            firsnum = secnum;
            secnum = allSum;


        }


        return allSum;
    }


    public HashMap<Character,Integer> countLetter(String text){
        HashMap<Character,Integer> myDictionary = new HashMap<>();

        char[] charz = text.toCharArray();

        for (Character charr: charz
             ) {
            if (!myDictionary.containsKey(charr)){
                myDictionary.put(charr,1);

            }
            else {
                myDictionary.put(charr,myDictionary.get(charr)+1);
            }

        }

        return myDictionary;
    }





    public boolean Annagram (String firstString , String secondString){
        boolean myBoolean = false;
        if (firstString.charAt(0) == secondString.charAt(0)){

            return true;
        }
        else {
            return false;
        }



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
