public class Greet {

    //  From now on, create the usual class wrapper
    //  and main method on your own.

    // - Create a string variable named `al` and assign the value `Greenfox` to it
    // - Create a function called `greet` that greets it's input parameter
    // - Greeting is printing e.g. `Greetings dear, Greenfox`
    // - Greet `al`
    static String al = "GreenFox";
    public static void greet (String who){
        System.out.println("Greetings dear, "+ who);

    }

    public static void main(String[] args) {
        greet(al);

    }
}
