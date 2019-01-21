public class PrintAll {
    // - Create an array variable named `numbers`
    //   with the following content: `[4, 5, 6, 7]`
    // - Print all the elements of `numbers`

    static int[] numbers = {4, 5, 6, 7};

    public static void main(String[] args) {
        for (int nums: numbers) {
            System.out.print(nums);
        }
    }
}
