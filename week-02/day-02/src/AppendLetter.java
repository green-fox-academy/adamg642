import java.util.*;

public class AppendLetter{
    public static void main(String... args){
        List<String> far = Arrays.asList("bo", "anacond", "koal", "pand", "zebr");
        // Create a method called "appendA()" that adds "a" to every string in the "far" list.
        // The parameter should be a list.

        System.out.println(appendA(far));


    }

    public static String appendA (List<String> li){
        String outPut = "";
        for (int i = 0; i < li.size() ; i++){
            outPut = outPut +" , "+ li.get(i)+"a";
        }

        return outPut;
    }

}
