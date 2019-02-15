package exerciseone;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExerciseOneMain {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(3, 5, 6, 2, 9));
        ExerciseOneMain exerciseOneMain = new ExerciseOneMain();
        System.out.println(exerciseOneMain.arrPlusNthMultiplyMax(arr, 1));

    }

    public ArrayList<Integer> arrPlusNthMultiplyMax(ArrayList<Integer> arr, int n) {
        int helpNum = arr.get(0);
        ArrayList<Integer> newArr = new ArrayList<>();

        for (int i = 0; i < arr.size(); i++) {
            if (i < arr.size() - 1) {
                if (arr.get(i) < arr.get(i + 1)) {
                    helpNum = arr.get(i + 1);
                    System.out.println(helpNum);
                }
            } else {
                if (helpNum < arr.get(i)) {
                    helpNum = arr.get(i);
                }
            }
        }
        System.out.println(helpNum);
        newArr = arr;
        newArr.set(n - 1, helpNum * newArr.get(n - 1));


        return newArr;
    }
}
