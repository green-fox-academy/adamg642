public class Bunny1 {
    // We have a number of bunnies and each bunny has two big floppy ears.
    // We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).


    public static void main(String[] args) {
        System.out.println(sumBunnyEars(2,16));
    }

    public static int sumBunnyEars(int bunnyNum,int counter){

        if (counter>1){
            counter--;
           return sumBunnyEars(bunnyNum+2,counter);
        }


        return bunnyNum;
    }
}
