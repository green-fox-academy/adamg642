public class SumAll {

    // - Create an array variable named `ai`
    //   with the following content: `[3, 4, 5, 6, 7]`
    // - Print the sum of the elements in `ai`

    static int[] ai = {3, 4, 5, 6, 7};

    public static void main(String[] args) {
        int a = 0;
        for (int i = 0; i < ai.length ; i++){
            a = a +ai[i];

        }
        System.out.print(a);
    }
}
