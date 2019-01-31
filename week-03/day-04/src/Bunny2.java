public class Bunny2 {
    // We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
// (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
// have 3 ears, because they each have a raised foot. Recursively return the
// number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).


    public static void main(String[] args) {
        System.out.println(sumBunnyEars(0,5));

    }

    public static int sumBunnyEars(int bunnyNum,int counter){

        if (counter>0){

            if (counter%2 == 0){
                counter--;
            return sumBunnyEars(bunnyNum+2,counter);}
            else {
                counter--;
                return sumBunnyEars(bunnyNum+3,counter);
            }
        }


        return bunnyNum;
    }


}
