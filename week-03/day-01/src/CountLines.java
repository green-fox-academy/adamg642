import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CountLines {
    public static void main(String[] args) {
        // Write a function that takes a filename as string,
        // then returns the number of lines the file contains.
        // It should return zero if it can't open the file, and
        // should not raise any error.

        fileLineCounter();

    }

    public static void fileLineCounter (){

        List<String> lines = new ArrayList<>();

        try{

            Path filePath = Paths.get("assets/my-file.txt");
            lines = Files.readAllLines(filePath);
            long lineCount = Files.lines(filePath).count();
            System.out.println(lineCount);
        }
        catch (Exception e){

            System.out.println(0);
        }

    }
}