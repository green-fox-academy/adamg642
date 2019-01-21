import java.util.Scanner;

public class Sum {
    //  Create the usual class wrapper
    //  and main method on your own.

    // - Write a function called `sum` that sum all the numbers
    //   until the given parameter and returns with an integer

    public static int sum (){
        Scanner reader = new Scanner(System.in);

        int len = reader.nextInt();
        int a = 0;
        int basenum = 0;
        
        while ( a != len){
           int numToAdd = reader.nextInt();
           basenum = basenum + numToAdd;
           a++;
        }
        reader.close();
        return basenum;
    }

    public static void main(String[] args) {
        System.out.println(sum());
    }
}
