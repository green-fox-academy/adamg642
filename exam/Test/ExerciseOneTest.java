import exerciseone.ExerciseOneMain;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class ExerciseOneTest {

    @Test
    public void arrPlusNthMultiplyMaxTest (){
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(3,5,6,2,9));
        ArrayList<Integer> arrTest = new ArrayList<Integer>(Arrays.asList(3,45,6,2,9));
        ExerciseOneMain exerciseOneMain = new ExerciseOneMain();
        assertEquals(exerciseOneMain.arrPlusNthMultiplyMax(arr,2),arrTest);

    }


    @Test
    public void arrPlusNthMultiplyMaxTest2 (){
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(0, 1, 5, 4));
        ArrayList<Integer> arrTest = new ArrayList<Integer>(Arrays.asList(0, 1, 25, 4));
        ExerciseOneMain exerciseOneMain = new ExerciseOneMain();
        assertEquals(exerciseOneMain.arrPlusNthMultiplyMax(arr,3),arrTest);

    }

}