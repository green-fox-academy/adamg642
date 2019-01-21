public class ChangeElement {
    // - Create an array variable named `s`
    //   with the following content: `[1, 2, 3, 8, 5, 6]`
    // - Change the 8 to 4
    // - Print the fourth element

    static int[] s = {1, 2, 3, 8, 5, 6};

    public static void main(String[] args) {
        s[3]= 4;
        System.out.print(s[3]);

    }
}
