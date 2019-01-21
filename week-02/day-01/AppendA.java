public class AppendA {
    // - Create an array variable named `animals`
    //   with the following content: `["koal", "pand", "zebr"]`
    // - Add all elements an `"a"` at the end

    static String[] animals = {"koal", "pand", "zebr"};

    public  static void addA (String[] inp){
        for (int i = 0; i < animals.length ; i++){
            char a = 'a';
            inp[i] = inp[i] + a;
            System.out.print("  "+inp[i]);
        }
    }

    public static void main(String[] args) {
        addA(animals);
    }
}
