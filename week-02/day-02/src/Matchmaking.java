import java.util.*;

public class Matchmaking{
    public static void main(String... args){
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Claire","Kat","Jane","Kate"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Tom","Todd","Neef"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // If someone has no pair, he/she should be the element of the list too
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

        System.out.println(makingMatches(girls, boys));
    }

    public static String makingMatches(ArrayList<String> gi ,ArrayList<String> bo){
        String outPutString = "";
        ArrayList<String> outPutList;
        ArrayList<String> endList;
        Integer lenght =0;
        int endLen = 0;

        if(gi.size() < bo.size()){
            lenght = gi.size();
            endList = bo;
            endLen = bo.size() - gi.size();
        }
        else{
            lenght = bo.size();
            endList = gi;
            endLen = gi.size() - bo.size();
        }
        for (int i = 0; i < lenght ; i++){
            outPutString = outPutString + gi.get(i)+" , " + bo.get(i)+" , ";
        }
        for (int j = 0 ; j < endLen ; j++  ){

            outPutString = outPutString +endList.get((endList.size()-j-1))+ " , ";
        }

        return outPutString;
    }


}
