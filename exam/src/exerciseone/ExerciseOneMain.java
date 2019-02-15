package exerciseone;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExerciseOneMain {
 //  List<Integer> arr = new ArrayList<>(Arrays.asList(3,4,9,2));


    public static void main(String[] args) {
       ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(3,5,6,2,9));
        ExerciseOneMain exerciseOneMain = new ExerciseOneMain();

       System.out.println(exerciseOneMain.arrPlusNthMultiplyMax(arr,1));

    }

    public ArrayList<Integer> arrPlusNthMultiplyMax(ArrayList<Integer> arr, int n){
        int helpNum = 0;
        ArrayList<Integer> newArr = new ArrayList<>();

        System.out.println(Collections.max(arr));
        newArr = arr;
        newArr.set(n,Collections.max(arr)*newArr.get(n));



        return newArr;
    }
}
