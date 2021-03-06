import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class PrintEachLine {
    public static void main(String[] args) {
        // Write a program that opens a file called "my-file.txt", then prints
        // each line from the file.
        // If the program is unable to read the file (for example it does not exist),
        // then it should print the following error message: "Unable to read file: my-file.txt"
        fileReader();

    }

    public static void fileReader (){

        List<String> lines = new ArrayList<>();

        try{

            Path filePath = Paths.get("assets/my-file.txt");
            lines = Files.readAllLines(filePath);
            System.out.println(lines);
        }
        catch (Exception e){

            System.out.println("Unable to read file: my-file.txt");
        }

    }
}
