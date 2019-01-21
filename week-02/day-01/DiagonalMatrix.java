public class DiagonalMatrix {
    // - Create (dynamically) a two dimensional array
    //   with the following matrix. Use a loop!
    //
    //   1 0 0 0
    //   0 1 0 0
    //   0 0 1 0
    //   0 0 0 1
    //
    // - Print this two dimensional array to the output

    static int[][] myIntArray = new int[4][4];
    //static int[] myIntArray2 = new int[4];

    public static void main(String[] args) {
        for (int i = 0; i < myIntArray[0].length; i++){
            for (int j = 0; j < myIntArray[1].length; j++){
                if (i == j){
                    myIntArray[i][j]  = 1;

                    System.out.print( myIntArray[i][j]);

                }
                else {
                    myIntArray[i][j]  = 0;
                    System.out.print( myIntArray[i][j]);
                }


            }
            System.out.println();
        }
    }


}
