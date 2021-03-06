import jdk.management.resource.internal.inst.AbstractPlainDatagramSocketImplRMHooks;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.*;

public class AppleTest {


    @Test
    public void testApple(){
        Apple apple = new Apple();
        assertEquals(apple.getApple(),"apple");

    }

    @Test
    public void sumTest(){
        Apple apple = new Apple();
        List<Integer> mylist = new ArrayList(Arrays.asList(new Integer[]{3,4,5}));
        assertEquals(apple.sum(mylist),12);

    }
    @Test
    public void sumTestEmptyList (){
        Apple apple = new Apple();
        List<Integer> myList = new ArrayList<>();
        assertEquals(apple.sum(myList),0);

    }

    @Test
    public void sumTestOneElement (){
        Apple apple = new Apple();
        List<Integer> myList = new ArrayList(Arrays.asList(new Integer[]{3}));
        assertEquals(apple.sum(myList),3);

    }


    @Test
    public void sumTestNull (){
        Apple apple = new Apple();
        List<Integer> myList = new ArrayList(Arrays.asList(new Integer[]{3}));
        List<Integer> haha = new ArrayList<>();
        myList = null;
        assertEquals(apple.sum(haha),0);

    }

    @Test
    public void annagramTest(){
        Apple apple = new Apple();

        assertTrue(apple.Annagram("alma","angyal"));

    }

    @Test
    public void letterCounterTest(){
        Apple apple = new Apple();
        HashMap<Character,Integer> myHashMap = new HashMap<Character, Integer>(){{
            put('h',1);
            put('e',1);
            put('l',2);
            put('o',1);


        }};
        assertEquals(apple.countLetter("hello"),myHashMap);

    }



}
