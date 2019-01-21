public class DoubleItems {

    // - Create an array variable named `numList`
    //   with the following content: `[3, 4, 5, 6, 7]`
    // - Double all the values in the array

    static int[] numList = {3, 4, 5, 6, 7};

    public static int[] doubling (int[] inputArr){

        for (int i = 0; i<inputArr.length ; i++){
           inputArr[i] = inputArr[i]*2;
        }
        return  inputArr;
    }

    public  static void WRITE_OUT ( int[] inputArr2) {
        for (int numz:inputArr2) {
            System.out.print("  "+numz);
        }

    }

    public static void main(String[] args) {
        WRITE_OUT(doubling(numList));
    }
}
