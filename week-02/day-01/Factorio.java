public class Factorio {
    //  Create the usual class wrapper
    //  and main method on your own.

    // - Create a function called `factorio`
    //   that returns it's input's factorial
    public static int factorio (int inputNum){
        int factoredNum = 1;

        for (int i = 1; i <= inputNum ; i++){

            factoredNum *= i;

        }

        return  factoredNum;
    }
    public static void main(String[] args) {

        System.out.println(factorio(5));
        
    }


}
